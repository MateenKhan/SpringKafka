package main.controller;


import io.swagger.annotations.*;
import main.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "customers")
public interface CustomersApi {
    @ApiOperation(value = "create a customer in kafka", nickname = "customersPost", notes = "create a single customer in kafka", response = Customer.class, authorizations = {
            @Authorization(value = "OAuth2", scopes = {
                    @AuthorizationScope(scope = "read", description = "Grants read access"),
                    @AuthorizationScope(scope = "write", description = "Grants write access"),
                    @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            })}, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "created customer description", response = Customer.class)})
    @RequestMapping(value = "/customers",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Customer> customersPost(@ApiParam(value = "", required = true) @Valid @RequestBody Customer body,
                                           @ApiParam(value = "", required = true) @RequestHeader(value = "ActivityID", required = true) String activityID,
                                           @ApiParam(value = "", required = true) @RequestHeader(value = "ApplicationID", required = true) String applicationID);


}
