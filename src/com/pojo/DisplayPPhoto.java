package com.pojo;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletResponse;

public class DisplayPPhoto {
	int id;
	
	public DisplayPPhoto(int id) {
		super();
		this.id = id;
	}
	
	public void displayPhoto(HttpServletResponse response)
	{
		try {
			
			Connection con=MysqlConnection.getConnect();
			
			String sql="select image from product where pid=?";
			
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
            rs.next();
            
            Blob b = rs.getBlob("image");
            
            
            response.setContentType("image/jpeg");
            response.setContentLength((int) b.length());
            InputStream is = b.getBinaryStream();
            OutputStream os = response.getOutputStream();
            byte buf[] = new byte[(int) b.length()];
            is.read(buf);
            os.write(buf);
            os.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
		    System.out.println(e);
		}
	}
	

}
