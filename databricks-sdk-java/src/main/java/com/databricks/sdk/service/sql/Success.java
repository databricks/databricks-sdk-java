// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Success {
    /**
     
     */
    @JsonProperty("message")
    private SuccessMessage message;
    
    public Success setMessage(SuccessMessage message) {
        this.message = message;
        return this;
    }

    public SuccessMessage getMessage() {
        return message;
    }
    
}
