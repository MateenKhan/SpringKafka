package main.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import main.controller.CustomersApi;
import main.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

public class CustomersApiImpl implements CustomersApi {

    private static final Logger log = LoggerFactory.getLogger(CustomersApiImpl.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public  CustomersApiImpl(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Customer> customersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Customer body,
                                                  @ApiParam(value = "" ,required=true) @RequestHeader(value="ActivityID", required=true) String activityID,
                                                  @ApiParam(value = "" ,required=true) @RequestHeader(value="ApplicationID", required=true) String applicationID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{\n  \"total\" : 1,\n  \"pageNumber\" : 0,\n  \"data\" : [ {\n    \"customerStatus\" : \"R\",\n    \"number\" : \"number\",\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"country\" : \"country\",\n    \"birthdate\" : \"2000-01-23\",\n    \"address\" : {\n      \"street\" : \"street\",\n      \"postalCode\" : 5,\n      \"addressLine1\" : \"addressLine1\",\n      \"addressLine2\" : \"addressLine2\"\n    },\n    \"countryCode\" : \"countryCode\",\n    \"mobileNumber\" : \"mobileNumber\",\n    \"email\" : \"\"\n  }, {\n    \"customerStatus\" : \"R\",\n    \"number\" : \"number\",\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"country\" : \"country\",\n    \"birthdate\" : \"2000-01-23\",\n    \"address\" : {\n      \"street\" : \"street\",\n      \"postalCode\" : 5,\n      \"addressLine1\" : \"addressLine1\",\n      \"addressLine2\" : \"addressLine2\"\n    },\n    \"countryCode\" : \"countryCode\",\n    \"mobileNumber\" : \"mobileNumber\",\n    \"email\" : \"\"\n  } ],\n  \"pageSize\" : 6\n}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json",e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }


}
