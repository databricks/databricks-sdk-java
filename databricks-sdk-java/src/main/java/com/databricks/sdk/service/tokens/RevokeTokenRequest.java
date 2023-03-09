// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RevokeTokenRequest {
    /**
     * The ID of the token to be revoked.
     */
    @JsonProperty("token_id")
    private String tokenId;
    
    public RevokeTokenRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }
    
}
