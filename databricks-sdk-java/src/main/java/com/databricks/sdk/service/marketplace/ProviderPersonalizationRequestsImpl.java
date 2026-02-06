// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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

  @Override
  public UpdatePersonalizationRequestResponse update(UpdatePersonalizationRequestRequest request) {
    String path =
        String.format(
            "/api/2.0/marketplace-provider/listings/%s/personalization-requests/%s/request-status",
            request.getListingId(), request.getRequestId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, UpdatePersonalizationRequestResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
