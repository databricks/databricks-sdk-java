// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class AwsCredentials {
    /**
     
     */
    @JsonProperty("sts_role")
    private StsRole stsRole;
    
    public AwsCredentials setStsRole(StsRole stsRole) {
        this.stsRole = stsRole;
        return this;
    }

    public StsRole getStsRole() {
        return stsRole;
    }
    
}
