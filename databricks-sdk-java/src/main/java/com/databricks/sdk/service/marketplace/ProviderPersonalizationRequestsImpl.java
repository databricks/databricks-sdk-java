// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ProviderPersonalizationRequests */
@Generated
class ProviderPersonalizationRequestsImpl implements ProviderPersonalizationRequestsService {
  private final ApiClient apiClient;

  public ProviderPersonalizationRequestsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListAllPersonalizationRequestsResponse list(
      ListAllPersonalizationRequestsRequest request) {
    String path = "/api/2.0/marketplace-provider/personalization-requests";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAllPersonalizationRequestsResponse.class, headers);
  }

  @Override
  public UpdatePersonalizationRequestResponse update(UpdatePersonalizationRequestRequest request) {
    String path =
        String.format(
            "/api/2.0/marketplace-provider/listings/%s/personalization-requests/%s/request-status",
            request.getListingId(), request.getRequestId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, UpdatePersonalizationRequestResponse.class, headers);
  }
}
