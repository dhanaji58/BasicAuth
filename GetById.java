package allmethod;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetById {
@Test

public void getById() {
	when()
	.get("http://localhost:8080/admin/hospital/5")
	.then()
	.assertThat().statusCode(200)
	.log().all();
}
}
