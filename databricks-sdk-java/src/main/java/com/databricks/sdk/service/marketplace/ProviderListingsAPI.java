// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Listings are the core entities in the Marketplace. They represent the products that are available
 * for consumption.
 */
@Generated
public class ProviderListingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ProviderListingsAPI.class);

  private final ProviderListingsService impl;

  /** Regular-use constructor */
  public ProviderListingsAPI(ApiClient apiClient) {
    impl = new ProviderListingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProviderListingsAPI(ProviderListingsService mock) {
    impl = mock;
  }

  /**
   * Creates a listing under one of the caller's provider profiles. The listing name, provider ID
   * and visibility are required, and the caller must have access to any share that the listing
   * references. Returns the ID of the new listing.
   */
  public CreateListingResponse create(CreateListingRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteListingRequest().setId(id));
  }

  /**
   * Deletes a listing permanently. The underlying share is not deleted, and consumers who already
   * have access to the share keep that access until it is revoked in Delta Sharing.
   */
  public void delete(DeleteListingRequest request) {
    impl.delete(request);
  }

  public GetListingResponse get(String id) {
    return get(new GetListingRequest().setId(id));
  }

  /** Gets a listing owned by one of the caller's provider profiles. */
  public GetListingResponse get(GetListingRequest request) {
    return impl.get(request);
  }

  /** Lists the listings owned by the provider profiles in the caller's account. */
  public Iterable<Listing> list(GetListingsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        GetListingsResponse::getListings,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates a listing. Send the full listing definition; the listing type cannot be changed after
   * the listing is created, and changing the share re-links the listing to the new share.
   */
  public UpdateListingResponse update(UpdateListingRequest request) {
    return impl.update(request);
  }

  public ProviderListingsService impl() {
    return impl;
  }
}
