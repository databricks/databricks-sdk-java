// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

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

  /** Creates a provider profile in the caller's account. Returns the ID of the new profile. */
  public CreateProviderResponse create(CreateProviderRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteProviderRequest().setId(id));
  }

  /** Deletes a provider profile and all of the listings that it owns. */
  public void delete(DeleteProviderRequest request) {
    impl.delete(request);
  }

  public GetProviderResponse get(String id) {
    return get(new GetProviderRequest().setId(id));
  }

  /** Gets a provider profile by ID. */
  public GetProviderResponse get(GetProviderRequest request) {
    return impl.get(request);
  }

  /** Lists the provider profiles in the caller's account. */
  public Iterable<ProviderInfo> list(ListProvidersRequest request) {
    return Paginator.newTokenPagination(
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

  /** Updates a provider profile. Send the full profile definition. */
  public UpdateProviderResponse update(UpdateProviderRequest request) {
    return impl.update(request);
  }

  public ProviderProvidersService impl() {
    return impl;
  }
}
