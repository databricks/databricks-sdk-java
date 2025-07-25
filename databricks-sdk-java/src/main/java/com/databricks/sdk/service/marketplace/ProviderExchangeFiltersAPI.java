// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Marketplace exchanges filters curate which groups can access an exchange. */
@Generated
public class ProviderExchangeFiltersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ProviderExchangeFiltersAPI.class);

  private final ProviderExchangeFiltersService impl;

  /** Regular-use constructor */
  public ProviderExchangeFiltersAPI(ApiClient apiClient) {
    impl = new ProviderExchangeFiltersImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProviderExchangeFiltersAPI(ProviderExchangeFiltersService mock) {
    impl = mock;
  }

  /** Add an exchange filter. */
  public CreateExchangeFilterResponse create(CreateExchangeFilterRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteExchangeFilterRequest().setId(id));
  }

  /** Delete an exchange filter */
  public void delete(DeleteExchangeFilterRequest request) {
    impl.delete(request);
  }

  public Iterable<ExchangeFilter> list(String exchangeId) {
    return list(new ListExchangeFiltersRequest().setExchangeId(exchangeId));
  }

  /** List exchange filter */
  public Iterable<ExchangeFilter> list(ListExchangeFiltersRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListExchangeFiltersResponse::getFilters,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Update an exchange filter. */
  public UpdateExchangeFilterResponse update(UpdateExchangeFilterRequest request) {
    return impl.update(request);
  }

  public ProviderExchangeFiltersService impl() {
    return impl;
  }
}
