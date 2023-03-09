// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Close {
    /**
     * The handle on an open stream.
     */
    @JsonProperty("handle")
    private Long handle;
    
    public Close setHandle(Long handle) {
        this.handle = handle;
        return this;
    }

    public Long getHandle() {
        return handle;
    }
    
}
