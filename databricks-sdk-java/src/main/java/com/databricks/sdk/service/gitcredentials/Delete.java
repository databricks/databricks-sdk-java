// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a credential
 */
public class Delete {
    /**
     * The ID for the corresponding credential to access.
     */
    
    private Long credentialId;
    
    public Delete setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    public Long getCredentialId() {
        return credentialId;
    }
    
}
