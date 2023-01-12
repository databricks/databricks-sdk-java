// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Test webhook response object.
 */
@Generated("databricks-sdk-generator")
public class TestRegistryWebhook {
    /**
     * Body of the response from the webhook URL
     */
    @JsonProperty("body")
    private String body;
    
    /**
     * Status code returned by the webhook URL
     */
    @JsonProperty("status_code")
    private Long statusCode;
    
    public TestRegistryWebhook setBody(String body) {
        this.body = body;
        return this;
    }

    public String getBody() {
        return body;
    }
    
    public TestRegistryWebhook setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public Long getStatusCode() {
        return statusCode;
    }
    
}
