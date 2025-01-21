// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ProviderExchanges */
@Generated
class ProviderExchangesImpl implements ProviderExchangesService {
  private final ApiClient apiClient;

  public ProviderExchangesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AddExchangeForListingResponse addListingToExchange(AddExchangeForListingRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges-for-listing";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, AddExchangeForListingResponse.class, headers);
  }

  @Override
  public CreateExchangeResponse create(CreateExchangeRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, CreateExchangeResponse.class, headers);
  }

  @Override
  public void delete(DeleteExchangeRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/exchanges/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteExchangeResponse.class, headers);
  }

  @Override
  public void deleteListingFromExchange(RemoveExchangeForListingRequest request) {
    String path =
        String.format("/api/2.0/marketplace-exchange/exchanges-for-listing/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, RemoveExchangeForListingResponse.class, headers);
  }

  @Override
  public GetExchangeResponse get(GetExchangeRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/exchanges/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetExchangeResponse.class, headers);
  }

  @Override
  public ListExchangesResponse list(ListExchangesRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListExchangesResponse.class, headers);
  }

  @Override
  public ListExchangesForListingResponse listExchangesForListing(
      ListExchangesForListingRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges-for-listing";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListExchangesForListingResponse.class, headers);
  }

  @Override
  public ListListingsForExchangeResponse listListingsForExchange(
      ListListingsForExchangeRequest request) {
    String path = "/api/2.0/marketplace-exchange/listings-for-exchange";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListListingsForExchangeResponse.class, headers);
  }

  @Override
  public UpdateExchangeResponse update(UpdateExchangeRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/exchanges/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PUT", path, request, UpdateExchangeResponse.class, headers);
  }
}
