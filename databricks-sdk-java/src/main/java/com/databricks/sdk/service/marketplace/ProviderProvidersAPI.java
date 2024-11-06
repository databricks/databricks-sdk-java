// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Providers are entities that manage assets in Marketplace. */
@Generated
public class ProviderProvidersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ProviderProvidersAPI.class);

  private final ProviderProvidersService impl;

  /** Regular-use constructor */
  public ProviderProvidersAPI(ApiClient apiClient) {
    impl = new ProviderProvidersImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProviderProvidersAPI(ProviderProvidersService mock) {
    impl = mock;
  }

  public CreateProviderResponse create(ProviderInfo provider) {
    return create(new CreateProviderRequest().setProvider(provider));
  }

  /**
   * Create a provider.
   *
   * <p>Create a provider
   */
  public CreateProviderResponse create(CreateProviderRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteProviderRequest().setId(id));
  }

  /**
   * Delete provider.
   *
   * <p>Delete provider
   */
  public void delete(DeleteProviderRequest request) {
    impl.delete(request);
  }

  public GetProviderResponse get(String id) {
    return get(new GetProviderRequest().setId(id));
  }

  /**
   * Get provider.
   *
   * <p>Get provider profile
   */
  public GetProviderResponse get(GetProviderRequest request) {
    return impl.get(request);
  }

  /**
   * List providers.
   *
   * <p>List provider profiles for account.
   */
  public Iterable<ProviderInfo> list(ListProvidersRequest request) {
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

  public UpdateProviderResponse update(String id, ProviderInfo provider) {
    return update(new UpdateProviderRequest().setId(id).setProvider(provider));
  }

  /**
   * Update provider.
   *
   * <p>Update provider profile
   */
  public UpdateProviderResponse update(UpdateProviderRequest request) {
    return impl.update(request);
  }

  public ProviderProvidersService impl() {
    return impl;
  }
}
