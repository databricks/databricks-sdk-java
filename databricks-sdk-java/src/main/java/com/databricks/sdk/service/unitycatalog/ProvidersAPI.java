// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Databricks Delta Sharing: Providers REST API */
public class ProvidersAPI {
  private final ProvidersService impl;

  /** Regular-use constructor */
  public ProvidersAPI(ApiClient apiClient) {
    impl = new ProvidersImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProvidersAPI(ProvidersService mock) {
    impl = mock;
  }

  /**
   * Create an auth provider.
   *
   * <p>Creates a new authentication provider minimally based on a name and authentication type. The
   * caller must be an admin on the metastore.
   */
  public ProviderInfo create(CreateProvider request) {
    return impl.create(request);
  }

  /**
   * Delete a provider.
   *
   * <p>Deletes an authentication provider, if the caller is a metastore admin or is the owner of
   * the provider.
   */
  public void delete(DeleteProviderRequest request) {
    impl.delete(request);
  }

  /**
   * Get a provider.
   *
   * <p>Gets a specific authentication provider. The caller must supply the name of the provider,
   * and must either be a metastore admin or the owner of the provider.
   */
  public ProviderInfo get(GetProviderRequest request) {
    return impl.get(request);
  }

  /**
   * List providers.
   *
   * <p>Gets an array of available authentication providers. The caller must either be a metastore
   * admin or the owner of the providers. Providers not owned by the caller are not included in the
   * response. There is no guarantee of a specific ordering of the elements in the array.
   */
  public ListProvidersResponse list(ListProvidersRequest request) {
    return impl.list(request);
  }

  /**
   * List shares by Provider.
   *
   * <p>Gets an array of a specified provider's shares within the metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner.
   */
  public ListProviderSharesResponse listShares(ListSharesRequest request) {
    return impl.listShares(request);
  }

  /**
   * Update a provider.
   *
   * <p>Updates the information for an authentication provider, if the caller is a metastore admin
   * or is the owner of the provider. If the update changes the provider name, the caller must be
   * both a metastore admin and the owner of the provider.
   */
  public ProviderInfo update(UpdateProvider request) {
    return impl.update(request);
  }

  public ProvidersService impl() {
    return impl;
  }
}
