// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class AzureKeyVaultSecretScopeMetadata {
    /**
     * The DNS of the KeyVault
     */
    @JsonProperty("dns_name")
    private String dnsName;
    
    /**
     * The resource id of the azure KeyVault that user wants to associate the
     * scope with.
     */
    @JsonProperty("resource_id")
    private String resourceId;
    
    public AzureKeyVaultSecretScopeMetadata setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    public String getDnsName() {
        return dnsName;
    }
    
    public AzureKeyVaultSecretScopeMetadata setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return resourceId;
    }
    
}
