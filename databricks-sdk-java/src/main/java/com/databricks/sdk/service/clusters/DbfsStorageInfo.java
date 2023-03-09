// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DbfsStorageInfo {
    /**
     * dbfs destination, e.g. `dbfs:/my/path`
     */
    @JsonProperty("destination")
    private String destination;
    
    public DbfsStorageInfo setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public String getDestination() {
        return destination;
    }
    
}
