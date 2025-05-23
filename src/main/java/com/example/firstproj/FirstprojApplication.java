package com.example.firstproj;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@SpringBootApplication
public class FirstprojApplication {


	public static void main(String[] args) {
		 ApplicationContext context =  SpringApplication.run(FirstprojApplication.class, args);
		
	}

}
