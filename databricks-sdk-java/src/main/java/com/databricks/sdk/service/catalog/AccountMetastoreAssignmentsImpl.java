// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountMetastoreAssignments */
@Generated
class AccountMetastoreAssignmentsImpl implements AccountMetastoreAssignmentsService {
  private final ApiClient apiClient;

  public AccountMetastoreAssignmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void create(AccountsCreateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
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
  public AccountsMetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastore",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountsMetastoreAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAccountMetastoreAssignmentsResponse list(
      ListAccountMetastoreAssignmentsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/workspaces",
            apiClient.configuredAccountID(), request.getMetastoreId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAccountMetastoreAssignmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(AccountsUpdateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
