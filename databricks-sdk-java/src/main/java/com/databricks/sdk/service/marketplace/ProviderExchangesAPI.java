// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Marketplace exchanges allow providers to share their listings with a curated set of customers.
 */
@Generated
public class ProviderExchangesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ProviderExchangesAPI.class);

  private final ProviderExchangesService impl;

  /** Regular-use constructor */
  public ProviderExchangesAPI(ApiClient apiClient) {
    impl = new ProviderExchangesImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProviderExchangesAPI(ProviderExchangesService mock) {
    impl = mock;
  }

  public AddExchangeForListingResponse addListingToExchange(String listingId, String exchangeId) {
    return addListingToExchange(
        new AddExchangeForListingRequest().setListingId(listingId).setExchangeId(exchangeId));
  }

  /**
   * Add an exchange for listing.
   *
   * <p>Associate an exchange with a listing
   */
  public AddExchangeForListingResponse addListingToExchange(AddExchangeForListingRequest request) {
    return impl.addListingToExchange(request);
  }

  public CreateExchangeResponse create(Exchange exchange) {
    return create(new CreateExchangeRequest().setExchange(exchange));
  }

  /**
   * Create an exchange.
   *
   * <p>Create an exchange
   */
  public CreateExchangeResponse create(CreateExchangeRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteExchangeRequest().setId(id));
  }

  /**
   * Delete an exchange.
   *
   * <p>This removes a listing from marketplace.
   */
  public void delete(DeleteExchangeRequest request) {
    impl.delete(request);
  }

  public void deleteListingFromExchange(String id) {
    deleteListingFromExchange(new RemoveExchangeForListingRequest().setId(id));
  }

  /**
   * Remove an exchange for listing.
   *
   * <p>Disassociate an exchange with a listing
   */
  public void deleteListingFromExchange(RemoveExchangeForListingRequest request) {
    impl.deleteListingFromExchange(request);
  }

  public GetExchangeResponse get(String id) {
    return get(new GetExchangeRequest().setId(id));
  }

  /**
   * Get an exchange.
   *
   * <p>Get an exchange.
   */
  public GetExchangeResponse get(GetExchangeRequest request) {
    return impl.get(request);
  }

  /**
   * List exchanges.
   *
   * <p>List exchanges visible to provider
   */
  public Iterable<Exchange> list(ListExchangesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListExchangesResponse::getExchanges,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<ExchangeListing> listExchangesForListing(String listingId) {
    return listExchangesForListing(new ListExchangesForListingRequest().setListingId(listingId));
  }

  /**
   * List exchanges for listing.
   *
   * <p>List exchanges associated with a listing
   */
  public Iterable<ExchangeListing> listExchangesForListing(ListExchangesForListingRequest request) {
    return new Paginator<>(
        request,
        impl::listExchangesForListing,
        ListExchangesForListingResponse::getExchangeListing,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<ExchangeListing> listListingsForExchange(String exchangeId) {
    return listListingsForExchange(new ListListingsForExchangeRequest().setExchangeId(exchangeId));
  }

  /**
   * List listings for exchange.
   *
   * <p>List listings associated with an exchange
   */
  public Iterable<ExchangeListing> listListingsForExchange(ListListingsForExchangeRequest request) {
    return new Paginator<>(
        request,
        impl::listListingsForExchange,
        ListListingsForExchangeResponse::getExchangeListings,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public UpdateExchangeResponse update(String id, Exchange exchange) {
    return update(new UpdateExchangeRequest().setId(id).setExchange(exchange));
  }

  /**
   * Update exchange.
   *
   * <p>Update an exchange
   */
  public UpdateExchangeResponse update(UpdateExchangeRequest request) {
    return impl.update(request);
  }

  public ProviderExchangesService impl() {
    return impl;
  }
}
