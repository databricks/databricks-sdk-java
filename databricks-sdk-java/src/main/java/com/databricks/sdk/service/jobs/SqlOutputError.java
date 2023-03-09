// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SqlOutputError {
    /**
     * The error message when execution fails.
     */
    @JsonProperty("message")
    private String message;
    
    public SqlOutputError setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }
    
}
