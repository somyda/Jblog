package com.bitacademy.jblog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitacademy.jblog.service.UserService;
import com.bitacademy.jblog.vo.User;


@Controller
@RequestMapping("/user")
public class UserController {
	final static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService service;
	
	// 화면
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String join() {
		logger.info("/user/join : info");
		
		return "users/joinform";
	}
	
	
	// 가입 처리
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinAction(
			@RequestParam("userName") String userName,
			@RequestParam("id")       String id,
			@RequestParam("password") String password,
			Model model	               //	View에 전달할 데이터 객체
			) {
		User user = new User(id, userName, password);
		logger.debug("Form 전송된 데이터:" + user);

		//	폼 검증 결과 확인
//		if (result.hasErrors()) {	//	폼 검증에 에러 발견
//			List<ObjectError> errors = result.getAllErrors();
//			for (ObjectError e: errors) {
//				logger.error("Valid Error:" + e);
//			}
//			logger.debug("result:" + result.getModel());
//			model.addAllAttributes(result.getModel());
//			return "users/joinform";
//		}
		boolean success = service.join(user);

		if (success) { // insert 성공
			logger.debug("가입 성공!");
			return "redirect:/user/joinsuccess";
		} else {
			logger.error("가입 실패!");
			return "redirect:/user/join"; // 가입 폼으로 다시 돌려보냄
		}
	}

	// 성공 화면
	@RequestMapping("/joinsuccess")
	public String joinSuccess() {
		return "users/joinsuccess";
	}

}
