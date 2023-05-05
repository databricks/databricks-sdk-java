// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountStorageCredentials */
@Generated
class AccountStorageCredentialsImpl implements AccountStorageCredentialsService {
  private final ApiClient apiClient;

  public AccountStorageCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public StorageCredentialInfo create(CreateStorageCredential request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.POST(path, request, StorageCredentialInfo.class);
  }

  @Override
  public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, StorageCredentialInfo.class);
  }

  @Override
  public Collection<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructCollectionType(Collection.class, Object.class);
    try {
      return apiClient
          .getObjectMapper()
          .readValue(new Gson().toJson(apiClient.GET(path, request, Collection.class)), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
