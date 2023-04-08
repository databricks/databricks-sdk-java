// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
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

  /**
   * Assigns a workspace to a metastore.
   *
   * <p>Creates an assignment to a metastore for a workspace
   */
  public MetastoreAssignment create(CreateMetastoreAssignment request) {
    return impl.create(request);
  }

  /**
   * Delete a metastore assignment.
   *
   * <p>Deletes a metastore assignment to a workspace, leaving the workspace with no metastore.
   */
  public void delete(DeleteAccountMetastoreAssignmentRequest request) {
    impl.delete(request);
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

  /**
   * Get all workspaces assigned to a metastore.
   *
   * <p>Gets a list of all Databricks workspace IDs that have been assigned to given metastore.
   */
  public List<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
    return impl.list(request);
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
