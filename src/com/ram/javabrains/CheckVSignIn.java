package com.ram.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Farmer;
import com.pojo.FarmerCurd;
import com.pojo.Vendor;
import com.pojo.VendorCurd;

/**
 * Servlet implementation class CheckVSignIn
 */
public class CheckVSignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckVSignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
 response.setContentType("text/html");
		 
	     PrintWriter pw=response.getWriter();
	     
	     String email=request.getParameter("email");
	     
	     String password=request.getParameter("password");
	     
	     System.out.println("The email is "+email);
	     
	     System.out.println("The password is "+password);
	     
	     Vendor v=new Vendor();
	     
	     v.setEmail(email);
	     
	     v.setPassword(password);
	     
	     
	     VendorCurd vc=new VendorCurd();
	     
	     
	     int x=vc.checkSignIn(v);
	     
	     if(x!=0)
	     {
	     HttpSession session=request.getSession();
	     
	     session.setAttribute("email", email);
	     session.setAttribute("id", x);
	     
		  pw.println("<script> alert(' Login Successfully');");
		  
		  pw.println("window.location = \"VendorHomeFarmer.jsp\";</script>");
	
	     
	     }
	     else
	     {
	    	 
	    	 pw.println("<script> alert(' Login Failed');");
			  
			  pw.println("window.location = \"Vlogin.jsp\";</script>");
		
	    	 
	     }

	
	}

}
