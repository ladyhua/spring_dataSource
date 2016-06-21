package com.spring.persistence;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;
@Component("userPersistence")
public class UserPersistence {
	private BasicDataSource dataSource;
	public void addUser(){
		try {
			Connection conn=dataSource.getConnection();
			conn.createStatement().executeUpdate("insert into user values(null,'lisi')");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BasicDataSource getDataSource() {
		return dataSource;
	}
	
	@Resource(name="dataSource")
	public void setDataSource(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}
