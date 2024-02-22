// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;

/**
 * A data provider is an object representing the organization in the real world who shares the data.
 * A provider contains shares which further contain the shared data.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProvidersService {
  /**
   * Create an auth provider.
   *
   * <p>Creates a new authentication provider minimally based on a name and authentication type. The
   * caller must be an admin on the metastore.
   */
  ProviderInfo create(CreateProvider createProvider);

  /**
   * Delete a provider.
   *
   * <p>Deletes an authentication provider, if the caller is a metastore admin or is the owner of
   * the provider.
   */
  DeleteResponse delete(DeleteProviderRequest deleteProviderRequest);

  /**
   * Get a provider.
   *
   * <p>Gets a specific authentication provider. The caller must supply the name of the provider,
   * and must either be a metastore admin or the owner of the provider.
   */
  ProviderInfo get(GetProviderRequest getProviderRequest);

  /**
   * List providers.
   *
   * <p>Gets an array of available authentication providers. The caller must either be a metastore
   * admin or the owner of the providers. Providers not owned by the caller are not included in the
   * response. There is no guarantee of a specific ordering of the elements in the array.
   */
  ListProvidersResponse list(ListProvidersRequest listProvidersRequest);

  /**
   * List shares by Provider.
   *
   * <p>Gets an array of a specified provider's shares within the metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner.
   */
  ListProviderSharesResponse listShares(ListSharesRequest listSharesRequest);

  /**
   * Update a provider.
   *
   * <p>Updates the information for an authentication provider, if the caller is a metastore admin
   * or is the owner of the provider. If the update changes the provider name, the caller must be
   * both a metastore admin and the owner of the provider.
   */
  ProviderInfo update(UpdateProvider updateProvider);
}
