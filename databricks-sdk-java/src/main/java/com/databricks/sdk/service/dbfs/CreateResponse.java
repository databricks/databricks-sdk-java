// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateResponse {
    /**
     * Handle which should subsequently be passed into the AddBlock and Close
     * calls when writing to a file through a stream.
     */
    @JsonProperty("handle")
    private Long handle;
    
    public CreateResponse setHandle(Long handle) {
        this.handle = handle;
        return this;
    }

    public Long getHandle() {
        return handle;
    }
    
}
