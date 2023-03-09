// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateCredentialAwsCredentials {
    /**
     
     */
    @JsonProperty("sts_role")
    private CreateCredentialStsRole stsRole;
    
    public CreateCredentialAwsCredentials setStsRole(CreateCredentialStsRole stsRole) {
        this.stsRole = stsRole;
        return this;
    }

    public CreateCredentialStsRole getStsRole() {
        return stsRole;
    }
    
}
