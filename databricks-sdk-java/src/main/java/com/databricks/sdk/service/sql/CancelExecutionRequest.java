// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Cancel statement execution
 */
public class CancelExecutionRequest {
    /**
     
     */
    
    private String statementId;
    
    public CancelExecutionRequest setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    public String getStatementId() {
        return statementId;
    }
    
}
