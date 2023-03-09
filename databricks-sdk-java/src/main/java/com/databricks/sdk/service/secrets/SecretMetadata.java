// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SecretMetadata {
    /**
     * A unique name to identify the secret.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * The last updated timestamp (in milliseconds) for the secret.
     */
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    
    public SecretMetadata setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public SecretMetadata setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    
}
