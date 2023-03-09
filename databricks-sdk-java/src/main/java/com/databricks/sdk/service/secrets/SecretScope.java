// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SecretScope {
    /**
     * The type of secret scope backend.
     */
    @JsonProperty("backend_type")
    private ScopeBackendType backendType;
    
    /**
     * The metadata for the secret scope if the type is `AZURE_KEYVAULT`
     */
    @JsonProperty("keyvault_metadata")
    private AzureKeyVaultSecretScopeMetadata keyvaultMetadata;
    
    /**
     * A unique name to identify the secret scope.
     */
    @JsonProperty("name")
    private String name;
    
    public SecretScope setBackendType(ScopeBackendType backendType) {
        this.backendType = backendType;
        return this;
    }

    public ScopeBackendType getBackendType() {
        return backendType;
    }
    
    public SecretScope setKeyvaultMetadata(AzureKeyVaultSecretScopeMetadata keyvaultMetadata) {
        this.keyvaultMetadata = keyvaultMetadata;
        return this;
    }

    public AzureKeyVaultSecretScopeMetadata getKeyvaultMetadata() {
        return keyvaultMetadata;
    }
    
    public SecretScope setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
