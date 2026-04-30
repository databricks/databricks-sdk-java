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

  /** Create a new failover group. */
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

  /** Delete a failover group. */
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

  /** Initiate a failover to a new primary region. */
  public FailoverGroup failoverFailoverGroup(FailoverFailoverGroupRequest request) {
    return impl.failoverFailoverGroup(request);
  }

  public FailoverGroup getFailoverGroup(String name) {
    return getFailoverGroup(new GetFailoverGroupRequest().setName(name));
  }

  /** Get a failover group. */
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

  /** List failover groups. */
  public Iterable<FailoverGroup> listFailoverGroups(ListFailoverGroupsRequest request) {
    return new Paginator<>(
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
    return new Paginator<>(
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

  /** Update a failover group. */
  public FailoverGroup updateFailoverGroup(UpdateFailoverGroupRequest request) {
    return impl.updateFailoverGroup(request);
  }

  public DisasterRecoveryService impl() {
    return impl;
  }
}
