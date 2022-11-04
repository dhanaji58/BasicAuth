package allmethod;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	RequestSpecification req;
	Response resp;

	@Test
	
	public void postRequest() {
		JSONObject object =new JSONObject();
		object.put("address","mumbai");
//		object.put("id",);
		object.put("name","danny");
		
	given()
	.contentType(ContentType.JSON)
	.body(object)
	.when().post("http://localhost:8080/admin/hospital")
	.then()
	.log().all()
	.assertThat().statusCode(200)
	.assertThat().contentType(ContentType.JSON);
		
	
}
}
