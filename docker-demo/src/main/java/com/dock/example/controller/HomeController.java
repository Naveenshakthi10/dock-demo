package com.dock.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dock-home")
public class HomeController {
	
	@GetMapping("/get")
	public String getHome() {
		return "Home Controller is Running";
		
	}

}
