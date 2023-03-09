// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete credential configuration
 */
public class DeleteCredentialRequest {
    /**
     * Databricks Account API credential configuration ID
     */
    
    private String credentialsId;
    
    public DeleteCredentialRequest setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
        return this;
    }

    public String getCredentialsId() {
        return credentialsId;
    }
    
}
