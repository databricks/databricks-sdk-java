// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Fulfillments are entities that allow consumers to preview installations. */
@Generated
public class ConsumerFulfillmentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ConsumerFulfillmentsAPI.class);

  private final ConsumerFulfillmentsService impl;

  /** Regular-use constructor */
  public ConsumerFulfillmentsAPI(ApiClient apiClient) {
    impl = new ConsumerFulfillmentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ConsumerFulfillmentsAPI(ConsumerFulfillmentsService mock) {
    impl = mock;
  }

  public Iterable<SharedDataObject> get(String listingId) {
    return get(new GetListingContentMetadataRequest().setListingId(listingId));
  }

  /**
   * Get listing content metadata.
   *
   * <p>Get a high level preview of the metadata of listing installable content.
   */
  public Iterable<SharedDataObject> get(GetListingContentMetadataRequest request) {
    return new Paginator<>(
        request,
        impl::get,
        GetListingContentMetadataResponse::getSharedDataObjects,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<ListingFulfillment> list(String listingId) {
    return list(new ListFulfillmentsRequest().setListingId(listingId));
  }

  /**
   * List all listing fulfillments.
   *
   * <p>Get all listings fulfillments associated with a listing. A _fulfillment_ is a potential
   * installation. Standard installations contain metadata about the attached share or git repo.
   * Only one of these fields will be present. Personalized installations contain metadata about the
   * attached share or git repo, as well as the Delta Sharing recipient type.
   */
  public Iterable<ListingFulfillment> list(ListFulfillmentsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListFulfillmentsResponse::getFulfillments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ConsumerFulfillmentsService impl() {
    return impl;
  }
}
