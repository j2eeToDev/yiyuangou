package org.yigou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yigou.model.Member;

@Controller
@RequestMapping(value="/member")
public class MemberController {

	@ResponseBody
	@RequestMapping(value="register",method=RequestMethod.POST)
	public ModelMap register(@RequestBody Member member,HttpServletRequest req){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("object", member);
		modelMap.addAttribute("success", true);
		modelMap.addAttribute("msg", "注册成功");
		 HttpSession session = req.getSession();
	     System.out.println("member="+session.getId());
		return modelMap;
	}
}
