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
public class GroupsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GroupsAPI.class);

  private final GroupsService impl;

  /** Regular-use constructor */
  public GroupsAPI(ApiClient apiClient) {
    impl = new GroupsImpl(apiClient);
  }

  /** Constructor for mocks */
  public GroupsAPI(GroupsService mock) {
    impl = mock;
  }

  /**
   * Creates a group in the Databricks workspace with a unique name, using the supplied group
   * details.
   */
  public Group create(Group request) {
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
            })
        .withDedupe(Group::getId);
  }

  /** Partially updates the details of a group. */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  /** Updates the details of a group by replacing the entire group entity. */
  public void update(Group request) {
    impl.update(request);
  }

  public GroupsService impl() {
    return impl;
  }
}
