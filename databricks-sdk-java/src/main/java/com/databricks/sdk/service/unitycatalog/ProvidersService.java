// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Databricks Delta Sharing: Providers REST API
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface ProvidersService {
	/**
     * Create an auth provider.
     * 
     * Creates a new authentication provider minimally based on a name and
     * authentication type. The caller must be an admin on the Metastore.
     */
    ProviderInfo create(CreateProvider createProvider);
    
	/**
     * Delete a provider.
     * 
     * Deletes an authentication provider, if the caller is a Metastore admin or
     * is the owner of the provider.
     */
    void delete(DeleteProviderRequest deleteProviderRequest);
    
	/**
     * Get a provider.
     * 
     * Gets a specific authentication provider. The caller must supply the name
     * of the provider, and must either be a Metastore admin or the owner of the
     * provider.
     */
    ProviderInfo get(GetProviderRequest getProviderRequest);
    
	/**
     * List providers.
     * 
     * Gets an array of available authentication providers. The caller must
     * either be a Metastore admin or the owner of the providers. Providers not
     * owned by the caller are not included in the response.
     */
    ListProvidersResponse list(ListProvidersRequest listProvidersRequest);
    
	/**
     * List shares.
     * 
     * Gets an array of all shares within the Metastore where:
     * 
     * * the caller is a Metastore admin, or * the caller is the owner.
     */
    ListProviderSharesResponse listShares(ListSharesRequest listSharesRequest);
    
	/**
     * Update a provider.
     * 
     * Updates the information for an authentication provider, if the caller is
     * a Metastore admin or is the owner of the provider. If the update changes
     * the provider name, the caller must be both a Metastore admin and the
     * owner of the provider.
     */
    ProviderInfo update(UpdateProvider updateProvider);
    
}