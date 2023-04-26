// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of StorageCredentials */
class StorageCredentialsImpl implements StorageCredentialsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for StorageCredentialsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public StorageCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public StorageCredentialInfo create(CreateStorageCredential request) {
    String path = "/api/2.1/unity-catalog/storage-credentials";
    return apiClient.POST(path, request, StorageCredentialInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteStorageCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public StorageCredentialInfo get(GetStorageCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    return apiClient.GET(path, request, StorageCredentialInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<StorageCredentialInfo> list() {
    String path = "/api/2.1/unity-catalog/storage-credentials";
    return apiClient.GET(path, Collection.class);
  }

  /** {@inheritDoc} */
  @Override
  public StorageCredentialInfo update(UpdateStorageCredential request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    return apiClient.PATCH(path, request, StorageCredentialInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ValidateStorageCredentialResponse validate(ValidateStorageCredential request) {
    String path = "/api/2.1/unity-catalog/validate-storage-credentials";
    return apiClient.POST(path, request, ValidateStorageCredentialResponse.class);
  }
}
