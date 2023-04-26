// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountStorageCredentials */
class AccountStorageCredentialsImpl implements AccountStorageCredentialsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for AccountStorageCredentialsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountStorageCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public StorageCredentialInfo create(CreateStorageCredential request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.POST(path, request, StorageCredentialInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, StorageCredentialInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, Collection.class);
  }
}
