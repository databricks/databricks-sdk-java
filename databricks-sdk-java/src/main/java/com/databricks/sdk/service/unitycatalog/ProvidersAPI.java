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
 * Databricks Delta Sharing: Providers REST API
 */
@Generated("databricks-sdk-generator")
public class ProvidersAPI implements ProvidersService {
    private final ApiClient apiClient;

    public ProvidersAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create an auth provider.
     * 
     * Creates a new authentication provider minimally based on a name and
     * authentication type. The caller must be an admin on the metastore.
     */
    @Override
    public ProviderInfo create(CreateProvider request) {
        String path = "/api/2.1/unity-catalog/providers";
        return apiClient.POST(path, request, ProviderInfo.class);
    }
    
	/**
     * Delete a provider.
     * 
     * Deletes an authentication provider, if the caller is a metastore admin or
     * is the owner of the provider.
     */
    @Override
    public void delete(DeleteProviderRequest request) {
        String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a provider.
     * 
     * Gets a specific authentication provider. The caller must supply the name
     * of the provider, and must either be a metastore admin or the owner of the
     * provider.
     */
    @Override
    public ProviderInfo get(GetProviderRequest request) {
        String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
        return apiClient.GET(path, request, ProviderInfo.class);
    }
    
	/**
     * List providers.
     * 
     * Gets an array of available authentication providers. The caller must
     * either be a metastore admin or the owner of the providers. Providers not
     * owned by the caller are not included in the response. There is no
     * guarantee of a specific ordering of the elements in the array.
     */
    @Override
    public ListProvidersResponse list(ListProvidersRequest request) {
        String path = "/api/2.1/unity-catalog/providers";
        return apiClient.GET(path, request, ListProvidersResponse.class);
    }
    
	/**
     * List shares by Provider.
     * 
     * Gets an array of a specified provider's shares within the metastore
     * where:
     * 
     * * the caller is a metastore admin, or * the caller is the owner.
     */
    @Override
    public ListProviderSharesResponse listShares(ListSharesRequest request) {
        String path = String.format("/api/2.1/unity-catalog/providers/%s/shares", request.getName());
        return apiClient.GET(path, request, ListProviderSharesResponse.class);
    }
    
	/**
     * Update a provider.
     * 
     * Updates the information for an authentication provider, if the caller is
     * a metastore admin or is the owner of the provider. If the update changes
     * the provider name, the caller must be both a metastore admin and the
     * owner of the provider.
     */
    @Override
    public ProviderInfo update(UpdateProvider request) {
        String path = String.format("/api/2.1/unity-catalog/providers/%s", request.getName());
        return apiClient.PATCH(path, request, ProviderInfo.class);
    }
    
}