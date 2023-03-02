// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Status response includes execution state and if relevant, error information.
 */
@Generated("databricks-sdk-generator")
public class StatementStatus {
    /**
     
     */
    @JsonProperty("error")
    private ServiceError error;
    
    /**
     * Statement execution state: - `PENDING`: waiting for warehouse -
     * `RUNNING`: running - `SUCCEEDED`: execution was successful, result data
     * available for fetch - `FAILED`: execution failed; reason for failure
     * described in accomanying error message - `CANCELED`: user canceled; can
     * come from explicit cancel call, or timeout with `on_wait_timeout=CANCEL`
     * - `CLOSED`: execution successful, and statement closed; result no longer
     * available for fetch
     */
    @JsonProperty("state")
    private StatementState state;
    
    public StatementStatus setError(ServiceError error) {
        this.error = error;
        return this;
    }

    public ServiceError getError() {
        return error;
    }
    
    public StatementStatus setState(StatementState state) {
        this.state = state;
        return this;
    }

    public StatementState getState() {
        return state;
    }
    
}
