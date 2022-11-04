package stepdef;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	RequestSpecification req;

	

@Given("as a User want to pass thee data into database")
public void as_a_user_want_to_pass_thee_data_into_database() {
   JSONObject object=new JSONObject();
   object.put("name", "patil");
   object.put("address", "bidar");
   object.put("id", "40");
    req = RestAssured.given()
		   .body(object)
		   .contentType(ContentType.JSON);
   
}

@When("as a User wanT to Give the data using URI {string}")
public void as_a_user_wan_t_to_give_the_data_using_uri(String string) {
   String URI = string;
}

@Then("as a User wAnt to Check the Status code {int}")
public void as_a_user_w_ant_to_check_the_status_code(Integer int1) {
    
}
}
