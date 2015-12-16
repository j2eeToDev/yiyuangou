package org.yigou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yigou.model.User;
import org.yigou.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	IUserService userService;
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelMap login(@RequestBody User user) {
		user = userService.invalideUser(user);
		ModelMap model = new ModelMap();
		if(user==null){
			model.addAttribute("success", false);
			model.addAttribute("msg", "用户不存在！");
		}else{
			model.addAttribute("success", true);
			model.addAttribute("msg", "");
			model.addAttribute("object", user);
		}
		return model;
	}

}
