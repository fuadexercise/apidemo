package com.api.demo.tests;

import com.api.demo.config.EndPoint;
import com.api.demo.config.TestConfig;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Posts extends TestConfig {

    //Bug! Unable to create a new post. Response 500 internal server error
    @Test(priority = 1)
    public void createNewPost() {

        String postBodyJSON = "userId: 1,\n" +
                "        id: 49212,\n" +
                "        title: \"New Post\",\n" +
                "        body: \"I have created a new post\"";

        given().
                body(postBodyJSON).
        when()
                .post(EndPoint.POSTS + 49212).
        then().statusCode(201);

    }

    //Bug! Unable to update an existing post
    @Test(priority = 2)
    public void updateAnExistingPost() {

        String updateBodyJSON = "{\n" +
                "userId: 1,\n" +
                "id: 1,\n" +
                "title: \"Title updated\",\n" +
                "body: \"Update body\"\n" +
                "}";

        given().
                body(updateBodyJSON).
        when().
                put(EndPoint.POSTS + 1).
        then().statusCode(201);

    }

    @Test(priority = 3)
    public void deleteAnExistingPost() {
        given().
        when().
                delete(EndPoint.POSTS + 15).
        then();
    }

    //Bug Able to view deleted posts
    @Test(priority = 4)
    public void unableToViewDeletedPost() {
        given().
        when().
                get(EndPoint.POSTS + 15).
        then().statusCode(404);
    }
}
