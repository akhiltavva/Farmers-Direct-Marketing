package com.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendorCurd {

	
	public int addVendor(Vendor v)
	{
		
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			
			String sql="insert into vregister(uname,email,password,gender,phone,address,image) values(?,?,?,?,?,?,?)";
			
			System.out.println(v.getUname());
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1, v.getUname());
			pst.setString(2,v.getEmail());
			pst.setString(3, v.getPassword());
			pst.setString(4, v.getGender());
			pst.setString(5, v.getPhone());
			pst.setString(6, v.getAddress());
			pst.setBlob(7, v.getInputSteram());
			
			int x=pst.executeUpdate();
			
			pst.close();
			
			con.close();
			
			return x;
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		
		return 0;
	}
	
	public int checkSignIn(Vendor v)
	{
		
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			String sql="select * from vregister where email=? and password=?";
			
			System.out.println(sql);
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1,v.getEmail());
			
			pst.setString(2, v.getPassword());
			
			ResultSet rs=pst.executeQuery();
			
			int x=0;
			
			
			if(rs.next())
			{
				x=rs.getInt(1);
				
				
			}
			
			
			rs.close();
			
			pst.close();
			
			con.close();
			
			return x;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		
		return 0;
	}
	
	

	
}
