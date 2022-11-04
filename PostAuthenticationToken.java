package Authentication;
import static io.restassured.RestAssured.baseURI;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class PostAuthenticationToken {

	public static void main(String[] args) {
		baseURI="https://api.github.com";
		JSONObject obj=new JSONObject();
		obj.put("name","BasicAuth");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		

	}

}
