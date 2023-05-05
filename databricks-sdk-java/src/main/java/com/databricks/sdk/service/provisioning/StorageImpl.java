// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructCollectionType(Collection.class, StorageConfiguration.class);
    try {
      return apiClient.getObjectMapper().readValue(apiClient.GET(path, Collection.class), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
