// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of StorageCredentials */
@Generated
class StorageCredentialsImpl implements StorageCredentialsService {
  private final ApiClient apiClient;

  public StorageCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public StorageCredentialInfo create(CreateStorageCredential request) {
    String path = "/api/2.1/unity-catalog/storage-credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, StorageCredentialInfo.class, headers);
  }

  @Override
  public void delete(DeleteStorageCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public StorageCredentialInfo get(GetStorageCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, StorageCredentialInfo.class, headers);
  }

  @Override
  public ListStorageCredentialsResponse list(ListStorageCredentialsRequest request) {
    String path = "/api/2.1/unity-catalog/storage-credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListStorageCredentialsResponse.class, headers);
  }

  @Override
  public StorageCredentialInfo update(UpdateStorageCredential request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, StorageCredentialInfo.class, headers);
  }

  @Override
  public ValidateStorageCredentialResponse validate(ValidateStorageCredential request) {
    String path = "/api/2.1/unity-catalog/validate-storage-credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute(
        "POST", path, request, ValidateStorageCredentialResponse.class, headers);
  }
}
