// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ModelVersionTag {
    /**
     * The tag key.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * The tag value.
     */
    @JsonProperty("value")
    private String value;
    
    public ModelVersionTag setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public ModelVersionTag setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return value;
    }
    
}
