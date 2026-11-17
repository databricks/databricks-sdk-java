// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Manage disaster recovery configurations and execute failover operations. */
@Generated
public class DisasterRecoveryAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DisasterRecoveryAPI.class);

  private final DisasterRecoveryService impl;

  /** Regular-use constructor */
  public DisasterRecoveryAPI(ApiClient apiClient) {
    impl = new DisasterRecoveryImpl(apiClient);
  }

  /** Constructor for mocks */
  public DisasterRecoveryAPI(DisasterRecoveryService mock) {
    impl = mock;
  }

  /**
   * Create a failover group. The group starts in the CREATING state and moves to
   * INITIAL_REPLICATION while the first replication cycle copies all in-scope data to the secondary
   * region; failover becomes available once the group is ACTIVE. Set validate_only to check the
   * request without creating anything.
   */
  public FailoverGroup createFailoverGroup(CreateFailoverGroupRequest request) {
    return impl.createFailoverGroup(request);
  }

  /** Create a new stable URL. */
  public StableUrl createStableUrl(CreateStableUrlRequest request) {
    return impl.createStableUrl(request);
  }

  public void deleteFailoverGroup(String name) {
    deleteFailoverGroup(new DeleteFailoverGroupRequest().setName(name));
  }

  /**
   * Delete a failover group. Deleting stops replication for the group; stable URLs linked to it are
   * detached but not deleted.
   */
  public void deleteFailoverGroup(DeleteFailoverGroupRequest request) {
    impl.deleteFailoverGroup(request);
  }

  public void deleteStableUrl(String name) {
    deleteStableUrl(new DeleteStableUrlRequest().setName(name));
  }

  /** Delete a stable URL. */
  public void deleteStableUrl(DeleteStableUrlRequest request) {
    impl.deleteStableUrl(request);
  }

  /**
   * Initiate a failover that makes target_primary_region the primary region. Stable URLs linked to
   * the group are pointed at the new primary workspace, replication is reversed so that the former
   * primary becomes the secondary, and the group moves through FAILING_OVER to INITIAL_REPLICATION
   * until it has a replication point in the new direction. The group must be ACTIVE; repeating the
   * request while it is FAILING_OVER is accepted. To fail back, repeat the request with the former
   * primary region as the target once the group is ACTIVE again. In an unplanned failover, data
   * written after the replication point can be lost.
   */
  public FailoverGroup failoverFailoverGroup(FailoverFailoverGroupRequest request) {
    return impl.failoverFailoverGroup(request);
  }

  public FailoverGroup getFailoverGroup(String name) {
    return getFailoverGroup(new GetFailoverGroupRequest().setName(name));
  }

  /** Get a failover group, including its current state and replication point. */
  public FailoverGroup getFailoverGroup(GetFailoverGroupRequest request) {
    return impl.getFailoverGroup(request);
  }

  public StableUrl getStableUrl(String name) {
    return getStableUrl(new GetStableUrlRequest().setName(name));
  }

  /** Get a stable URL. */
  public StableUrl getStableUrl(GetStableUrlRequest request) {
    return impl.getStableUrl(request);
  }

  public Iterable<FailoverGroup> listFailoverGroups(String parent) {
    return listFailoverGroups(new ListFailoverGroupsRequest().setParent(parent));
  }

  /**
   * List the failover groups in an account.
   *
   * <p>List entries are abbreviated: `state`, `replication_point` and
   * `unity_catalog_assets.location_mappings` are not populated. Call GetFailoverGroup to retrieve
   * the full resource.
   */
  public Iterable<FailoverGroup> listFailoverGroups(ListFailoverGroupsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listFailoverGroups,
        ListFailoverGroupsResponse::getFailoverGroups,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<StableUrl> listStableUrls(String parent) {
    return listStableUrls(new ListStableUrlsRequest().setParent(parent));
  }

  /** List stable URLs for an account. */
  public Iterable<StableUrl> listStableUrls(ListStableUrlsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listStableUrls,
        ListStableUrlsResponse::getStableUrls,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Update a failover group. Only the fields named in update_mask change. You can turn workspace
   * asset replication on or off, attach or detach a stable URL, and change the Unity Catalog
   * catalogs and location mappings; the regions, the workspace set name and the workspace IDs
   * cannot be changed. Updates are rejected while a create, failover or delete is in progress, and
   * after a create or delete has failed.
   */
  public FailoverGroup updateFailoverGroup(UpdateFailoverGroupRequest request) {
    return impl.updateFailoverGroup(request);
  }

  public DisasterRecoveryService impl() {
    return impl;
  }
}
