<%@ include file = "header.jsp" %>   

   		<section class="ftco-section ftc-no-pb">
			<div class="container">
				<div class="row no-gutters">
				     <div class="col-md-3 p-md-3">
				     </div>
					<div class="col-md-6 p-md-6 ">
					
					<%
					   if(request.getParameter("uname")!=null)
					   {
						   String uname=request.getParameter("uname");
						   String pass=request.getParameter("password");
						   
						   if(uname.equals("admin") && pass.equals("admin"))
						   {
							   response.sendRedirect("WelcomeAdmin.jsp");
						   }
						   else{
							   out.println("<script>alert('UserName and Password is Wrong');</script>");
						   }
					   }
					%>
					      
		 <form action="" method="post" class="text-center border border-light p-5" >

    <p class="h4 mb-4">Sign in as Admin</p>

    <!-- Email -->
    <input type="text" name="uname" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="E-mail" required>

    <!-- Password -->
    <input type="password" name="password" id="defaultLoginFormPassword" class="form-control mb-4" placeholder="Password" required>

    <div class="d-flex justify-content-around">
        <div>
            <!-- Remember me 
            <div class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
                <label class="custom-control-label" for="defaultLoginFormRemember">Remember me</label>
            </div>-->
        </div>
        <div>
            <!-- Forgot password -->
         
        </div>
    </div>

    <!-- Sign in button -->
    <button class="btn btn-info btn-block my-4" type="submit">Sign in as Admin</button>

   
    
   

    <!-- Social login -->

</form>

					</div>
					<div class="col-md-3 p-md-3">
				     </div>
				</div>
			</div>
		</section>


<%@ include file="footer.jsp" %>