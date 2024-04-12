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

  public CreateListingResponse create(Listing listing) {
    return create(new CreateListingRequest().setListing(listing));
  }

  /**
   * Create a listing.
   *
   * <p>Create a new listing
   */
  public CreateListingResponse create(CreateListingRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteListingRequest().setId(id));
  }

  /**
   * Delete a listing.
   *
   * <p>Delete a listing
   */
  public void delete(DeleteListingRequest request) {
    impl.delete(request);
  }

  public GetListingResponse get(String id) {
    return get(new GetListingRequest().setId(id));
  }

  /**
   * Get a listing.
   *
   * <p>Get a listing
   */
  public GetListingResponse get(GetListingRequest request) {
    return impl.get(request);
  }

  /**
   * List listings.
   *
   * <p>List listings owned by this provider
   */
  public Iterable<Listing> list(GetListingsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        GetListingsResponse::getListings,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public UpdateListingResponse update(String id, Listing listing) {
    return update(new UpdateListingRequest().setId(id).setListing(listing));
  }

  /**
   * Update listing.
   *
   * <p>Update a listing
   */
  public UpdateListingResponse update(UpdateListingRequest request) {
    return impl.update(request);
  }

  public ProviderListingsService impl() {
    return impl;
  }
}
