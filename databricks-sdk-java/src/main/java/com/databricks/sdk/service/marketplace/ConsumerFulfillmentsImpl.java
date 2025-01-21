// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ConsumerFulfillments */
@Generated
class ConsumerFulfillmentsImpl implements ConsumerFulfillmentsService {
  private final ApiClient apiClient;

  public ConsumerFulfillmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetListingContentMetadataResponse get(GetListingContentMetadataRequest request) {
    String path =
        String.format("/api/2.1/marketplace-consumer/listings/%s/content", request.getListingId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, request, GetListingContentMetadataResponse.class, headers);
  }

  @Override
  public ListFulfillmentsResponse list(ListFulfillmentsRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/fulfillments", request.getListingId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListFulfillmentsResponse.class, headers);
  }
}
