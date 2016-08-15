package com.jy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FriendController extends BaseController {
	
	@RequestMapping(value="/friends")
	public ModelAndView getGroups(){
		
		return new ModelAndView("friend/friendList");
	}

}
