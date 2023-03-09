// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class StsRole {
    /**
     * The external ID that needs to be trusted by the cross-account role. This
     * is always your Databricks account ID.
     */
    @JsonProperty("external_id")
    private String externalId;
    
    /**
     * The Amazon Resource Name (ARN) of the cross account role.
     */
    @JsonProperty("role_arn")
    private String roleArn;
    
    public StsRole setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }
    
    public StsRole setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    public String getRoleArn() {
        return roleArn;
    }
    
}
