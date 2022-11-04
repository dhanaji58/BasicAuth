package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteRequest {
	@When("user want to delete user by using URI {string}")
	public void user_want_to_delete_user_by_using_uri(String string) {
	    String URI = string ;
	}

	@Then("user Want tO VeriFy the StatusLine {string}")
	public void user_want_t_o_veri_fy_the_status_line(String string) {
	   
	}

	@Then("User should able to get StatusCode {int}")
	public void user_should_able_to_get_status_code(Integer int1) {
	   Integer status = int1;
	   System.out.println("Successfully deleted user by ID");
	}


}
