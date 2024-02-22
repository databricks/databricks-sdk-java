// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * Groups simplify identity management, making it easier to assign access to Databricks account,
 * data, and other securable objects.
 *
 * <p>It is best practice to assign access to workspaces and access-control policies in Unity
 * Catalog to groups, instead of to users individually. All Databricks account identities can be
 * assigned as members of groups, and members inherit permissions that are assigned to their group.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountGroupsService {
  /**
   * Create a new group.
   *
   * <p>Creates a group in the Databricks account with a unique name, using the supplied group
   * details.
   */
  Group create(Group group);

  /**
   * Delete a group.
   *
   * <p>Deletes a group from the Databricks account.
   */
  DeleteResponse delete(DeleteAccountGroupRequest deleteAccountGroupRequest);

  /**
   * Get group details.
   *
   * <p>Gets the information for a specific group in the Databricks account.
   */
  Group get(GetAccountGroupRequest getAccountGroupRequest);

  /**
   * List group details.
   *
   * <p>Gets all details of the groups associated with the Databricks account.
   */
  ListGroupsResponse list(ListAccountGroupsRequest listAccountGroupsRequest);

  /**
   * Update group details.
   *
   * <p>Partially updates the details of a group.
   */
  PatchResponse patch(PartialUpdate partialUpdate);

  /**
   * Replace a group.
   *
   * <p>Updates the details of a group by replacing the entire group entity.
   */
  UpdateResponse update(Group group);
}
