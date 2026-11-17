// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;

/**
 * Manage disaster recovery configurations and execute failover operations.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DisasterRecoveryService {
  /**
   * Create a failover group. The group starts in the CREATING state and moves to
   * INITIAL_REPLICATION while the first replication cycle copies all in-scope data to the secondary
   * region; failover becomes available once the group is ACTIVE. Set validate_only to check the
   * request without creating anything.
   */
  FailoverGroup createFailoverGroup(CreateFailoverGroupRequest createFailoverGroupRequest);

  /** Create a new stable URL. */
  StableUrl createStableUrl(CreateStableUrlRequest createStableUrlRequest);

  /**
   * Delete a failover group. Deleting stops replication for the group; stable URLs linked to it are
   * detached but not deleted.
   */
  void deleteFailoverGroup(DeleteFailoverGroupRequest deleteFailoverGroupRequest);

  /** Delete a stable URL. */
  void deleteStableUrl(DeleteStableUrlRequest deleteStableUrlRequest);

  /**
   * Initiate a failover that makes target_primary_region the primary region. Stable URLs linked to
   * the group are pointed at the new primary workspace, replication is reversed so that the former
   * primary becomes the secondary, and the group moves through FAILING_OVER to INITIAL_REPLICATION
   * until it has a replication point in the new direction. The group must be ACTIVE; repeating the
   * request while it is FAILING_OVER is accepted. To fail back, repeat the request with the former
   * primary region as the target once the group is ACTIVE again. In an unplanned failover, data
   * written after the replication point can be lost.
   */
  FailoverGroup failoverFailoverGroup(FailoverFailoverGroupRequest failoverFailoverGroupRequest);

  /** Get a failover group, including its current state and replication point. */
  FailoverGroup getFailoverGroup(GetFailoverGroupRequest getFailoverGroupRequest);

  /** Get a stable URL. */
  StableUrl getStableUrl(GetStableUrlRequest getStableUrlRequest);

  /**
   * List the failover groups in an account.
   *
   * <p>List entries are abbreviated: `state`, `replication_point` and
   * `unity_catalog_assets.location_mappings` are not populated. Call GetFailoverGroup to retrieve
   * the full resource.
   */
  ListFailoverGroupsResponse listFailoverGroups(
      ListFailoverGroupsRequest listFailoverGroupsRequest);

  /** List stable URLs for an account. */
  ListStableUrlsResponse listStableUrls(ListStableUrlsRequest listStableUrlsRequest);

  /**
   * Update a failover group. Only the fields named in update_mask change. You can turn workspace
   * asset replication on or off, attach or detach a stable URL, and change the Unity Catalog
   * catalogs and location mappings; the regions, the workspace set name and the workspace IDs
   * cannot be changed. Updates are rejected while a create, failover or delete is in progress, and
   * after a create or delete has failed.
   */
  FailoverGroup updateFailoverGroup(UpdateFailoverGroupRequest updateFailoverGroupRequest);
}
