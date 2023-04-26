// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountMetastoreAssignments */
class AccountMetastoreAssignmentsImpl implements AccountMetastoreAssignmentsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for AccountMetastoreAssignmentsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountMetastoreAssignmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public MetastoreAssignment create(CreateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    return apiClient.POST(path, request, MetastoreAssignment.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public MetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastore",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    return apiClient.GET(path, request, MetastoreAssignment.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/metastores/%s/workspaces",
            apiClient.configuredAccountID(), request.getMetastoreId());
    return apiClient.GET(path, request, Collection.class);
  }

  /** {@inheritDoc} */
  @Override
  public MetastoreAssignment update(UpdateMetastoreAssignment request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/metastores/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getMetastoreId());
    return apiClient.PUT(path, request, MetastoreAssignment.class);
  }
}
