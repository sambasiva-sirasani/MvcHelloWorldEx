package com.siva;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/show")
	public String show() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String show1() {
		return "register";
	}

}
