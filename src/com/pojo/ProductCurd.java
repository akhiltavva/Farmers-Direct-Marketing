package com.pojo;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProductCurd {

	
	public int addProduct(Product p) {
		
		
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			String sql="insert into product(type,pname,qavailable,ppkg,image,email,date) values(?,?,?,?,?,?,?)";
			
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1,p.getPtype());
            
            pst.setString(2, p.getPname());
            
            pst.setInt(3, p.getQavailable());
            
            pst.setDouble(4, p.getPpkg());
            
            pst.setBlob(5, p.getInputStream());
            
            
            pst.setString(6,p.getEmail());
            
            
            pst.setDate(7, p.getSqlDate());
            
            
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
	
	public ArrayList<Product> viewProduct(){
		
		
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			String sql="select * from product ";
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			ResultSet rs=pst.executeQuery();
			
			ArrayList<Product> al=new ArrayList<Product>();
			
			while(rs.next())
			{
				int pid=rs.getInt(1);
				
				String ptype=rs.getString(2);
				
				String pname=rs.getString(3);
				
				
				int qavailable=rs.getInt(4);
				
				double ppkg=rs.getDouble(5);
				
				//InputStream inputStream=(InputStream) rs.getBlob(6);
                
				String email=rs.getString(7);
				
				Date sqlDate=rs.getDate(8);
				
				Product product=new Product(pid, ptype, pname, qavailable, ppkg, null, email, sqlDate);
				
				
				al.add(product);
				
				
				
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

    public ArrayList<Product> viewProduct(String em){
		
		
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			String sql="select * from product where email='"+em+"'";
			
			System.out.println(sql);
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			ResultSet rs=pst.executeQuery();
			
			ArrayList<Product> al=new ArrayList<Product>();
			
			while(rs.next())
			{
				int pid=rs.getInt(1);
				
				String ptype=rs.getString(2);
				
				String pname=rs.getString(3);
				
				
				int qavailable=rs.getInt(4);
				
				double ppkg=rs.getDouble(5);
				
				
                
				String email=rs.getString(7);
				
				Date sqlDate=rs.getDate(8);
				
				Product product=new Product(pid, ptype, pname, qavailable, ppkg, null, email, sqlDate);
				
				
				al.add(product);
				
				
				
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
    
    public int deleteProduct(int id)
    {
    	
    	try {
			
    		
    		Connection con=MysqlConnection.getConnect();
    		
    		String sql="delete from product where pid="+id;
    		
    		PreparedStatement pst=con.prepareStatement(sql);
    		
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

}
