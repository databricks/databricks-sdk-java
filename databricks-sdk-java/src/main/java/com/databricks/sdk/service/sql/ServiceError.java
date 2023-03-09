// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ServiceError {
    /**
     
     */
    @JsonProperty("error_code")
    private ServiceErrorCode errorCode;
    
    /**
     * Brief summary of error condition.
     */
    @JsonProperty("message")
    private String message;
    
    public ServiceError setErrorCode(ServiceErrorCode errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ServiceErrorCode getErrorCode() {
        return errorCode;
    }
    
    public ServiceError setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }
    
}
