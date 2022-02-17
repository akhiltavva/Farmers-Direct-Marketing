package com.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class FarmerCurd {

	
	
	public int addFarmer(Farmer f) {
		
		
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			String sql="insert into fregister(uname,email,password,gender,phone,address,image) values(?,?,?,?,?,?,?)";
			
			
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1, f.getUname());
			pst.setString(2, f.getEmail());
			pst.setString(3, f.getPassword());
			pst.setString(4, f.getGender());
			pst.setString(5, f.getPhone());
			pst.setString(6, f.getAddress());
			pst.setBlob(7, f.getInputStram());
			
			int x=pst.executeUpdate();
			
			
			
			pst.close();
			con.close();
			
			return x;
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		return 0;
		
	}
	
	public int checkSignIn(Farmer f)
	{
		
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			String sql="select * from fregister where email=? and password=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1,f.getEmail());
			
			pst.setString(2, f.getPassword());
			
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
