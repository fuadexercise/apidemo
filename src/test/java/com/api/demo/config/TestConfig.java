package com.api.demo.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class TestConfig {

    public static RequestSpecification JSONPlaceholder_requestSpec;

    @BeforeClass
    public static void setup() {

        JSONPlaceholder_requestSpec = new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com").
                addHeader("Content-Type", "application/json").
                addHeader("Accept", "application/json").
                build();

        RestAssured.requestSpecification = JSONPlaceholder_requestSpec;


    }
}
