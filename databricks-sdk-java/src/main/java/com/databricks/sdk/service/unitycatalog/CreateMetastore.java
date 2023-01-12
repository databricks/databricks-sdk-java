// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateMetastore {
    /**
     * Name of Metastore.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Storage root URL for Metastore
     */
    @JsonProperty("storage_root")
    private String storageRoot;
    
    public CreateMetastore setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CreateMetastore setStorageRoot(String storageRoot) {
        this.storageRoot = storageRoot;
        return this;
    }

    public String getStorageRoot() {
        return storageRoot;
    }
    
}
