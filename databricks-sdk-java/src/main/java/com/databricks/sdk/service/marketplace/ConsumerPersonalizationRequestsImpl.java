// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CreatePersonalizationRequestResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetPersonalizationRequestResponse get(GetPersonalizationRequestRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/personalization-requests",
            request.getListingId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, GetPersonalizationRequestResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAllPersonalizationRequestsResponse list(
      ListAllPersonalizationRequestsRequest request) {
    String path = "/api/2.1/marketplace-consumer/personalization-requests";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListAllPersonalizationRequestsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
