// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetQuotaResponse.class, headers);
  }

  @Override
  public ListQuotasResponse listQuotas(ListQuotasRequest request) {
    String path = "/api/2.1/unity-catalog/resource-quotas/all-resource-quotas";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListQuotasResponse.class, headers);
  }
}
