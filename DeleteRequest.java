package allmethod;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequest {
	@Test

public void deleteRequest() {
		
	 when()
	.delete("http://localhost:8080/admin/hospital?id=15")
	.then()
	.assertThat().statusCode(200)
	.log().all();
}
}
