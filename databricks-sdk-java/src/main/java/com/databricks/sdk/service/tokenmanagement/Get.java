// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get token info
 */
public class Get {
    /**
     * The ID of the token to get.
     */
    
    private String tokenId;
    
    public Get setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }
    
}
