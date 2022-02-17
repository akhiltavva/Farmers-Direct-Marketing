<%@ include file = "header.jsp" %>   

    		
		<section class="ftco-section ftc-no-pb">
			<div class="container">
				<div class="row no-gutters">
				     <div class="col-md-3 p-md-3">
				     </div>
					<div class="col-md-6 p-md-6 ">
					      
		  <form method="post" action="UploadFarmerRegister" enctype="multipart/form-data" class="text-center border border-light p-5"> 

    <p class="h4 mb-4">Register as farmer</p>



    <!-- Email -->
     <input type="text" name="uname" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="Farmer Name" required>
    
    <input type="email"  name="email" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="E-mail" required>

    <!-- Password -->
    <input type="password" name="password" id="defaultLoginFormPassword" class="form-control mb-4" placeholder="Password" required>

    
    <select class="form-control mb-4" name="gender" required>
      <option value="">Select Gender</option>
      <option value="Male">Male</option>
      <option value="Female">Female</option>
      
    </select>
    
    <input type="text"  name="phone" class="form-control mb-4" placeholder="phone" required>
    
    <textarea name="address" rows="5" cols="35" placeholder="Enter the address" required></textarea>
    
    <br>
    
    <input type="file"  placeholder="Upload your photo" name="image" class="form-control mb-4" />
    
    <div class="d-flex justify-content-around">
        <div>
            <!-- Remember me 
            <div class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
                <label class="custom-control-label" for="defaultLoginFormRemember">Remember me</label>
            </div>-->
        </div>
        
    </div>

    <!-- Sign in button -->
    <button class="btn btn-info btn-block my-4" type="submit">Register</button>

    <!-- Register -->
    <p>Register as ?
        <a href="Vregister.jsp">Vendor</a>
    </p>
    
    <p>already a member?
        <a href="login.jsp">login as a Farmer</a>
        <a href="Vlogin.jsp">login as a Vendor</a>
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