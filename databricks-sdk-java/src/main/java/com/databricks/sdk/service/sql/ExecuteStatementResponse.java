// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ExecuteStatementResponse {
    /**
     * The result manifest provides schema and metadata for the result set.
     */
    @JsonProperty("manifest")
    private ResultManifest manifest;
    
    /**
     * Result data chunks are delivered in either the `chunk` field when using
     * `INLINE` disposition, or in the `external_link` field when using
     * `EXTERNAL_LINKS` disposition. Exactly one of these will be set.
     */
    @JsonProperty("result")
    private ResultData result;
    
    /**
     * Statement ID is returned upon successfully submitting a SQL statement,
     * and is a required reference for all subsequent calls.
     */
    @JsonProperty("statement_id")
    private String statementId;
    
    /**
     * Status response includes execution state and if relevant, error
     * information.
     */
    @JsonProperty("status")
    private StatementStatus status;
    
    public ExecuteStatementResponse setManifest(ResultManifest manifest) {
        this.manifest = manifest;
        return this;
    }

    public ResultManifest getManifest() {
        return manifest;
    }
    
    public ExecuteStatementResponse setResult(ResultData result) {
        this.result = result;
        return this;
    }

    public ResultData getResult() {
        return result;
    }
    
    public ExecuteStatementResponse setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    public String getStatementId() {
        return statementId;
    }
    
    public ExecuteStatementResponse setStatus(StatementStatus status) {
        this.status = status;
        return this;
    }

    public StatementStatus getStatus() {
        return status;
    }
    
}
