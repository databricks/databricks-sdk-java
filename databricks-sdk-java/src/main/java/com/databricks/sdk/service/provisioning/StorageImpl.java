// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of Storage */
class StorageImpl implements StorageService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for StorageImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public StorageImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public StorageConfiguration create(CreateStorageConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations", apiClient.configuredAccountID());
    return apiClient.POST(path, request, StorageConfiguration.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteStorageRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations/%s",
            apiClient.configuredAccountID(), request.getStorageConfigurationId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public StorageConfiguration get(GetStorageRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations/%s",
            apiClient.configuredAccountID(), request.getStorageConfigurationId());
    return apiClient.GET(path, request, StorageConfiguration.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<StorageConfiguration> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/storage-configurations", apiClient.configuredAccountID());
    return apiClient.GET(path, Collection.class);
  }
}
