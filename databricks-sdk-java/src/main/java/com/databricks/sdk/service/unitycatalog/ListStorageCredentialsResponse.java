// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListStorageCredentialsResponse {
    /**
     
     */
    @JsonProperty("storage_credentials")
    private java.util.List<StorageCredentialInfo> storageCredentials;
    
    public ListStorageCredentialsResponse setStorageCredentials(java.util.List<StorageCredentialInfo> storageCredentials) {
        this.storageCredentials = storageCredentials;
        return this;
    }

    public java.util.List<StorageCredentialInfo> getStorageCredentials() {
        return storageCredentials;
    }
    
}
