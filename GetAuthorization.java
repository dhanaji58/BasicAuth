package Authentication;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

public class GetAuthorization {
	public static void main(String[] args) {
		baseURI="https://github.com";
		
		given().auth().basic("dhanaji5853","dhanaji5853")
		
		.when().get("/login")
		.then().log().all();
	}

}
