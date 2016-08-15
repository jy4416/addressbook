package com.jy.servlet;

import java.io.IOException;
import java.util.List;

import com.jy.domain.Group;
import com.jy.service.GroupService;
import com.jy.service.GroupServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Servlet implementation class GroupServlet
 */
public class GroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 @Autowired
	private GroupService groupService;
       
	
	 public void init(ServletConfig config){
	    	//groupService=new GroupServiceImpl();
	    	
	    	//使用注解
	    	SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
	    	         config.getServletContext());
	    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GroupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Group> list=groupService.getGroups();
		request.setAttribute("groups", list);
		request.getRequestDispatcher("groups.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
