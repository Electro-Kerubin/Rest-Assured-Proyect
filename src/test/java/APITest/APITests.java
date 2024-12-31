package APITest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITests {
    
    @Test
    public void testRickAndMortyAPI() {
        given()
        .baseUri("https://rickandmortyapi.com/api/locations/93240243")
        .when()
        .get()
        .then()
        .log().all();
    }
}
