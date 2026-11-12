// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * Manage the workspace's restricted sharing groups.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AssumeGroupService {
  /**
   * Adds a group to the workspace's restricted list. The workspace allows at most 100 restricted
   * sharing groups. Requires workspace admin.
   */
  RestrictedSharingGroup createRestrictedSharingGroup(
      CreateRestrictedSharingGroupRequest createRestrictedSharingGroupRequest);

  /** Removes a group from the workspace's restricted list. Requires workspace admin. */
  void deleteRestrictedSharingGroup(
      DeleteRestrictedSharingGroupRequest deleteRestrictedSharingGroupRequest);

  /**
   * Gets a restricted sharing group in the workspace. Use it to check whether a group is on the
   * workspace's restricted list. Requires workspace admin.
   */
  RestrictedSharingGroup getRestrictedSharingGroup(
      GetRestrictedSharingGroupRequest getRestrictedSharingGroupRequest);

  /** Lists the restricted sharing groups in the workspace. Requires workspace admin. */
  ListRestrictedSharingGroupsResponse listRestrictedSharingGroups(
      ListRestrictedSharingGroupsRequest listRestrictedSharingGroupsRequest);
}
