package com.jy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jy.domain.Group;
import com.jy.service.GroupService;

@Controller

public class GroupController extends BaseController{
	
	@Autowired
	private GroupService groupService;
	
	@RequestMapping(value="/groups")
	public String getGroups(HttpServletRequest request){
		List<Group> list=groupService.getGroups();
		request.setAttribute("group", list);
		return "group/groupList";
	}
	
	
	
	
	
	
	
	
	
}
