// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ConsumerPersonalizationRequests */
@Generated
class ConsumerPersonalizationRequestsImpl implements ConsumerPersonalizationRequestsService {
  private final ApiClient apiClient;

  public ConsumerPersonalizationRequestsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreatePersonalizationRequestResponse create(CreatePersonalizationRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/personalization-requests",
            request.getListingId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreatePersonalizationRequestResponse.class, headers);
  }

  @Override
  public GetPersonalizationRequestResponse get(GetPersonalizationRequestRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/personalization-requests",
            request.getListingId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetPersonalizationRequestResponse.class, headers);
  }

  @Override
  public ListAllPersonalizationRequestsResponse list(
      ListAllPersonalizationRequestsRequest request) {
    String path = "/api/2.1/marketplace-consumer/personalization-requests";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAllPersonalizationRequestsResponse.class, headers);
  }
}
