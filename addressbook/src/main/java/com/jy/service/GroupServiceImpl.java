package com.jy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.dao.GroupDao;
import com.jy.dao.GroupDaoImpl;
import com.jy.domain.Group;

@Service
public class GroupServiceImpl implements GroupService{

	 @Autowired
	private GroupDao groupDao;
	
	
	public List<Group> getGroups() {
	
		return groupDao.findAll();
	}

}
