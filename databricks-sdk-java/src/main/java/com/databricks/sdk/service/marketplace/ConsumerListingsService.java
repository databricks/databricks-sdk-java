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
public interface ConsumerListingsService {
  /**
   * Get listing.
   *
   * <p>Get a published listing in the Databricks Marketplace that the consumer has access to.
   */
  GetListingResponse get(GetListingRequest getListingRequest);

  /**
   * List listings.
   *
   * <p>List all published listings in the Databricks Marketplace that the consumer has access to.
   */
  ListListingsResponse list(ListListingsRequest listListingsRequest);

  /**
   * Search listings.
   *
   * <p>Search published listings in the Databricks Marketplace that the consumer has access to.
   * This query supports a variety of different search parameters and performs fuzzy matching.
   */
  SearchListingsResponse search(SearchListingsRequest searchListingsRequest);
}
