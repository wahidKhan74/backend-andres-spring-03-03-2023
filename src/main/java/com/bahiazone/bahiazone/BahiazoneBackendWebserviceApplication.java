package com.bahiazone.bahiazone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bahiazone.bahiazone.controller.HomeController;


@SpringBootApplication
@ComponentScan(basePackageClasses=HomeController.class)
public class BahiazoneBackendWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BahiazoneBackendWebserviceApplication.class, args);
		
		
	}

}
