package com.cesam.cesam.web.controllers.organisation.humain.community;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cesam.cesam.web.data.organisation.humain.request.member.CommunityRequest;

@RestController("/api/community")
public class CommunityController {

	@GetMapping("")
	public void getAllCommunities() {
		
	}
	
	@PostMapping()
	public void addCommunity(@RequestBody CommunityRequest member){
	
		
	}
	
	@PutMapping("/{username}")
	public void updateCommunity(@RequestBody CommunityRequest member) {
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCommunity(){
		
	}
	
	@GetMapping("/search/")
	public void searchCommunity(){
		
	}
	
	@GetMapping("/community.member/{id}")
	public void getCommunityMember(@RequestParam Long id){
		
	}

}
