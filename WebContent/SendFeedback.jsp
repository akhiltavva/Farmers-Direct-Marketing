<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.pojo.MysqlConnection"%>
<%@page import="java.sql.Connection"%>
<%@ include file = "header1.jsp" %>   

<style>
.my-form
{
    padding-top: 1.5rem;
    padding-bottom: 1.5rem;
}

.my-form .row
{
    margin-left: 0;
    margin-right: 0;
}

.login-form
{
    padding-top: 1.5rem;
    padding-bottom: 1.5rem;
}

.login-form .row
{
    margin-left: 0;
    margin-right: 0;
}
</style>
    		
		<section class="ftco-section ftc-no-pb">
			<div class="cotainer" >
        <div class="row justify-content-center">
            <div class="col-md-8" >
            
            <%
                    String email=(String)session.getAttribute("email");
                  if(request.getParameter("msg")!=null)
                  {
                	  String msg=request.getParameter("msg");
                	  Connection con=MysqlConnection.getConnect();
                      
                      String sql="insert into feedback(messsage,uname) values(?,?) ";
                      
                      
                      
                      PreparedStatement pst=con.prepareStatement(sql);
                      
                      pst.setString(1,msg);
                      pst.setString(2,email);
                      
                      int x=pst.executeUpdate();
                      
                      pst.close();
                      con.close();
                      
                      if(x==1)
                      {
                    	  out.println("<script>alert('feedback submitted')</script>");
                      }
                	  
                  }
            %>
                    <div class="card" ">
                        <div class="card-header">Add FeedBack</div>
                        <div class="card-body">
                            <form name="my-form" action="" method="get">
                                
                                

                                <div class="form-group row">
                                    <label for="email_address" class="col-md-4 col-form-label text-md-right">Enter FeedBack</label>
                                    <div class="col-md-6">
                                        <textarea rows="5" cols="20" name="msg" required></textarea>
                                         </div>
                                </div>

                              
                                     <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                         Add FeedBack
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
            </div>
        </div>
    </div>

		</section>


<%@ include file="footer.jsp" %>