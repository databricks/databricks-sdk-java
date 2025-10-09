// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.Collection;

/** Package-local implementation of Storage */
@Generated
class StorageImpl implements StorageService {
  private final ApiClient apiClient;

  public StorageImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public StorageConfiguration create(CreateStorageConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, StorageConfiguration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public StorageConfiguration delete(DeleteStorageRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations/%s",
            apiClient.configuredAccountID(), request.getStorageConfigurationId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, StorageConfiguration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public StorageConfiguration get(GetStorageRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations/%s",
            apiClient.configuredAccountID(), request.getStorageConfigurationId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, StorageConfiguration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Collection<StorageConfiguration> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations", apiClient.configuredAccountID());
    Request req = new Request("GET", path);
    req.withHeader("Accept", "application/json");
    return apiClient.getCollection(req, StorageConfiguration.class);
  }
}
