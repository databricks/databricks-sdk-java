// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data provider is an object representing the organization in the real world who shares the data.
 * A provider contains shares which further contain the shared data.
 */
@Generated
public class ProvidersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ProvidersAPI.class);

  private final ProvidersService impl;

  /** Regular-use constructor */
  public ProvidersAPI(ApiClient apiClient) {
    impl = new ProvidersImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProvidersAPI(ProvidersService mock) {
    impl = mock;
  }

  public ProviderInfo create(String name, AuthenticationType authenticationType) {
    return create(new CreateProvider().setName(name).setAuthenticationType(authenticationType));
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

  public void delete(String name) {
    delete(new DeleteProviderRequest().setName(name));
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

  public ProviderInfo get(String name) {
    return get(new GetProviderRequest().setName(name));
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
  public Iterable<ProviderInfo> list(ListProvidersRequest request) {

    if (request.getMaxResults() == null) {
      request.setMaxResults(0L);
    }
    return new Paginator<>(
        request,
        impl::list,
        ListProvidersResponse::getProviders,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<ProviderShare> listShares(String name) {
    return listShares(new ListSharesRequest().setName(name));
  }

  /**
   * List shares by Provider.
   *
   * <p>Gets an array of a specified provider's shares within the metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner.
   */
  public Iterable<ProviderShare> listShares(ListSharesRequest request) {

    if (request.getMaxResults() == null) {
      request.setMaxResults(0L);
    }
    return new Paginator<>(
        request,
        impl::listShares,
        ListProviderSharesResponse::getShares,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ProviderInfo update(String name) {
    return update(new UpdateProvider().setName(name));
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
