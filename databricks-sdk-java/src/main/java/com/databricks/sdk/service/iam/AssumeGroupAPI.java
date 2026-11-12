// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Manage the workspace's restricted sharing groups. */
@Generated
public class AssumeGroupAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AssumeGroupAPI.class);

  private final AssumeGroupService impl;

  /** Regular-use constructor */
  public AssumeGroupAPI(ApiClient apiClient) {
    impl = new AssumeGroupImpl(apiClient);
  }

  /** Constructor for mocks */
  public AssumeGroupAPI(AssumeGroupService mock) {
    impl = mock;
  }

  /**
   * Adds a group to the workspace's restricted list. The workspace allows at most 100 restricted
   * sharing groups. Requires workspace admin.
   */
  public RestrictedSharingGroup createRestrictedSharingGroup(
      CreateRestrictedSharingGroupRequest request) {
    return impl.createRestrictedSharingGroup(request);
  }

  public void deleteRestrictedSharingGroup(String name) {
    deleteRestrictedSharingGroup(new DeleteRestrictedSharingGroupRequest().setName(name));
  }

  /** Removes a group from the workspace's restricted list. Requires workspace admin. */
  public void deleteRestrictedSharingGroup(DeleteRestrictedSharingGroupRequest request) {
    impl.deleteRestrictedSharingGroup(request);
  }

  public RestrictedSharingGroup getRestrictedSharingGroup(String name) {
    return getRestrictedSharingGroup(new GetRestrictedSharingGroupRequest().setName(name));
  }

  /**
   * Gets a restricted sharing group in the workspace. Use it to check whether a group is on the
   * workspace's restricted list. Requires workspace admin.
   */
  public RestrictedSharingGroup getRestrictedSharingGroup(
      GetRestrictedSharingGroupRequest request) {
    return impl.getRestrictedSharingGroup(request);
  }

  /** Lists the restricted sharing groups in the workspace. Requires workspace admin. */
  public Iterable<RestrictedSharingGroup> listRestrictedSharingGroups(
      ListRestrictedSharingGroupsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listRestrictedSharingGroups,
        ListRestrictedSharingGroupsResponse::getRestrictedSharingGroups,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public AssumeGroupService impl() {
    return impl;
  }
}
