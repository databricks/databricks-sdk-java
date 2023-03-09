// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SqlTaskQuery {
    /**
     * The canonical identifier of the SQL query.
     */
    @JsonProperty("query_id")
    private String queryId;
    
    public SqlTaskQuery setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    public String getQueryId() {
        return queryId;
    }
    
}
