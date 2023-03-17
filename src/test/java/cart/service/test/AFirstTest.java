package cart.service.test;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

public class A_FirstTest {

    @Test
    public void myFirstTest(){
        assertThat(RestAssured.config(), instanceOf(RestAssuredConfig.class));
    }
}
