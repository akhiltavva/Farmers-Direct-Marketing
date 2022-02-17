package com.ram.javabrains;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.MysqlConnection;

/**
 * Servlet implementation class SentMessage
 */
public class SentMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SentMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	     PrintWriter pw=response.getWriter();
	     
	         int pid= Integer.parseInt(request.getParameter("pid"));
	         String email=request.getParameter("email");
	         String femail=request.getParameter("femail");
	         
	     try {
	    	 Connection con=MysqlConnection.getConnect();
	    	 
	    	 
	    	 String sql1="select * from orders where pid=? and email=?";
	    	 
	    	 PreparedStatement pst1=con.prepareStatement(sql1);
	    	 
	    	 pst1.setInt(1, pid);
	    	 pst1.setString(2, email);
	    	 
	    	 ResultSet rs=pst1.executeQuery();
	    	 int y=0;
	    	 if(rs.next())
	    	 {
	    	     y=1;
	    	 } 
	    	 if(y==0)
	    	 {
	    	 String sql="insert into orders(pid,email,femail) values(?,?,?)";
	    	 
	    	 System.out.println(sql);
	    	 
	    	 PreparedStatement pst=con.prepareStatement(sql);
	    	 
	    	 pst.setInt(1, pid);
	    	 pst.setString(2, email);
	    	 pst.setString(3,femail);
	    	 
	    	 int x=pst.executeUpdate();
	    	 con.close();
	    	 if(x==1)
				{
					  pw.println("<script> alert('order Added Successfully');");
					  pw.println("window.location = \"ViewAllProduct.jsp\";</script>");
				
				}
				else
				{
					  pw.println("<script> alert('order not Added');");
					  pw.println("window.location = \"ViewAllProduct.jsp\";</script>");
				
				}
	    	 }
	    	 else
	    	 {
	    		 con.close();
	    		 
	    		  pw.println("<script> alert('You Already sent a message');");
				  pw.println("window.location = \"ViewAllProduct.jsp\";</script>");
	    		 
	    	 }
	    	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
			
		}
		
	}

}
