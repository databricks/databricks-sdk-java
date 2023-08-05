// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of AccountStorageCredentials */
@Generated
class AccountStorageCredentialsImpl implements AccountStorageCredentialsService {
  private final ApiClient apiClient;

  public AccountStorageCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public StorageCredentialInfo create(AccountsCreateStorageCredential request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.POST(path, request, StorageCredentialInfo.class);
  }

  @Override
  public void delete(DeleteAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, StorageCredentialInfo.class, "application/json");
  }

  @Override
  public ListStorageCredentialsResponse list(ListAccountStorageCredentialsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, ListStorageCredentialsResponse.class, "application/json");
  }

  @Override
  public StorageCredentialInfo update(AccountsUpdateStorageCredential request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.PUT(path, request, StorageCredentialInfo.class);
  }
}
