// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AccountStorageCredentials */
@Generated
class AccountStorageCredentialsImpl implements AccountStorageCredentialsService {
  private final ApiClient apiClient;

  public AccountStorageCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AccountsStorageCredentialInfo create(AccountsCreateStorageCredential request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, AccountsStorageCredentialInfo.class, headers);
  }

  @Override
  public void delete(DeleteAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public AccountsStorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, AccountsStorageCredentialInfo.class, headers);
  }

  @Override
  public ListStorageCredentialsResponse list(ListAccountStorageCredentialsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListStorageCredentialsResponse.class, headers);
  }

  @Override
  public AccountsStorageCredentialInfo update(AccountsUpdateStorageCredential request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, AccountsStorageCredentialInfo.class, headers);
  }
}
