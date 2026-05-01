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
  /** Create a new failover group. */
  FailoverGroup createFailoverGroup(CreateFailoverGroupRequest createFailoverGroupRequest);

  /** Create a new stable URL. */
  StableUrl createStableUrl(CreateStableUrlRequest createStableUrlRequest);

  /** Delete a failover group. */
  void deleteFailoverGroup(DeleteFailoverGroupRequest deleteFailoverGroupRequest);

  /** Delete a stable URL. */
  void deleteStableUrl(DeleteStableUrlRequest deleteStableUrlRequest);

  /** Initiate a failover to a new primary region. */
  FailoverGroup failoverFailoverGroup(FailoverFailoverGroupRequest failoverFailoverGroupRequest);

  /** Get a failover group. */
  FailoverGroup getFailoverGroup(GetFailoverGroupRequest getFailoverGroupRequest);

  /** Get a stable URL. */
  StableUrl getStableUrl(GetStableUrlRequest getStableUrlRequest);

  /** List failover groups. */
  ListFailoverGroupsResponse listFailoverGroups(
      ListFailoverGroupsRequest listFailoverGroupsRequest);

  /** List stable URLs for an account. */
  ListStableUrlsResponse listStableUrls(ListStableUrlsRequest listStableUrlsRequest);

  /** Update a failover group. */
  FailoverGroup updateFailoverGroup(UpdateFailoverGroupRequest updateFailoverGroupRequest);
}
