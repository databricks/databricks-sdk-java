// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListProvidersResponse {
    /**
     * An array of provider information objects.
     */
    @JsonProperty("providers")
    private java.util.List<ProviderInfo> providers;
    
    public ListProvidersResponse setProviders(java.util.List<ProviderInfo> providers) {
        this.providers = providers;
        return this;
    }

    public java.util.List<ProviderInfo> getProviders() {
        return providers;
    }
    
}
