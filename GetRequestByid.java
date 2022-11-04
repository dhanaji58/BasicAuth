package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetRequestByid {
	
	@When("User want to fetch the data by using URI {string}")
	public void user_want_to_fetch_the_data_by_using_uri(String string) {
	   String URI = string;
	}

	@Then("User want to verify the status code as  {int}")
	public void user_want_to_verify_the_status_code_as(Integer int1) {
		Integer Integer = int1;
		System.out.println("successfully Data Fetched By id");
	   
	}

}
