// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ProviderListings */
@Generated
class ProviderListingsImpl implements ProviderListingsService {
  private final ApiClient apiClient;

  public ProviderListingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateListingResponse create(CreateListingRequest request) {
    String path = "/api/2.0/marketplace-provider/listing";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateListingResponse.class, headers);
  }

  @Override
  public void delete(DeleteListingRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/listings/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteListingResponse.class, headers);
  }

  @Override
  public GetListingResponse get(GetListingRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/listings/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetListingResponse.class, headers);
  }

  @Override
  public GetListingsResponse list(GetListingsRequest request) {
    String path = "/api/2.0/marketplace-provider/listings";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetListingsResponse.class, headers);
  }

  @Override
  public UpdateListingResponse update(UpdateListingRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/listings/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, UpdateListingResponse.class, headers);
  }
}
