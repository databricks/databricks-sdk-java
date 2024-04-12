// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Marketplace exchanges allow providers to share their listings with a curated set of customers.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProviderExchangesService {
  /**
   * Add an exchange for listing.
   *
   * <p>Associate an exchange with a listing
   */
  AddExchangeForListingResponse addListingToExchange(
      AddExchangeForListingRequest addExchangeForListingRequest);

  /**
   * Create an exchange.
   *
   * <p>Create an exchange
   */
  CreateExchangeResponse create(CreateExchangeRequest createExchangeRequest);

  /**
   * Delete an exchange.
   *
   * <p>This removes a listing from marketplace.
   */
  void delete(DeleteExchangeRequest deleteExchangeRequest);

  /**
   * Remove an exchange for listing.
   *
   * <p>Disassociate an exchange with a listing
   */
  void deleteListingFromExchange(RemoveExchangeForListingRequest removeExchangeForListingRequest);

  /**
   * Get an exchange.
   *
   * <p>Get an exchange.
   */
  GetExchangeResponse get(GetExchangeRequest getExchangeRequest);

  /**
   * List exchanges.
   *
   * <p>List exchanges visible to provider
   */
  ListExchangesResponse list(ListExchangesRequest listExchangesRequest);

  /**
   * List exchanges for listing.
   *
   * <p>List exchanges associated with a listing
   */
  ListExchangesForListingResponse listExchangesForListing(
      ListExchangesForListingRequest listExchangesForListingRequest);

  /**
   * List listings for exchange.
   *
   * <p>List listings associated with an exchange
   */
  ListListingsForExchangeResponse listListingsForExchange(
      ListListingsForExchangeRequest listListingsForExchangeRequest);

  /**
   * Update exchange.
   *
   * <p>Update an exchange
   */
  UpdateExchangeResponse update(UpdateExchangeRequest updateExchangeRequest);
}
