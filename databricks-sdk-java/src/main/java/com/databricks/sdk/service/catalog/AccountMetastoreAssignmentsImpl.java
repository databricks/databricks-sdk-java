// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void delete(DeleteAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public AccountsMetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastore",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, AccountsMetastoreAssignment.class, headers);
  }

  @Override
  public ListAccountMetastoreAssignmentsResponse list(
      ListAccountMetastoreAssignmentsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/workspaces",
            apiClient.configuredAccountID(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAccountMetastoreAssignmentsResponse.class, headers);
  }

  @Override
  public void update(AccountsUpdateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, Void.class, headers);
  }
}
