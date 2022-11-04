package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllRequest {
	
	Response res;
	ValidatableResponse validate;
	
	@When("User want to fetch the data from database {string}")
	public void user_want_to_fetch_the_data_from_database(String string) {
		res= RestAssured.get(string);
	   
	}

	@Then("User want to verify the status line {string}")
	public void user_want_to_verify_the_status_line(String string)
	{
	  validate=res.then()
			  .assertThat().statusLine(string);
	   
	}

	@Then("user want to verify the status code {int}")
	public void user_want_to_verify_the_status_code(Integer int1) 
	{
	   
	  validate.assertThat().statusCode(int1);
	}
}
