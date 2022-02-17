package com.pojo;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {

	
	public static Connection getConnect() {
		try {
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver()) ;
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmdirect","root","");
			
			return con;
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		return null;
	}
}
