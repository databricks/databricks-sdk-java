// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;

/** Package-local implementation of AccountMetastoreAssignments */
@Generated
class AccountMetastoreAssignmentsImpl implements AccountMetastoreAssignmentsService {
  private final ApiClient apiClient;

  public AccountMetastoreAssignmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Collection<CreateMetastoreAssignmentsResponseItem> create(
      AccountsCreateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    return apiClient.getCollection(path, null, CreateMetastoreAssignmentsResponseItem.class);
  }

  @Override
  public void delete(DeleteAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public AccountsMetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastore",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    return apiClient.GET(path, request, AccountsMetastoreAssignment.class);
  }

  @Override
  public Collection<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/workspaces",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.getCollection(path, null, MetastoreAssignment.class);
  }

  @Override
  public void update(AccountsUpdateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    apiClient.PUT(path, request, Void.class);
  }
}
