// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage metastore assignments to a workspace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountMetastoreAssignmentsService {
  /** Creates an assignment to a metastore for a workspace */
  void create(AccountsCreateMetastoreAssignment accountsCreateMetastoreAssignment);

  /** Deletes a metastore assignment to a workspace, leaving the workspace with no metastore. */
  void delete(DeleteAccountMetastoreAssignmentRequest deleteAccountMetastoreAssignmentRequest);

  /**
   * Gets the metastore assignment, if any, for the workspace specified by ID. If the workspace is
   * assigned a metastore, the mappig will be returned. If no metastore is assigned to the
   * workspace, the assignment will not be found and a 404 returned.
   */
  AccountsMetastoreAssignment get(
      GetAccountMetastoreAssignmentRequest getAccountMetastoreAssignmentRequest);

  /** Gets a list of all Databricks workspace IDs that have been assigned to given metastore. */
  ListAccountMetastoreAssignmentsResponse list(
      ListAccountMetastoreAssignmentsRequest listAccountMetastoreAssignmentsRequest);

  /**
   * Updates an assignment to a metastore for a workspace. Currently, only the default catalog may
   * be updated.
   */
  void update(AccountsUpdateMetastoreAssignment accountsUpdateMetastoreAssignment);
}
