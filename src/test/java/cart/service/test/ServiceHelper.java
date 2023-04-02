package cart.service.test;

import io.restassured.response.Response;
import utils.GetPropertyValues;

import java.util.Map;

import static io.restassured.RestAssured.*;

public class ServiceHelper {

    GetPropertyValues getPropertyValues = new GetPropertyValues();

    private final String LOGIN = getPropertyValues.getPropValue("login");
    private final String PASSWORD = getPropertyValues.getPropValue("password");
    private final String BASE_URL = getPropertyValues.getPropValue("shopServerUrl");

    private final SampleRest SAMPLE_REST = new SampleRest();


    public void addItem(int productId, int quantity, boolean returnCart, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .queryParam("product_id", productId)
                .queryParam("quantity", quantity)
                .queryParam("return_cart", returnCart)
                .baseUri(BASE_URL)
                .post(endpoint);
    }

    public void sendPostRequest(Map<String, Object> queryParamsBody, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .queryParams(queryParamsBody)
                .baseUri(BASE_URL)
                .post(endpoint);
    }
    public void zadanieAddItem(Map<String, Object> queryParamsBody_1, String endpoint_1) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN,PASSWORD)
                .queryParams(queryParamsBody_1)
                .baseUri(BASE_URL)
                .post(endpoint_1);
    }

    public void updateZadanie(Map<String, Object> queryParams_2, String endopint_2) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .queryParams(queryParams_2)
                .baseUri(BASE_URL)
                .post(endopint_2);
    }
}

class SampleRest {
    public Response response;
}
