package com.yunker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcome")
public class WelComeController {

	@GetMapping
	public String getWelcomePage(Model model){
		model.addAttribute("welcome", "Welcome to my errand box !!!");
		return "welcome";
	}
	
	
}
