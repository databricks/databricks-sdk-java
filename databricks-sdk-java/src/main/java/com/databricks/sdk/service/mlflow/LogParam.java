// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class LogParam {
    /**
     * Name of the param. Maximum size is 255 bytes.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * ID of the run under which to log the param. Must be provided.
     */
    @JsonProperty("run_id")
    private String runId;
    
    /**
     * [Deprecated, use run_id instead] ID of the run under which to log the
     * param. This field will be removed in a future MLflow version.
     */
    @JsonProperty("run_uuid")
    private String runUuid;
    
    /**
     * String value of the param being logged. Maximum size is 500 bytes.
     */
    @JsonProperty("value")
    private String value;
    
    public LogParam setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public LogParam setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
    public LogParam setRunUuid(String runUuid) {
        this.runUuid = runUuid;
        return this;
    }

    public String getRunUuid() {
        return runUuid;
    }
    
    public LogParam setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return value;
    }
    
}
