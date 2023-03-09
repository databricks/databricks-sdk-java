// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class AzureServicePrincipal {
    /**
     * The application ID of the application registration within the referenced
     * AAD tenant.
     */
    @JsonProperty("application_id")
    private String applicationId;
    
    /**
     * The client secret generated for the above app ID in AAD.
     */
    @JsonProperty("client_secret")
    private String clientSecret;
    
    /**
     * The directory ID corresponding to the Azure Active Directory (AAD) tenant
     * of the application.
     */
    @JsonProperty("directory_id")
    private String directoryId;
    
    public AzureServicePrincipal setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    public String getApplicationId() {
        return applicationId;
    }
    
    public AzureServicePrincipal setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }
    
    public AzureServicePrincipal setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    public String getDirectoryId() {
        return directoryId;
    }
    
}
