package com.bitacademy.jblog.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bitacademy.jblog.service.TestService;
import com.bitacademy.jblog.vo.User;

@Controller
@RequestMapping("/test")
public class TestController {
	
	final static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	TestService service;
	
	
	@RequestMapping("/string")
	public String string() {
		logger.trace("/test/string : trace");
		logger.info("/test/string : info");
		
		return "test/string";
	}

	@RequestMapping("/modelandview")
	public ModelAndView modelandview() {
		logger.trace("/test/modelandview : trace");
		logger.info("/test/modelandview : info");

		ModelAndView mav = new ModelAndView();
		User user = new User("somy", "박소미", "somypass");
		mav.addObject("message", "Hello modelAndView");
		mav.addObject("user", user);
		mav.setViewName("test/modelandview");
		return mav;
	}

	@RequestMapping(value="/model", method = RequestMethod.GET) // RequestMethod.POST
	public String model(Model model) {
		logger.trace("/test/model : trace");
		logger.info("/test/model : info");

		//	게시물 목록 받아오기
		List<User> list = getAllUser();
		//	모델에 실어서 View로 전달
		model.addAttribute("list", list);
		//logger.debug("게시물 목록:" + list);
		return "test/model";
	}
	
	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		
		User user = new User("Somy", "박소미", "1234");
		user.setUserNo(1);
		user.setJoinDate(new Date());
		list.add(user);
	
		user = new User("min", "이경민", "5678");
		user.setUserNo(2);
		user.setJoinDate(new Date());
		list.add(user);
		
		user = new User("bin", "현수빈", "1357");
		user.setUserNo(3);
		user.setJoinDate(new Date());
		list.add(user);
		
		return list;
	}
	

	@RequestMapping(value="/users", method = RequestMethod.GET) // RequestMethod.POST
	public String users(Model model) {
		logger.trace("/test/users : trace");
		logger.info("/test/users : info");

		//	게시물 목록 받아오기
		List<User> list = service.getAllUser();
		//	모델에 실어서 View로 전달
		model.addAttribute("list", list);
		//logger.debug("게시물 목록:" + list);
		return "test/model";
	}

	
}
