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
   * Create a new group.
   *
   * <p>Creates a group in the Databricks workspace with a unique name, using the supplied group
   * details.
   */
  public Group create(Group request) {
    return impl.create(request);
  }

  public DeleteResponse delete(String id) {
    return delete(new DeleteGroupRequest().setId(id));
  }

  /**
   * Delete a group.
   *
   * <p>Deletes a group from the Databricks workspace.
   */
  public DeleteResponse delete(DeleteGroupRequest request) {
    return impl.delete(request);
  }

  public Group get(String id) {
    return get(new GetGroupRequest().setId(id));
  }

  /**
   * Get group details.
   *
   * <p>Gets the information for a specific group in the Databricks workspace.
   */
  public Group get(GetGroupRequest request) {
    return impl.get(request);
  }

  /**
   * List group details.
   *
   * <p>Gets all details of the groups associated with the Databricks workspace.
   */
  public Iterable<Group> list(ListGroupsRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == null) {
      request.setCount(100L);
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

  public PatchResponse patch(String id) {
    return patch(new PartialUpdate().setId(id));
  }

  /**
   * Update group details.
   *
   * <p>Partially updates the details of a group.
   */
  public PatchResponse patch(PartialUpdate request) {
    return impl.patch(request);
  }

  public UpdateResponse update(String id) {
    return update(new Group().setId(id));
  }

  /**
   * Replace a group.
   *
   * <p>Updates the details of a group by replacing the entire group entity.
   */
  public UpdateResponse update(Group request) {
    return impl.update(request);
  }

  public GroupsService impl() {
    return impl;
  }
}
