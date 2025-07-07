// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DefaultWarehouseId */
@Generated
class DefaultWarehouseIdImpl implements DefaultWarehouseIdService {
  private final ApiClient apiClient;

  public DefaultWarehouseIdImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteDefaultWarehouseIdResponse delete(DeleteDefaultWarehouseIdRequest request) {
    String path = "/api/2.0/settings/types/default_warehouse_id/names/default";
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteDefaultWarehouseIdResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DefaultWarehouseId get(GetDefaultWarehouseIdRequest request) {
    String path = "/api/2.0/settings/types/default_warehouse_id/names/default";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DefaultWarehouseId.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DefaultWarehouseId update(UpdateDefaultWarehouseIdRequest request) {
    String path = "/api/2.0/settings/types/default_warehouse_id/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DefaultWarehouseId.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
