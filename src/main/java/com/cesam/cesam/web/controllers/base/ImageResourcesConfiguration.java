package com.cesam.cesam.web.controllers.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ImageResourcesConfiguration implements WebMvcConfigurer {

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:src/main/resources/static");
    }
}
