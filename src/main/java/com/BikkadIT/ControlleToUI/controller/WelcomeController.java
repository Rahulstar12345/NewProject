package com.BikkadIT.ControlleToUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/WelComeMsg")
	public ModelAndView WelComeMsg() {
		String msg = "Welcome To BikkadIT Guys";

		ModelAndView mav = new ModelAndView();
		mav.addObject("MSG", msg);
		mav.setViewName("Wel");
		return mav;

	}

}
