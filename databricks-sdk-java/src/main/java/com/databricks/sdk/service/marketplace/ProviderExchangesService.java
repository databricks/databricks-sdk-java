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
  /** Associate an exchange with a listing */
  AddExchangeForListingResponse addListingToExchange(
      AddExchangeForListingRequest addExchangeForListingRequest);

  /** Create an exchange */
  CreateExchangeResponse create(CreateExchangeRequest createExchangeRequest);

  /** This removes a listing from marketplace. */
  void delete(DeleteExchangeRequest deleteExchangeRequest);

  /** Disassociate an exchange with a listing */
  void deleteListingFromExchange(RemoveExchangeForListingRequest removeExchangeForListingRequest);

  /** Get an exchange. */
  GetExchangeResponse get(GetExchangeRequest getExchangeRequest);

  /** List exchanges visible to provider */
  ListExchangesResponse list(ListExchangesRequest listExchangesRequest);

  /** List exchanges associated with a listing */
  ListExchangesForListingResponse listExchangesForListing(
      ListExchangesForListingRequest listExchangesForListingRequest);

  /** List listings associated with an exchange */
  ListListingsForExchangeResponse listListingsForExchange(
      ListListingsForExchangeRequest listListingsForExchangeRequest);

  /** Update an exchange */
  UpdateExchangeResponse update(UpdateExchangeRequest updateExchangeRequest);
}
