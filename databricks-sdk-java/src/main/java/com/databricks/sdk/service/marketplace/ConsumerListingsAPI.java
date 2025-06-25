// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Listings are the core entities in the Marketplace. They represent the products that are available
 * for consumption.
 */
@Generated
public class ConsumerListingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ConsumerListingsAPI.class);

  private final ConsumerListingsService impl;

  /** Regular-use constructor */
  public ConsumerListingsAPI(ApiClient apiClient) {
    impl = new ConsumerListingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ConsumerListingsAPI(ConsumerListingsService mock) {
    impl = mock;
  }

  /**
   * Batch get a published listing in the Databricks Marketplace that the consumer has access to.
   */
  public BatchGetListingsResponse batchGet(BatchGetListingsRequest request) {
    return impl.batchGet(request);
  }

  public GetListingResponse get(String id) {
    return get(new GetListingRequest().setId(id));
  }

  /** Get a published listing in the Databricks Marketplace that the consumer has access to. */
  public GetListingResponse get(GetListingRequest request) {
    return impl.get(request);
  }

  /** List all published listings in the Databricks Marketplace that the consumer has access to. */
  public Iterable<Listing> list(ListListingsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListListingsResponse::getListings,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Listing> search(String query) {
    return search(new SearchListingsRequest().setQuery(query));
  }

  /**
   * Search published listings in the Databricks Marketplace that the consumer has access to. This
   * query supports a variety of different search parameters and performs fuzzy matching.
   */
  public Iterable<Listing> search(SearchListingsRequest request) {
    return new Paginator<>(
        request,
        impl::search,
        SearchListingsResponse::getListings,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ConsumerListingsService impl() {
    return impl;
  }
}
