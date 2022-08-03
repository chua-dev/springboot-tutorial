package com.springboot.tutorial.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// This annotation enables Auto Configuration, Component Scanning, Additional configuration
// Include 3 annotation, @EnableAutoConfiguration, @ComponentScan, @Configuration
@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		
		// SpringApplication use to bootstrap the SpringBoot App
		// SpringApplication creates application context, registers all beans, start the tomcat server
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
