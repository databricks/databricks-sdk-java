// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get credential configuration
 */
public class GetCredentialRequest {
    /**
     * Databricks Account API credential configuration ID
     */
    
    private String credentialsId;
    
    public GetCredentialRequest setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
        return this;
    }

    public String getCredentialsId() {
        return credentialsId;
    }
    
}
