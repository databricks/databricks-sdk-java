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
  /** Create a new listing */
  CreateListingResponse create(CreateListingRequest createListingRequest);

  /** Delete a listing */
  void delete(DeleteListingRequest deleteListingRequest);

  /** Get a listing */
  GetListingResponse get(GetListingRequest getListingRequest);

  /** List listings owned by this provider */
  GetListingsResponse list(GetListingsRequest getListingsRequest);

  /** Update a listing */
  UpdateListingResponse update(UpdateListingRequest updateListingRequest);
}
