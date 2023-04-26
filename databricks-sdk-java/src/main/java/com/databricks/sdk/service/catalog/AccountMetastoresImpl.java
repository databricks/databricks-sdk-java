// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountMetastores */
class AccountMetastoresImpl implements AccountMetastoresService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for AccountMetastoresImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountMetastoresImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public MetastoreInfo create(CreateMetastore request) {
    String path = String.format("/api/2.0/accounts/%s/metastores", apiClient.configuredAccountID());
    return apiClient.POST(path, request, MetastoreInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public MetastoreInfo get(GetAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, MetastoreInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListMetastoresResponse list() {
    String path = String.format("/api/2.0/accounts/%s/metastores", apiClient.configuredAccountID());
    return apiClient.GET(path, ListMetastoresResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public MetastoreInfo update(UpdateMetastore request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.PUT(path, request, MetastoreInfo.class);
  }
}
