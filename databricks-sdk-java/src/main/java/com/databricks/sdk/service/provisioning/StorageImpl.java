// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
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
    return apiClient.POST(path, request, StorageConfiguration.class);
  }

  @Override
  public void delete(DeleteStorageRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations/%s",
            apiClient.configuredAccountID(), request.getStorageConfigurationId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public StorageConfiguration get(GetStorageRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations/%s",
            apiClient.configuredAccountID(), request.getStorageConfigurationId());
    return apiClient.GET(path, request, StorageConfiguration.class);
  }

  @Override
  public Collection<StorageConfiguration> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations", apiClient.configuredAccountID());
    return apiClient.getCollection(path, null, StorageConfiguration.class);
  }
}
