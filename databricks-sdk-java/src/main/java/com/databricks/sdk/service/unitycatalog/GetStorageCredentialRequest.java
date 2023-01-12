// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a credential
 */
@Generated("databricks-sdk-generator")
public class GetStorageCredentialRequest {
    /**
     * Required. Name of the storage credential.
     */
    
    private String name;
    
    public GetStorageCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
