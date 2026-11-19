// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Listings are the core entities in the Marketplace. They represent the products that are available
 * for consumption.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProviderListingsService {
  /**
   * Creates a listing under one of the caller's provider profiles. The listing name, provider ID
   * and visibility are required, and the caller must have access to any share that the listing
   * references. Returns the ID of the new listing.
   */
  CreateListingResponse create(CreateListingRequest createListingRequest);

  /**
   * Deletes a listing permanently. The underlying share is not deleted, and consumers who already
   * have access to the share keep that access until it is revoked in Delta Sharing.
   */
  void delete(DeleteListingRequest deleteListingRequest);

  /** Gets a listing owned by one of the caller's provider profiles. */
  GetListingResponse get(GetListingRequest getListingRequest);

  /** Lists the listings owned by the provider profiles in the caller's account. */
  GetListingsResponse list(GetListingsRequest getListingsRequest);

  /**
   * Updates a listing. Send the full listing definition; the listing type cannot be changed after
   * the listing is created, and changing the share re-links the listing to the new share.
   */
  UpdateListingResponse update(UpdateListingRequest updateListingRequest);
}
