package com.bitacademy.jblog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@RequestMapping("/dashboard")
	public ModelAndView dashboard() {
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	
	@RequestMapping(value="boardwrite",method = RequestMethod.GET)
	public ModelAndView boardwrite() {
		ModelAndView mav = new ModelAndView();
		return mav;
	}

}
