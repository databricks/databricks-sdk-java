// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListProviderSharesResponse {
    /**
     * An array of provider shares.
     */
    @JsonProperty("shares")
    private java.util.List<ProviderShare> shares;
    
    public ListProviderSharesResponse setShares(java.util.List<ProviderShare> shares) {
        this.shares = shares;
        return this;
    }

    public java.util.List<ProviderShare> getShares() {
        return shares;
    }
    
}
