// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

/**
 * Databricks Providers REST API
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface ProvidersService {
  /**
   * Create an auth provider.
   *
   * <p>Creates a new authentication provider minimally based on a name and authentication type. The
   * caller must be an admin on the metastore.
   *
   * @param createProvider a {@link com.databricks.sdk.service.sharing.CreateProvider} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  ProviderInfo create(CreateProvider createProvider);

  /**
   * Delete a provider.
   *
   * <p>Deletes an authentication provider, if the caller is a metastore admin or is the owner of
   * the provider.
   *
   * @param deleteProviderRequest a {@link com.databricks.sdk.service.sharing.DeleteProviderRequest} object
   */
  void delete(DeleteProviderRequest deleteProviderRequest);

  /**
   * Get a provider.
   *
   * <p>Gets a specific authentication provider. The caller must supply the name of the provider,
   * and must either be a metastore admin or the owner of the provider.
   *
   * @param getProviderRequest a {@link com.databricks.sdk.service.sharing.GetProviderRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  ProviderInfo get(GetProviderRequest getProviderRequest);

  /**
   * List providers.
   *
   * <p>Gets an array of available authentication providers. The caller must either be a metastore
   * admin or the owner of the providers. Providers not owned by the caller are not included in the
   * response. There is no guarantee of a specific ordering of the elements in the array.
   *
   * @param listProvidersRequest a {@link com.databricks.sdk.service.sharing.ListProvidersRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.ListProvidersResponse} object
   */
  ListProvidersResponse list(ListProvidersRequest listProvidersRequest);

  /**
   * List shares by Provider.
   *
   * <p>Gets an array of a specified provider's shares within the metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner.
   *
   * @param listSharesRequest a {@link com.databricks.sdk.service.sharing.ListSharesRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.ListProviderSharesResponse} object
   */
  ListProviderSharesResponse listShares(ListSharesRequest listSharesRequest);

  /**
   * Update a provider.
   *
   * <p>Updates the information for an authentication provider, if the caller is a metastore admin
   * or is the owner of the provider. If the update changes the provider name, the caller must be
   * both a metastore admin and the owner of the provider.
   *
   * @param updateProvider a {@link com.databricks.sdk.service.sharing.UpdateProvider} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  ProviderInfo update(UpdateProvider updateProvider);
}
