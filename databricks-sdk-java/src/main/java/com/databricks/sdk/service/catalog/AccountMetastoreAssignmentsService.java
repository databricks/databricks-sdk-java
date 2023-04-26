// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import java.util.Collection;

/**
 * These APIs manage metastore assignments to a workspace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface AccountMetastoreAssignmentsService {
  /**
   * Assigns a workspace to a metastore.
   *
   * <p>Creates an assignment to a metastore for a workspace
   *
   * @param createMetastoreAssignment a {@link com.databricks.sdk.service.catalog.CreateMetastoreAssignment} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  MetastoreAssignment create(CreateMetastoreAssignment createMetastoreAssignment);

  /**
   * Delete a metastore assignment.
   *
   * <p>Deletes a metastore assignment to a workspace, leaving the workspace with no metastore.
   *
   * @param deleteAccountMetastoreAssignmentRequest a {@link com.databricks.sdk.service.catalog.DeleteAccountMetastoreAssignmentRequest} object
   */
  void delete(DeleteAccountMetastoreAssignmentRequest deleteAccountMetastoreAssignmentRequest);

  /**
   * Gets the metastore assignment for a workspace.
   *
   * <p>Gets the metastore assignment, if any, for the workspace specified by ID. If the workspace
   * is assigned a metastore, the mappig will be returned. If no metastore is assigned to the
   * workspace, the assignment will not be found and a 404 returned.
   *
   * @param getAccountMetastoreAssignmentRequest a {@link com.databricks.sdk.service.catalog.GetAccountMetastoreAssignmentRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  MetastoreAssignment get(
      GetAccountMetastoreAssignmentRequest getAccountMetastoreAssignmentRequest);

  /**
   * Get all workspaces assigned to a metastore.
   *
   * <p>Gets a list of all Databricks workspace IDs that have been assigned to given metastore.
   *
   * @param listAccountMetastoreAssignmentsRequest a {@link com.databricks.sdk.service.catalog.ListAccountMetastoreAssignmentsRequest} object
   * @return a {@link java.util.Collection} object
   */
  Collection<MetastoreAssignment> list(
      ListAccountMetastoreAssignmentsRequest listAccountMetastoreAssignmentsRequest);

  /**
   * Updates a metastore assignment to a workspaces.
   *
   * <p>Updates an assignment to a metastore for a workspace. Currently, only the default catalog
   * may be updated
   *
   * @param updateMetastoreAssignment a {@link com.databricks.sdk.service.catalog.UpdateMetastoreAssignment} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  MetastoreAssignment update(UpdateMetastoreAssignment updateMetastoreAssignment);
}
