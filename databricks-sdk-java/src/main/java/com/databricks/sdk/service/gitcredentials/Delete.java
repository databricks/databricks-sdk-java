// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a credential
 */
@Generated("databricks-sdk-generator")
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
