package APITest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Authentication {
    
    @Test
    public void testBasicAuthEndpoint() {
        given()
            .header("Authorization", "Basic cG9zdG1hbjpwYXNzd29yZA==")
            .when()
            .get("https://postman-echo.com/basic-auth")
            .then()
            .statusCode(200);
    }
}
