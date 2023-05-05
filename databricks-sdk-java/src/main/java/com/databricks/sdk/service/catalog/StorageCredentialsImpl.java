// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, StorageCredentialInfo.class);
  }

  @Override
  public void delete(DeleteStorageCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public StorageCredentialInfo get(GetStorageCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    return apiClient.GET(path, request, StorageCredentialInfo.class);
  }

  @Override
  public Collection<StorageCredentialInfo> list() {
    String path = "/api/2.1/unity-catalog/storage-credentials";
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructCollectionType(Collection.class, StorageCredentialInfo.class);
    try {
      return apiClient.getObjectMapper().readValue(apiClient.GET(path, Collection.class), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public StorageCredentialInfo update(UpdateStorageCredential request) {
    String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
    return apiClient.PATCH(path, request, StorageCredentialInfo.class);
  }

  @Override
  public ValidateStorageCredentialResponse validate(ValidateStorageCredential request) {
    String path = "/api/2.1/unity-catalog/validate-storage-credentials";
    return apiClient.POST(path, request, ValidateStorageCredentialResponse.class);
  }
}
