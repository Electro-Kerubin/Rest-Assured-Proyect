package APITest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class JsonPath {
    
    @Test
    public void jsonPath() {
        Response response = given()
                            .when()
                            .get("https://jsonplaceholder.typicode.com/users/1")
                            .then()
                            .statusCode(200)
                            .extract()
                            .response();

        //Extraccion de datos de la respuesta JSON
        String name = response.jsonPath().getString("name");
        String username = response.jsonPath().getString("username");
        String email = response.jsonPath().getString("email");
        String lat = response.jsonPath().getString("address.geo.lat");

        // Print de los datos extraidos
        System.out.println("name: " + name);
        System.out.println("username: " + username);
        System.out.println("email: " + email);
        System.out.println("lat: " + lat);

        //Validacion de los datos extraidos
        response.then().assertThat().body("name", org.hamcrest.Matchers.equalTo("Leanne Graham"));
        response.then().assertThat().body("username", org.hamcrest.Matchers.equalTo("Bret"));
        response.then().assertThat().body("email", org.hamcrest.Matchers.equalTo("Sincere@april.biz"));
        response.then().assertThat().body("address.geo.lat", org.hamcrest.Matchers.equalTo("-37.31591"));

        
    }
}
