// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Databricks Delta Sharing: Recipient Activation REST API
 */
@Generated("databricks-sdk-generator")
public class RecipientActivationAPI implements RecipientActivationService {
    private final ApiClient apiClient;

    public RecipientActivationAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get a share activation URL.
     * 
     * Gets an activation URL for a share.
     */
    @Override
    public void getActivationUrlInfo(GetActivationUrlInfoRequest request) {
        String path = String.format("/api/2.1/unity-catalog/public/data_sharing_activation_info/%s", request.getActivationUrl());
        apiClient.GET(path, request, Void.class);
    }
    
	/**
     * Get an access token.
     * 
     * Retrieve access token with an activation url. This is a public API
     * without any authentication.
     */
    @Override
    public RetrieveTokenResponse retrieveToken(RetrieveTokenRequest request) {
        String path = String.format("/api/2.1/unity-catalog/public/data_sharing_activation/%s", request.getActivationUrl());
        return apiClient.GET(path, request, RetrieveTokenResponse.class);
    }
    
}