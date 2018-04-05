package com.santhosh.projects.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication  
@ComponentScan(basePackages="com.santhosh.projects.swagger") 
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(Application.class, args);

	}

}
