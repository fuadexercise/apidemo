package com.api.demo.tests;

import com.api.demo.config.EndPoint;
import com.api.demo.config.TestConfig;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;



public class Albums extends TestConfig {

    @Test
    public void getValidAlbumTest() {
        given().
        when().
                get(EndPoint.ALBUMS + 1).
        then().
                statusCode(200);

    }

    @Test
    public void unableToGetInvalidAlbumTest() {
        given().
        when().
                get(EndPoint.ALBUMS + "invalid-id").
        then().
                statusCode(404);
    }
}
