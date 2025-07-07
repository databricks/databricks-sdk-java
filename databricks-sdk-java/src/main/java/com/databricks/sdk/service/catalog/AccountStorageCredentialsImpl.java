// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountsStorageCredentialInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/%s",
            apiClient.configuredAccountID(),
            request.getMetastoreId(),
            request.getStorageCredentialName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountsStorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/%s",
            apiClient.configuredAccountID(),
            request.getMetastoreId(),
            request.getStorageCredentialName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountsStorageCredentialInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAccountStorageCredentialsResponse list(ListAccountStorageCredentialsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials",
            apiClient.configuredAccountID(), request.getMetastoreId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAccountStorageCredentialsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountsStorageCredentialInfo update(AccountsUpdateStorageCredential request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/storage-credentials/%s",
            apiClient.configuredAccountID(),
            request.getMetastoreId(),
            request.getStorageCredentialName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountsStorageCredentialInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
