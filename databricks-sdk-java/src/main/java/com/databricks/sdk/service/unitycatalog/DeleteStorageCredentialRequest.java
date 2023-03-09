// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a credential
 */
public class DeleteStorageCredentialRequest {
    /**
     * Force deletion even if there are dependent external locations or external
     * tables.
     */
    @QueryParam("force")
    private Boolean force;
    
    /**
     * Name of the storage credential.
     */
    
    private String name;
    
    public DeleteStorageCredentialRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public Boolean getForce() {
        return force;
    }
    
    public DeleteStorageCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
