// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ConsumerListings */
@Generated
class ConsumerListingsImpl implements ConsumerListingsService {
  private final ApiClient apiClient;

  public ConsumerListingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public BatchGetListingsResponse batchGet(BatchGetListingsRequest request) {
    String path = "/api/2.1/marketplace-consumer/listings:batchGet";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, BatchGetListingsResponse.class, headers);
  }

  @Override
  public GetListingResponse get(GetListingRequest request) {
    String path = String.format("/api/2.1/marketplace-consumer/listings/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetListingResponse.class, headers);
  }

  @Override
  public ListListingsResponse list(ListListingsRequest request) {
    String path = "/api/2.1/marketplace-consumer/listings";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListListingsResponse.class, headers);
  }

  @Override
  public SearchListingsResponse search(SearchListingsRequest request) {
    String path = "/api/2.1/marketplace-consumer/search-listings";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, SearchListingsResponse.class, headers);
  }
}
