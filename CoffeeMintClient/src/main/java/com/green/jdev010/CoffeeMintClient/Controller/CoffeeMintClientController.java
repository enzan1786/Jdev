package com.green.jdev010.CoffeeMintClient.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeMintClientController {
	@RequestMapping("/")
	public String homePage(Model model) {
		return "index";
	}
	@RequestMapping("/login")
	public String Login(Model model) {
		return "Login";
	}
}
