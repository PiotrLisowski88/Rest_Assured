package cart.service.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BPOSTmethodBodyFormData {

    private final ServiceHelper serviceHelper = new ServiceHelper();

    @Test
    public void addItemWithBodyFormData() {
        int productId = 142;
        int quantity = 10;
        boolean returnCart = true;

        String endPoint = "/cocart/v1/add-item";

        serviceHelper.addItem(productId, quantity, returnCart, endPoint);
    }

    @Test
    public void addItemWithBodyBodyMap() {
        Map<String, Object> queryParamsBody = new HashMap<>();
        queryParamsBody.put("product_id", "142");
        queryParamsBody.put("quantity", 5);
        queryParamsBody.put("return_cart", true);

        String endPoint = "/cocart/v1/add-item";

        serviceHelper.sendPostRequest(queryParamsBody, endPoint);
    }

    @Test
    public void addItemZadanie1() {
        Map<String, Object> queryParamsBody_1 = new HashMap<>();
        queryParamsBody_1.put("product_id", 140);
        queryParamsBody_1.put("quantity", 124);
        queryParamsBody_1.put("return_cart", true);

        String endPoint_1 = "/cocart/v1/add-item";

        serviceHelper.zadanieAddItem(queryParamsBody_1, endPoint_1);
    }

    @Test
    public void updateQuantityZadanie() {
        Map<String, Object> queryParams_2 = new HashMap<>();
        queryParams_2.put("cart_item_key", "1385974ed5904a438616ff7bdb3f7439");
        queryParams_2.put("quantity", 10);
        queryParams_2.put("return_cart", true);

        String endPoint_2 = "/cocart/v1/item";

        serviceHelper.updateZadanie(queryParams_2, endPoint_2);
    }
}
