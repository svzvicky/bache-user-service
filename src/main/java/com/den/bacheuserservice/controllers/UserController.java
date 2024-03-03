package com.den.bacheuserservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/v1/")
public class UserController {

	private String TEST_MESSAGE = "This is response from user service";
	
	@GetMapping
	public String getUser() {
		return TEST_MESSAGE;
	}
	
}
