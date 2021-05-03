package com.green.jdev010.CoffeeMintClient.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeMintClientController {

	@GetMapping("/login")
	public String showLoginView() {
		
		return "login";
	}
}
