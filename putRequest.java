package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class putRequest {
	String name;
	String address;
	int id;
	String URI;
	@Given("User want to update name as {string}")
	public void user_want_to_update_name_as(String string) {
	   name=string;
	}
	@Given("user Want to update address as {string}")
	public void user_want_to_update_address_as(String string) {
	   address=string;
	}
	@When("User wanT to validate  the Data from database using URI {string}")
	public void user_wan_t_to_validate_the_data_from_database_using_uri(String string) {
	   String URI = string;
	}
	@Then("User WAnt to Checks the Status code {int}")
	public void user_w_ant_to_checks_the_status_code(Integer int1) {
	  Integer status = int1;
	  System.out.println("Successfully update the data");
	}

	
}	