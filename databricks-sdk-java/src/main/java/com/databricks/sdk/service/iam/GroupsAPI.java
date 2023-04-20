// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Groups simplify identity management, making it easier to assign access to Databricks Workspace,
 * data, and other securable objects.
 *
 * <p>It is best practice to assign access to workspaces and access-control policies in Unity
 * Catalog to groups, instead of to users individually. All Databricks Workspace identities can be
 * assigned as members of groups, and members inherit permissions that are assigned to their group.
 */
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

  public Group create(String id) {
    return create(new Group().setId(id));
  }

  /**
   * Create a new group.
   *
   * <p>Creates a group in the Databricks Workspace with a unique name, using the supplied group
   * details.
   */
  public Group create(Group request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteGroupRequest().setId(id));
  }

  /**
   * Delete a group.
   *
   * <p>Deletes a group from the Databricks Workspace.
   */
  public void delete(DeleteGroupRequest request) {
    impl.delete(request);
  }

  public Group get(String id) {
    return get(new GetGroupRequest().setId(id));
  }

  /**
   * Get group details.
   *
   * <p>Gets the information for a specific group in the Databricks Workspace.
   */
  public Group get(GetGroupRequest request) {
    return impl.get(request);
  }

  /**
   * List group details.
   *
   * <p>Gets all details of the groups associated with the Databricks Workspace.
   */
  public Iterable<Group> list(ListGroupsRequest request) {
    return impl.list(request).getResources();
  }

  public void patch(String id) {
    patch(new PartialUpdate().setId(id));
  }

  /**
   * Update group details.
   *
   * <p>Partially updates the details of a group.
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  public void update(String id) {
    update(new Group().setId(id));
  }

  /**
   * Replace a group.
   *
   * <p>Updates the details of a group by replacing the entire group entity.
   */
  public void update(Group request) {
    impl.update(request);
  }

  public GroupsService impl() {
    return impl;
  }
}
