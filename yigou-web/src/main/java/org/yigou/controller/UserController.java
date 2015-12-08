package org.yigou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yigou.model.User;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public User login(){
		User user = new User();
		user.setUserName("小二");
		user.setPassword("123456789");
		user.setStatus(1);
		
		return user;
	}
}
    