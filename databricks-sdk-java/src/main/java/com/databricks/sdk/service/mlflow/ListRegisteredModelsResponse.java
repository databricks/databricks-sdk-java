// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListRegisteredModelsResponse {
    /**
     * Pagination token to request next page of models for the same query.
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    /**
     
     */
    @JsonProperty("registered_models")
    private java.util.List<RegisteredModel> registeredModels;
    
    public ListRegisteredModelsResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public ListRegisteredModelsResponse setRegisteredModels(java.util.List<RegisteredModel> registeredModels) {
        this.registeredModels = registeredModels;
        return this;
    }

    public java.util.List<RegisteredModel> getRegisteredModels() {
        return registeredModels;
    }
    
}
