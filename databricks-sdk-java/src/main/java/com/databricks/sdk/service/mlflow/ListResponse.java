// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListResponse {
    /**
     * Array of open transition requests.
     */
    @JsonProperty("requests")
    private java.util.List<Activity> requests;
    
    public ListResponse setRequests(java.util.List<Activity> requests) {
        this.requests = requests;
        return this;
    }

    public java.util.List<Activity> getRequests() {
        return requests;
    }
    
}
