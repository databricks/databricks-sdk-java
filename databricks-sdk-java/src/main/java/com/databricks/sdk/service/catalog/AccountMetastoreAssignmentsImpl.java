// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountMetastoreAssignments */
@Generated
class AccountMetastoreAssignmentsImpl implements AccountMetastoreAssignmentsService {
  private final ApiClient apiClient;

  public AccountMetastoreAssignmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public MetastoreAssignment create(CreateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    return apiClient.POST(path, request, MetastoreAssignment.class);
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
  public MetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastore",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    return apiClient.GET(path, request, MetastoreAssignment.class);
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
  public MetastoreAssignment update(UpdateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    return apiClient.PUT(path, request, MetastoreAssignment.class);
  }
}
