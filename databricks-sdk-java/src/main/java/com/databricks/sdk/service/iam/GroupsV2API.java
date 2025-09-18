// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Groups simplify identity management, making it easier to assign access to Databricks workspace,
 * data, and other securable objects.
 *
 * <p>It is best practice to assign access to workspaces and access-control policies in Unity
 * Catalog to groups, instead of to users individually. All Databricks workspace identities can be
 * assigned as members of groups, and members inherit permissions that are assigned to their group.
 */
@Generated
public class GroupsV2API {
  private static final Logger LOG = LoggerFactory.getLogger(GroupsV2API.class);

  private final GroupsV2Service impl;

  /** Regular-use constructor */
  public GroupsV2API(ApiClient apiClient) {
    impl = new GroupsV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public GroupsV2API(GroupsV2Service mock) {
    impl = mock;
  }

  /**
   * Creates a group in the Databricks workspace with a unique name, using the supplied group
   * details.
   */
  public Group create(CreateGroupRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteGroupRequest().setId(id));
  }

  /** Deletes a group from the Databricks workspace. */
  public void delete(DeleteGroupRequest request) {
    impl.delete(request);
  }

  public Group get(String id) {
    return get(new GetGroupRequest().setId(id));
  }

  /** Gets the information for a specific group in the Databricks workspace. */
  public Group get(GetGroupRequest request) {
    return impl.get(request);
  }

  /** Gets all details of the groups associated with the Databricks workspace. */
  public Iterable<Group> list(ListGroupsRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == null) {
      request.setCount(10000L);
    }
    return new Paginator<>(
        request,
        impl::list,
        ListGroupsResponse::getResources,
        response -> {
          Long offset = request.getStartIndex();
          if (offset == null) {
            offset = 0L;
          }
          offset += response.getResources().size();
          return request.setStartIndex(offset);
        });
  }

  /** Partially updates the details of a group. */
  public void patch(PatchGroupRequest request) {
    impl.patch(request);
  }

  /** Updates the details of a group by replacing the entire group entity. */
  public void update(UpdateGroupRequest request) {
    impl.update(request);
  }

  public GroupsV2Service impl() {
    return impl;
  }
}
