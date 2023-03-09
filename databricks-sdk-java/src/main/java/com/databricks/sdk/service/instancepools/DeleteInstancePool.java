// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DeleteInstancePool {
    /**
     * The instance pool to be terminated.
     */
    @JsonProperty("instance_pool_id")
    private String instancePoolId;
    
    public DeleteInstancePool setInstancePoolId(String instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }

    public String getInstancePoolId() {
        return instancePoolId;
    }
    
}
