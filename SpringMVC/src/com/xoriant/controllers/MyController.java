package com.xoriant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.servlet.ModelAndView;



public class MyController {
	
	@RequestMapping("/hello")
	public ModelAndView syaHello() {
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	
	@RequestMapping("/hi")
	public ModelAndView syaHi() {
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("msg","Welcome");
		return modelAndView;
	}
	
	

}
