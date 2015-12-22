package org.yigou.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yigou.model.User;
import org.yigou.service.IUserService;
import org.yigou.utils.Constant;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	IUserService userService;
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelMap login(@RequestBody User user,HttpServletRequest request,HttpServletResponse rsp) {
		user = userService.invalideUser(user);
		ModelMap model = new ModelMap();
		if(user==null){
			model.addAttribute("success", false);
			model.addAttribute("msg", "用户不存在！");
			
		}else{
			model.addAttribute("success", true);
			model.addAttribute("msg", "");
			model.addAttribute("object", user);
			setCookie(request,rsp);
		}
		
		return model;
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getCurrentUser", method = RequestMethod.GET)
	public ModelMap getCurrentUser(){
		ModelMap mm = new ModelMap();
		mm.addAttribute("success", true);
		return mm;
	}
	
	private void setCookie(HttpServletRequest req,HttpServletResponse rsp) {
		 Cookie cookie = new Cookie(Constant.PLATFORM_SESSION_ID_KEY, req.getSession().getId());
        cookie.setMaxAge(-1);
        cookie.setPath("/");
        rsp.addCookie(cookie);
		
	}


}
