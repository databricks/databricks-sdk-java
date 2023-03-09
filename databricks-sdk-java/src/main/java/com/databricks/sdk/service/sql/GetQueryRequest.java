// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a query definition.
 */
public class GetQueryRequest {
    /**
     
     */
    
    private String queryId;
    
    public GetQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    public String getQueryId() {
        return queryId;
    }
    
}
