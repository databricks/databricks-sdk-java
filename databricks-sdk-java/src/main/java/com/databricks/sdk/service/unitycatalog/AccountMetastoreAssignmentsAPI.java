// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** These APIs manage metastore assignments to a workspace. */
public class AccountMetastoreAssignmentsAPI {
  private final AccountMetastoreAssignmentsService impl;

  /** Regular-use constructor */
  public AccountMetastoreAssignmentsAPI(ApiClient apiClient) {
    impl = new AccountMetastoreAssignmentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountMetastoreAssignmentsAPI(AccountMetastoreAssignmentsService mock) {
    impl = mock;
  }

  public MetastoreAssignment create(
      String metastoreId, String defaultCatalogName, long workspaceId) {
    return create(
        new CreateMetastoreAssignment()
            .setMetastoreId(metastoreId)
            .setDefaultCatalogName(defaultCatalogName)
            .setWorkspaceId(workspaceId));
  }

  /**
   * Assigns a workspace to a metastore.
   *
   * <p>Creates an assignment to a metastore for a workspace
   */
  public MetastoreAssignment create(CreateMetastoreAssignment request) {
    return impl.create(request);
  }

  public void delete(long workspaceId, String metastoreId) {
    delete(
        new DeleteAccountMetastoreAssignmentRequest()
            .setWorkspaceId(workspaceId)
            .setMetastoreId(metastoreId));
  }

  /**
   * Delete a metastore assignment.
   *
   * <p>Deletes a metastore assignment to a workspace, leaving the workspace with no metastore.
   */
  public void delete(DeleteAccountMetastoreAssignmentRequest request) {
    impl.delete(request);
  }

  public MetastoreAssignment get(long workspaceId) {
    return get(new GetAccountMetastoreAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Gets the metastore assignment for a workspace.
   *
   * <p>Gets the metastore assignment, if any, for the workspace specified by ID. If the workspace
   * is assigned a metastore, the mappig will be returned. If no metastore is assigned to the
   * workspace, the assignment will not be found and a 404 returned.
   */
  public MetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
    return impl.get(request);
  }

  public Collection<MetastoreAssignment> list(String metastoreId) {
    return list(new ListAccountMetastoreAssignmentsRequest().setMetastoreId(metastoreId));
  }

  /**
   * Get all workspaces assigned to a metastore.
   *
   * <p>Gets a list of all Databricks workspace IDs that have been assigned to given metastore.
   */
  public Collection<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
    return impl.list(request);
  }

  public MetastoreAssignment update(long workspaceId, String metastoreId) {
    return update(
        new UpdateMetastoreAssignment().setWorkspaceId(workspaceId).setMetastoreId(metastoreId));
  }

  /**
   * Updates a metastore assignment to a workspaces.
   *
   * <p>Updates an assignment to a metastore for a workspace. Currently, only the default catalog
   * may be updated
   */
  public MetastoreAssignment update(UpdateMetastoreAssignment request) {
    return impl.update(request);
  }

  public AccountMetastoreAssignmentsService impl() {
    return impl;
  }
}
