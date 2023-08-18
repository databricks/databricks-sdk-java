// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of TableConstraints */
@Generated
class TableConstraintsImpl implements TableConstraintsService {
  private final ApiClient apiClient;

  public TableConstraintsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public TableConstraint create(CreateTableConstraint request) {
    String path = "/api/2.1/unity-catalog/constraints";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, TableConstraint.class, headers);
  }

  @Override
  public void delete(DeleteTableConstraintRequest request) {
    String path = String.format("/api/2.1/unity-catalog/constraints/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }
}
