package APITest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostMethod {
    
    @Test
    public void crearUsuario() {
        String body = "{\n" +
            "    \"name\": \"Aquiles\",\n" +
            "    \"job\": \"Dog Lead\"\n" +
            "}";

        given()
        .baseUri("https://reqres.in/api")
        .contentType(ContentType.JSON)
        .body(body)
        .when()
        .post("/users")
        .then()
        .statusCode(201)
        .log().all();
    }
}
