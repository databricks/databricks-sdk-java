// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, AccountsMetastoreInfo.class);
  }

  @Override
  public void delete(DeleteAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public AccountsMetastoreInfo get(GetAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, AccountsMetastoreInfo.class, "application/json");
  }

  @Override
  public ListMetastoresResponse list() {
    String path = String.format("/api/2.0/accounts/%s/metastores", apiClient.configuredAccountID());
    return apiClient.GET(path, ListMetastoresResponse.class, "application/json");
  }

  @Override
  public AccountsMetastoreInfo update(AccountsUpdateMetastore request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.PUT(path, request, AccountsMetastoreInfo.class);
  }
}
