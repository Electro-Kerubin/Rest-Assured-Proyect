package APITest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


// Un SOAP Request (Solicitud SOAP) es un mensaje enviado por un cliente a un servidor utilizando el protocolo 
// SOAP (Simple Object Access Protocol), que es un protocolo basado en XML para la comunicación entre aplicaciones 
// a través de redes, típicamente usando HTTP/HTTPS como transporte.

public class SOAPRequest {
    
    @Test
    public void testSoapRequest() {

        String endpoint = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";

        String soapBody = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" 
                        + "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" 
                        +"  <soap:Body>\r\n" 
                        +"    <NumberToWords xmlns=\"http://www.dataaccess.com/webservicesserver/\">\r\n" 
                        +"      <ubiNum>2025</ubiNum>\r\n" 
                        +"    </NumberToWords>\r\n" 
                        +"  </soap:Body>\r\n" 
                        +"</soap:Envelope>";

        Response response = given()
                            .header("Content-Type", "text/xml")
                            .and()
                            .body(soapBody)
                            .when()
                            .post(endpoint);
        
        //Verificando el codigo de estado de la respuesta
        Assert.assertEquals(response.getStatusCode(), 200);
    
        //Imprimiendo la respuesta
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        // verificar que la respuesta contiene la palabra "two thousand twenty-five"
        Assert.assertTrue(responseBody.contains("two thousand twenty five"));

        //Verificando que la respuesta contiene la palabra "two thousand twenty-five"
        String numberInWords = response.xmlPath().getString("//*local-name()='NumberToWordsResult']").trim();
        Assert.assertEquals(numberInWords, "two thousand twenty five");
    }
}
