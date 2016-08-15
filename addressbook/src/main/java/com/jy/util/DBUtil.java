package com.jy.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String uid="root";
			String pwd="root";
			String url="jdbc:mysql://localhost:3306/addressbook?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
			conn=DriverManager.getConnection(url,uid,pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}

}
