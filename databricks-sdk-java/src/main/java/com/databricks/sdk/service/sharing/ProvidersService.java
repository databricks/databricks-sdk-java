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
   * Creates a new authentication provider minimally based on a name and authentication type. The
   * caller must be an admin on the metastore.
   */
  ProviderInfo create(CreateProvider createProvider);

  /**
   * Deletes an authentication provider, if the caller is a metastore admin or is the owner of the
   * provider.
   */
  void delete(DeleteProviderRequest deleteProviderRequest);

  /**
   * Gets a specific authentication provider. The caller must supply the name of the provider, and
   * must either be a metastore admin or the owner of the provider.
   */
  ProviderInfo get(GetProviderRequest getProviderRequest);

  /**
   * Gets an array of available authentication providers. The caller must either be a metastore
   * admin, have the **USE_PROVIDER** privilege on the providers, or be the owner of the providers.
   * Providers not owned by the caller and for which the caller does not have the **USE_PROVIDER**
   * privilege are not included in the response. There is no guarantee of a specific ordering of the
   * elements in the array.
   */
  ListProvidersResponse list(ListProvidersRequest listProvidersRequest);

  /**
   * Get arrays of assets associated with a specified provider's share. The caller is the recipient
   * of the share.
   */
  ListProviderShareAssetsResponse listProviderShareAssets(
      ListProviderShareAssetsRequest listProviderShareAssetsRequest);

  /**
   * Gets an array of a specified provider's shares within the metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner.
   */
  ListProviderSharesResponse listShares(ListSharesRequest listSharesRequest);

  /**
   * Updates the information for an authentication provider, if the caller is a metastore admin or
   * is the owner of the provider. If the update changes the provider name, the caller must be both
   * a metastore admin and the owner of the provider.
   */
  ProviderInfo update(UpdateProvider updateProvider);
}
