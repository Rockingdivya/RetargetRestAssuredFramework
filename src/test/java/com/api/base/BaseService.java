package com.api.base;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    //wrapper for rest assured this where abstraction comes
    //BASE URI
    //Responsible for creating the request
    //Handling the response
    //below is the constant which are written in upper case and declared as Final and can be static in variables not methods
    private static final String BASE_URL = "https://64.227.160.186.8080";
    private RequestSpecification requestSpecification;
    //RequestSpecification is an interface we can't create object
    //To initialize the instance variable requestSpecification
    //to this reqest specificaion i will assign base URL
    public BaseService() {
        requestSpecification = given().baseUri(BASE_URL);
    }
    //response is return type of post method
    protected Response postRequest(String payload,String endPoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);


    }
}
