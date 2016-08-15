package com.jy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jy.domain.Group;
import com.jy.util.DBUtil;

@Repository
public class GroupDaoImpl implements GroupDao {
	
	public List<Group> findAll(){
		List<Group> list=new ArrayList();
		Connection conn=DBUtil.getConnection();
		String sql="select * from fgroup";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				Group g=new Group();
				g.setgId(rs.getInt("gid"));
				g.setgName(rs.getString("gname"));
				g.setgDetail(rs.getString("gdetail"));
				list.add(g);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
}
