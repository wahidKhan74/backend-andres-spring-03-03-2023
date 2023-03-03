package com.bahiazone.bahiazone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String indexMapping() {
		
		return "Server is up and running";
	}

}
