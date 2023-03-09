// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ValidationResult {
    /**
     * Error message would exist when the result does not equal to **PASS**.
     */
    @JsonProperty("message")
    private String message;
    
    /**
     * The operation tested.
     */
    @JsonProperty("operation")
    private ValidationResultOperation operation;
    
    /**
     * The results of the tested operation.
     */
    @JsonProperty("result")
    private ValidationResultResult result;
    
    public ValidationResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }
    
    public ValidationResult setOperation(ValidationResultOperation operation) {
        this.operation = operation;
        return this;
    }

    public ValidationResultOperation getOperation() {
        return operation;
    }
    
    public ValidationResult setResult(ValidationResultResult result) {
        this.result = result;
        return this;
    }

    public ValidationResultResult getResult() {
        return result;
    }
    
}
