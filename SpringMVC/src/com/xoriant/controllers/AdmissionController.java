package com.xoriant.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.xoriant.dao.*;
import com.xoriant.dto.*;

@Controller
public class AdmissionController {
	ApplicationContext context;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	
	@RequestMapping(value="/submitForm", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute ("user") User user) {
		ModelAndView modelAndView = new ModelAndView("submitForm");
		
		context = new ClassPathXmlApplicationContext("beans.xml");
		LoginDao lo = (LoginDao)context.getBean("loginDaoImpl");
		
	
		if(lo.register(user)) {
			modelAndView.addObject("msg", "Hello"+user);
		}
		
		
		return modelAndView;
	}
	

}
