package com.ram.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Product;
import com.pojo.ProductCurd;

/**
 * Servlet implementation class DeleteProduct
 */
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	    PrintWriter pw=response.getWriter();
	       
	    int id=Integer.parseInt(request.getParameter("id"));
	    
	    ProductCurd pc=new ProductCurd();
	    
	    int x=pc.deleteProduct(id);
	    
	    if(x==1)
		{
			  pw.println("<script> alert('Product Deleted Successfully');");
			  pw.println("window.location = \"ViewProduct.jsp\";</script>");
		
		}
		else
		{
			  pw.println("<script> alert('Product not Deleted');");
			  pw.println("window.location = \"ViewProduct.jsp\";</script>");
		
		}
	    
	    
	    
	}

}
