// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AccountMetastores */
@Generated
class AccountMetastoresImpl implements AccountMetastoresService {
  private final ApiClient apiClient;

  public AccountMetastoresImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AccountsMetastoreInfo create(AccountsCreateMetastore request) {
    String path = String.format("/api/2.0/accounts/%s/metastores", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, AccountsMetastoreInfo.class, headers);
  }

  @Override
  public void delete(DeleteAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public AccountsMetastoreInfo get(GetAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, AccountsMetastoreInfo.class, headers);
  }

  @Override
  public ListMetastoresResponse list() {
    String path = String.format("/api/2.0/accounts/%s/metastores", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, ListMetastoresResponse.class, headers);
  }

  @Override
  public AccountsMetastoreInfo update(AccountsUpdateMetastore request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PUT", path, request, AccountsMetastoreInfo.class, headers);
  }
}
