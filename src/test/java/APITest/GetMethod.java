package APITest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetMethod {
    
    @Test
    public void getTestRickAndMortyAPI() {
        given()
        .baseUri("https://rickandmortyapi.com/api/locations/93240243")
        .when()
        .get()
        .then()
        .log().all();
    }
}
