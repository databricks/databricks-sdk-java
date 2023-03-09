// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class AddBlock {
    /**
     * The base64-encoded data to append to the stream. This has a limit of 1
     * MB.
     */
    @JsonProperty("data")
    private String data;
    
    /**
     * The handle on an open stream.
     */
    @JsonProperty("handle")
    private Long handle;
    
    public AddBlock setData(String data) {
        this.data = data;
        return this;
    }

    public String getData() {
        return data;
    }
    
    public AddBlock setHandle(Long handle) {
        this.handle = handle;
        return this;
    }

    public Long getHandle() {
        return handle;
    }
    
}
