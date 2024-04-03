// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of SystemSchemas */
@Generated
class SystemSchemasImpl implements SystemSchemasService {
  private final ApiClient apiClient;

  public SystemSchemasImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void disable(DisableRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/metastores/%s/systemschemas/%s",
            request.getMetastoreId(), request.getSchemaName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DisableResponse.class, headers);
  }

  @Override
  public void enable(EnableRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/metastores/%s/systemschemas/%s",
            request.getMetastoreId(), request.getSchemaName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.PUT(path, null, EnableResponse.class, headers);
  }

  @Override
  public ListSystemSchemasResponse list(ListSystemSchemasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/metastores/%s/systemschemas", request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListSystemSchemasResponse.class, headers);
  }
}
