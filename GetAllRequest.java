package allmethod;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetAllRequest {

		@Test
		
		public void getallrequest() {
			when()
			.get("http://localhost:8080/admin/hospital")
			.then()
			.assertThat().statusCode(200)
			.log().all();
		}
	}

