package com.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class OrderCurd {

	
	
	public ArrayList<OrdersInfo> viewProduct(String email)
	{
		try {
			
			ArrayList<OrdersInfo> al=new ArrayList<OrdersInfo>();
			Connection con=MysqlConnection.getConnect();
			
			String sql="select * from orders where email=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1, email);
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{
			     
			     
			     int oid=rs.getInt(1);
			     
			     int pid=rs.getInt(2);
			 
			     String ema=rs.getString(3);
			     
			     String femail=rs.getString(4);
			     
			     OrdersInfo oi=new OrdersInfo(oid, email, pid,femail);
			     
			     al.add(oi);
			}
			rs.close();
			con.close();
			
			return al;
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		return null;
	}
}
