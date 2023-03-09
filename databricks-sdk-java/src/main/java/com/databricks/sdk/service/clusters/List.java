// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List all clusters
 */
public class List {
    /**
     * Filter clusters based on what type of client it can be used for. Could be
     * either NOTEBOOKS or JOBS. No input for this field will get all clusters
     * in the workspace without filtering on its supported client
     */
    @QueryParam("can_use_client")
    private String canUseClient;
    
    public List setCanUseClient(String canUseClient) {
        this.canUseClient = canUseClient;
        return this;
    }

    public String getCanUseClient() {
        return canUseClient;
    }
    
}
