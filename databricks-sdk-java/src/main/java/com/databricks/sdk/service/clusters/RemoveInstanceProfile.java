// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RemoveInstanceProfile {
    /**
     * The ARN of the instance profile to remove. This field is required.
     */
    @JsonProperty("instance_profile_arn")
    private String instanceProfileArn;
    
    public RemoveInstanceProfile setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
        return this;
    }

    public String getInstanceProfileArn() {
        return instanceProfileArn;
    }
    
}
