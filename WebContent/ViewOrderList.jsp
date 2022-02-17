<%@page import="com.pojo.OrdersInfo"%>
<%@page import="com.pojo.OrderCurd"%>
<%@page import="com.pojo.DisplayPPhoto"%>
<%@page import="com.pojo.Product"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.pojo.ProductCurd"%>
<%@page import="java.util.ArrayList"%>
<%@ include file = "header2.jsp" %>   

    		
		<section class="ftco-section ftc-no-pb">
			<div class="cotainer" >
        <div class="row justify-content-center">
            <div class="col-md-8" >
            
              <%
               String email=(String)session.getAttribute("email");
              
               System.out.println("The email id is"+email);
              
               
               OrderCurd oc=new OrderCurd();
              
               ArrayList<OrdersInfo> al=oc.viewProduct(email);
               
              
              %>
             <table class="table table-striped" style="background-color:orange;">
             
              <tr>
                     
                      <th>OID</th>
                      <th>Product Id</th>
                      <th>Farmers Email</th>
                      <th>Image</th>
                      
                      
                  </tr>
                  
                  <%
                        Iterator<OrdersInfo> it=al.iterator();
                  
                        while(it.hasNext()){
                        	
                        	
                        	OrdersInfo oi=it.next();
                  %>
                            <tr>
                              <td><%=oi.getOid() %></td>
                               
                               <td><%=oi.getPid() %></td>
                               
                               <td><%=oi.getFemail() %></td>
                               
                                
                               <td><img src='<%="DisplayProductImage?id="+oi.getPid() %>' width="100px" height="100px" /></td>
                                   
                                 
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