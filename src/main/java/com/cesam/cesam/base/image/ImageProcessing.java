package com.cesam.cesam.base.image;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

public class ImageProcessing {

	public static boolean  saveImage(MultipartFile file,String folder, String name) {
		boolean save = true;
		if(file.isEmpty())
			save = false;
		else {
			try {
				byte[] bytes = file.getBytes();
	            Path path = Paths.get(folder + name);
	            Files.write(path, bytes);
				
			} catch (Exception e) {
				save = false;
			}
		}
		return save;
	}
}
