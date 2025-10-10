// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountMetastores */
@Generated
class AccountMetastoresImpl implements AccountMetastoresService {
  private final ApiClient apiClient;

  public AccountMetastoresImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AccountsCreateMetastoreResponse create(AccountsCreateMetastore request) {
    String path = String.format("/api/2.0/accounts/%s/metastores", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountsCreateMetastoreResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountsDeleteMetastoreResponse delete(DeleteAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountsDeleteMetastoreResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountsGetMetastoreResponse get(GetAccountMetastoreRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountsGetMetastoreResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountsListMetastoresResponse list() {
    String path = String.format("/api/2.0/accounts/%s/metastores", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountsListMetastoresResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountsUpdateMetastoreResponse update(AccountsUpdateMetastore request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getMetastoreId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountsUpdateMetastoreResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
