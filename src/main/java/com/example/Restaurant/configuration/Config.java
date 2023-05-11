package com.example.Restaurant.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/restables").setViewName("restables");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/reservation").setViewName("reservation");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/css/styles").setViewName("style");
    }

}
