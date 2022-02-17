package com.ram.javabrains;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.pojo.Product;
import com.pojo.ProductCurd;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * Servlet implementation class AddFarmProduct
 */

@MultipartConfig(maxFileSize = 16177215)
public class AddFarmProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFarmProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,ParseException {
		// TODO Auto-generated method stub
	
		 PrintWriter pw=response.getWriter();
			
			String type=request.getParameter("type");
			
			String pname=request.getParameter("pname");
			
			int qavailable=Integer.parseInt(request.getParameter("qavailable"));
			
			double ppkg=Double.parseDouble(request.getParameter("ppkg"));
			
			
			HttpSession session=request.getSession();
			String email=(String)session.getAttribute("email");
			
			System.out.println(email);
			
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd" );  // United States style of format.
	           java.util.Date myDate=null;
			try {
				myDate = format.parse(timeStamp);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           java.sql.Date sqlDate = new java.sql.Date( myDate.getTime());
			
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
	        
	        
	       Product p=new Product(type, pname, qavailable, ppkg, inputStream, email,sqlDate);
	       
	       ProductCurd pc=new ProductCurd();
	       
	       int x=pc.addProduct(p);
	       
	       if(x==1)
			{
				  pw.println("<script> alert('Product Added Successfully');");
				  pw.println("window.location = \"AddFarmProduct.jsp\";</script>");
			
			}
			else
			{
				  pw.println("<script> alert('Product Added');");
				  pw.println("window.location = \"AddFarmProduct.jsp\";</script>");
			
			}
		    
	}

}
