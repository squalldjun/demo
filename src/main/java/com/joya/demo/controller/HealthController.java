package com.joya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/")
	public String getDefaultHealcheck() {
		return "microservice is running . . .";
	}

	@GetMapping("/healthcheck")
	public String gettHealcheck() {
		return "microservice is running . . .";
	}
}
