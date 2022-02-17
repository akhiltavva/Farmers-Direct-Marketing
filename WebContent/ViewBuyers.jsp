<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.pojo.MysqlConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.pojo.DisplayPPhoto"%>
<%@page import="com.pojo.Product"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.pojo.ProductCurd"%>
<%@page import="java.util.ArrayList"%>
<%@ include file = "header1.jsp" %>   

    		
		<section class="ftco-section ftc-no-pb">
			<div class="cotainer" >
        <div class="row justify-content-center">
            <div class="col-md-8" >
            
              <%
               String email=(String)session.getAttribute("email");
              
               System.out.println("The email id is"+email);
              
               Connection con=MysqlConnection.getConnect();
               
               String sql="select orders.pid,vregister.vid, vregister.uname,vregister.email,vregister.gender,vregister.phone,vregister.address from orders,vregister where orders.femail=? and orders.email=vregister.email";
               
               
               PreparedStatement pst=con.prepareStatement(sql);
               
               pst.setString(1, email);
               
              %>
             <table class="table table-striped" style="background-color:orange;">
             
              <tr>
                      <th>Product ID</th>
                      <th>Vendor Name</th>
                      <th>Vendor Email</th>
                      <th>Vendor Gender</th>
                      <th>Vendor Phone</th>
                      <th>Vendor Address</th>
                      
                  </tr>
                  
                  <%
                  
                           ResultSet rs=pst.executeQuery();
                  
                       
                  
                        while(rs.next()){
                        	
                        	
                        	
                  %>
                            <tr>
                              <td><%=rs.getString(1) %></td>
                               
                               <td><%=rs.getString(3) %></td>
                               
                                 <td><%=rs.getString(4) %></td>
                                 
                                 <td><%=rs.getString(5) %></td>
                                 
                                 <td><%=rs.getString(6) %></td>
                                 
                                 <td><%=rs.getString(7) %></td>
                                 
                                
                                       </tr>
                  <%
                        }
                        
                        con.close();
                   %>
             </table>
             </div>
        </div>
        </div>

		</section>


<%@ include file="footer.jsp" %>