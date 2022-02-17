package com.ram.javabrains;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.DisplayFPhoto;
import com.pojo.DisplayPPhoto;
import com.pojo.DisplayVPhoto;

/**
 * Servlet implementation class DisplayVendorPhoto
 */
public class DisplayVendorPhoto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayVendorPhoto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		
		int id=(Integer)session.getAttribute("id");
		
		System.out.println("The id is "+id);
		
		DisplayVPhoto df=new DisplayVPhoto(id);
		
		df.displayPhoto(response);
		
		
		
		
	}

}
