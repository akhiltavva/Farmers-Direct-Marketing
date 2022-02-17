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
                    <div class="card" ">
                        <div class="card-header">Add Farm Products</div>
                        <div class="card-body">
                            <form name="my-form" action="AddFarmProduct" method="post" enctype="multipart/form-data">
                                <div class="form-group row">
                                    <label for="full_name" class="col-md-4 col-form-label text-md-right">Type</label>
                                    <div class="col-sm-6">
                                        <select name="type" class="form-control" required>
                                        <option value="">Select</option>
                                        <option value="fruits">Fruits</option>
                                        <option value="vegetables">Vegetables</option>
                                        <option value="diary">Diary</option>
                                        </select>
                                    </div>
                                 </div>
                                

                                <div class="form-group row">
                                    <label for="email_address" class="col-md-4 col-form-label text-md-right">Product Name</label>
                                    <div class="col-md-6">
                                        <input type="text" name="pname" class="form-control" required>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="user_name" class="col-md-4 col-form-label text-md-right">Quantity Available</label>
                                    <div class="col-md-6">
                                        <input type="text" id="user_name" class="form-control" name="qavailable">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="user_name" class="col-md-4 col-form-label text-md-right">Price-Per-Kg</label>
                                    <div class="col-md-6">
                                        <input type="text" id="user_name" class="form-control" name="ppkg">
                                    </div>
                                </div>
                                

                                <div class="form-group row">
                                    <label for="phone_number" class="col-md-4 col-form-label text-md-right">Image</label>
                                    <div class="col-md-6">
                                        <input type="file" id="phone_number" name="image" class="form-control">
                                    </div>
                                </div>

                                     <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                         Add Products
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