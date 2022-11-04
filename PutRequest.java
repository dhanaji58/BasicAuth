package allmethod;
import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutRequest {
@Test

public void putRequest() {
	JSONObject object=new JSONObject();
	object.put("address","udgir");
	object.put("id",15);
	object.put("name","rocky");
	
	given()
	.contentType(ContentType.JSON)
	.body(object)
	.when()
	.put("http://localhost:8080/admin/hospital/5")
	.then()
	.log().all()
	.assertThat().contentType(ContentType.JSON);
}


}


