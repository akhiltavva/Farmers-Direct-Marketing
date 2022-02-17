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
              
               ProductCurd pc=new ProductCurd();
              
               ArrayList<Product> al=pc.viewProduct(email);
              %>
             <table class="table table-striped" style="background-color:orange;">
             
              <tr>
                      <th>Product Id</th>
                      <th>Product name</th>
                      <th>Quantity</th>
                      <th>Per Kg</th>
                      <th>Image</th>
                      <th>Date</th>
                      <th>Delete</th>
                      
                  </tr>
                  
                  <%
                        Iterator<Product> it=al.iterator();
                  
                        while(it.hasNext()){
                        	
                        	
                        	Product p=it.next();
                  %>
                            <tr>
                              <td><%=p.getPid()%></td>
                              <td><%=p.getPname() %></td>
                               
                               <td><%=p.getQavailable() %></td>
                               
                                 <td><%=p.getPpkg()%></td>
                                 
                                
                                  <td><img src='<%="DisplayProductImage?id="+p.getPid() %>' width="100px" height="100px" /></td>
                                   
                                  <td><%=p.getSqlDate()%></td>
                                  <td><a href='<%="DeleteProduct?id="+p.getPid() %>'>Delete</a></td>
                            </tr>
                  <%
                        }
                   %>
             </table>
             </div>
        </div>
        </div>

		</section>


<%@ include file="footer.jsp" %>