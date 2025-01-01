package APITest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutMethod {

    @Test
    public void actualizarUsuario() {
        String body = "{\n" +
            "    \"name\": \"Aquiles\",\n" +
            "    \"job\": \"Dog QA Automation\"\n" +
            "}";

        given()
        .baseUri("https://reqres.in/api")
        .contentType(ContentType.JSON)
        .body(body)
        .when()
        .put("/users/551")
        .then()
        .statusCode(200)
        .log().all();
    }
    
}
