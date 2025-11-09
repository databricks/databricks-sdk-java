// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ResourceQuotas */
@Generated
class ResourceQuotasImpl implements ResourceQuotasService {
  private final ApiClient apiClient;

  public ResourceQuotasImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetQuotaResponse getQuota(GetQuotaRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/resource-quotas/%s/%s/%s",
            request.getParentSecurableType(), request.getParentFullName(), request.getQuotaName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetQuotaResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListQuotasResponse listQuotas(ListQuotasRequest request) {
    String path = "/api/2.1/unity-catalog/resource-quotas/all-resource-quotas";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListQuotasResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
