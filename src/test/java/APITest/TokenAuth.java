package APITest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TokenAuth {
    
    private String token = "558436f2de691ea39d118a87bd682cb631bd3b641273f0976d62ad946029fa55";

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://simple-books-api.glitch.me";
        Response response = given()
            .contentType("application/json")
            .body("{\n" +
              "  \"clientName\": \"Aquiles Baeza\",\n" +
              "  \"clientEmail\": \"aquileselmejorperro1@perritos.com\"\n" +
              "}")
            .when()
            .post("/api-clients/")
            .then()
            .statusCode(201)
            .extract()
            .response();

        token = response.jsonPath().getString("accessToken");
    }

    @Test
    public void testTokenBooks() {

        given()
        .header("Authorization", "Bearer " + token)
        .when()
        .get("/orders")
        .then()
        .statusCode(200);
        
        
    }
}
