<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.pojo.MysqlConnection"%>
<%@page import="java.sql.Connection"%>
<%@ include file = "header3.jsp" %>   

    		
		<section class="ftco-section ftc-no-pb">
			<div class="container">
			
			  <h2>View Feedback</h2>
			  
			  <%
			  
			  Connection con=MysqlConnection.getConnect();
				
				String sql="select * from feedback";
				
				PreparedStatement pst=con.prepareStatement(sql);
				
				ResultSet rs=pst.executeQuery();
				
				
			  %>
			  
			  <table border="1" align="center">
			    <tr>
			      <td>ID</td>
			      <td>Message</td>
			      <td>Email</td>
			     
			      
			    </tr>
			    
			    <%
			         while(rs.next())
			         {
			        	 %>
			        	 <tr>
			        	  <td><%=rs.getString(1) %></td>
			        	  <td><%=rs.getString(2) %></td>
			        	  <td><%=rs.getString(3) %></td>
			        	  
			        	  
			        	 </tr>
			        	 <%
			         }
			    %>
			  </table>
			
			</div>
		</section>


<%@ include file="footer.jsp" %>