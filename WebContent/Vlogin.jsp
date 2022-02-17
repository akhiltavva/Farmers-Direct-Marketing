<%@ include file = "header.jsp" %>   

    		
		<section class="ftco-section ftc-no-pb">
			<div class="container">
				<div class="row no-gutters">
				     <div class="col-md-3 p-md-3">
				     </div>
					<div class="col-md-6 p-md-6 ">
					      
					      <form action="CheckVSignIn" method="post" class="text-center border border-light p-5">

    <p class="h4 mb-4">Sign in as Vendor</p>

    <!-- Email -->
    <input type="email" name="email" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="E-mail" required>

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
            <a href="">Forgot password?</a>
        </div>
    </div>

    <!-- Sign in button -->
    <button class="btn btn-info btn-block my-4" type="submit">Sign in as Farmer</button>

    <!-- Register -->
    <p>Login as ?
        <a href="Login.jsp">Farmer</a>
    </p>
    
    <p>Not a member?
        <a href="fregister.jsp">Register as a Farmer</a>
        <a href="Vregister.jsp">Register as a Vendor</a>
    </p>

    <!-- Social login -->

</form>

					</div>
					<div class="col-md-3 p-md-3">
				     </div>
				</div>
			</div>
		</section>


<%@ include file="footer.jsp" %>