// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Providers are the entities that publish listings to the Marketplace. */
@Generated
public class ConsumerProvidersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ConsumerProvidersAPI.class);

  private final ConsumerProvidersService impl;

  /** Regular-use constructor */
  public ConsumerProvidersAPI(ApiClient apiClient) {
    impl = new ConsumerProvidersImpl(apiClient);
  }

  /** Constructor for mocks */
  public ConsumerProvidersAPI(ConsumerProvidersService mock) {
    impl = mock;
  }

  public GetProviderResponse get(String id) {
    return get(new GetProviderRequest().setId(id));
  }

  /**
   * Get a provider.
   *
   * <p>Get a provider in the Databricks Marketplace with at least one visible listing.
   */
  public GetProviderResponse get(GetProviderRequest request) {
    return impl.get(request);
  }

  /**
   * List providers.
   *
   * <p>List all providers in the Databricks Marketplace with at least one visible listing.
   */
  public Iterable<ProviderInfo> list(ListProvidersRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListProvidersResponse::getProviders,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ConsumerProvidersService impl() {
    return impl;
  }
}
