// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.util.Collection;

/**
 * These APIs manage metastore assignments to a workspace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface AccountMetastoreAssignmentsService {
  /**
   * Assigns a workspace to a metastore.
   *
   * <p>Creates an assignment to a metastore for a workspace
   */
  MetastoreAssignment create(CreateMetastoreAssignment createMetastoreAssignment);

  /**
   * Delete a metastore assignment.
   *
   * <p>Deletes a metastore assignment to a workspace, leaving the workspace with no metastore.
   */
  void delete(DeleteAccountMetastoreAssignmentRequest deleteAccountMetastoreAssignmentRequest);

  /**
   * Gets the metastore assignment for a workspace.
   *
   * <p>Gets the metastore assignment, if any, for the workspace specified by ID. If the workspace
   * is assigned a metastore, the mappig will be returned. If no metastore is assigned to the
   * workspace, the assignment will not be found and a 404 returned.
   */
  MetastoreAssignment get(
      GetAccountMetastoreAssignmentRequest getAccountMetastoreAssignmentRequest);

  /**
   * Get all workspaces assigned to a metastore.
   *
   * <p>Gets a list of all Databricks workspace IDs that have been assigned to given metastore.
   */
  Collection<MetastoreAssignment> list(
      ListAccountMetastoreAssignmentsRequest listAccountMetastoreAssignmentsRequest);

  /**
   * Updates a metastore assignment to a workspaces.
   *
   * <p>Updates an assignment to a metastore for a workspace. Currently, only the default catalog
   * may be updated
   */
  MetastoreAssignment update(UpdateMetastoreAssignment updateMetastoreAssignment);
}
