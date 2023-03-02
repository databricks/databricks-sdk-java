// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Gets the named storage credential
 */
@Generated("databricks-sdk-generator")
public class GetAccountStorageCredentialRequest {
    /**
     * Databricks Unity Catalog metastore ID
     */
    
    private String metastoreId;
    
    /**
     * Name of the storage credential.
     */
    
    private String name;
    
    /**
     
     */
    
    private String storageCredentialName;
    
    public GetAccountStorageCredentialRequest setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public GetAccountStorageCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public GetAccountStorageCredentialRequest setStorageCredentialName(String storageCredentialName) {
        this.storageCredentialName = storageCredentialName;
        return this;
    }

    public String getStorageCredentialName() {
        return storageCredentialName;
    }
    
}
