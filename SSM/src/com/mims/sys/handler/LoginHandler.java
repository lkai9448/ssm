package com.mims.sys.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mims.sys.service.UserService;
import com.mims.sys.vos.UserVO;

@Controller
public class LoginHandler {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(UserVO userVO, ModelAndView modelAndView) {
		
		userVO = userService.login(userVO.getUsername(), userVO.getPassword());
		
		modelAndView.setViewName("success");
		modelAndView.addObject("user", userVO);
		
		return modelAndView;
	}
}
