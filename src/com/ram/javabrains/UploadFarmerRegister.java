package com.ram.javabrains;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.pojo.Farmer;
import com.pojo.FarmerCurd;

/**
 * Servlet implementation class UploadFarmerRegister
 */
@MultipartConfig(maxFileSize = 16177215)
public class UploadFarmerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFarmerRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	
	    response.setContentType("text/html");
	    
	    PrintWriter pw=response.getWriter();
		
		String uname=request.getParameter("uname");
		
		String email=request.getParameter("email");
		
		String password=request.getParameter("password");
		
		String gender=request.getParameter("gender");
		
		String phone=request.getParameter("phone");
		
		String address=request.getParameter("address");
		
		InputStream inputStream = null; // input stream of the upload file
        
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("image");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        
        Farmer f=new Farmer(uname,email,password,gender,phone,address,inputStream);
        FarmerCurd fc=new FarmerCurd();
       int x= fc.addFarmer(f);
       
       if(x==1)
		{
			  pw.println("<script> alert(' Registration Successfully');");
			  pw.println("window.location = \"fregister.jsp\";</script>");
		
		}
		else
		{
			  pw.println("<script> alert('your email is already register');");
			  pw.println("window.location = \"fregister.jsp\";</script>");
		
		}
	        
        
         
	}

}
