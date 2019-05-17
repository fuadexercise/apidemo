package com.api.demo.tests;

import com.api.demo.config.EndPoint;
import com.api.demo.config.TestConfig;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class Comments extends TestConfig {

    @Test
    public void validEmailTest() {
        given().
        when().
                get(EndPoint.COMMENTS + 1).
        then().
                body("email", equalTo("Eliseo@gardner.biz"));
    }

    @Test
    public void invalidEmailTest() {
        given().
        when().
                get(EndPoint.COMMENTS + 1).
        then().
                body("email", not("invalid-email"));
    }
}
