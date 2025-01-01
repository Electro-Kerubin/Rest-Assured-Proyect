package APITest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class DeleteMethod {
    
    @Test
    public void eliminarUsuario() {
        given()
        .baseUri("https://reqres.in/api")
        .when()
        .delete("/users/551")
        .then()
        .statusCode(204)
        .log().all();
    }
}
