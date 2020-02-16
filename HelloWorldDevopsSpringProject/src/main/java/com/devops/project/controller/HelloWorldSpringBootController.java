package com.devops.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldSpringBootController {

	@RequestMapping(value="/devops")
	public String hello() {
	return "This is My Hello World Spring Application for DEVOPS Project" ;
	}
}
