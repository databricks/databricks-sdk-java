// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, GetListingContentMetadataResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListFulfillmentsResponse list(ListFulfillmentsRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/fulfillments", request.getListingId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListFulfillmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
