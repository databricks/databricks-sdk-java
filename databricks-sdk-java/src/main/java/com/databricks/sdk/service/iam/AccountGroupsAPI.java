// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Groups simplify identity management, making it easier to assign access to Databricks account,
 * data, and other securable objects.
 *
 * <p>It is best practice to assign access to workspaces and access-control policies in Unity
 * Catalog to groups, instead of to users individually. All Databricks account identities can be
 * assigned as members of groups, and members inherit permissions that are assigned to their group.
 */
@Generated
public class AccountGroupsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountGroupsAPI.class);

  private final AccountGroupsService impl;

  /** Regular-use constructor */
  public AccountGroupsAPI(ApiClient apiClient) {
    impl = new AccountGroupsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountGroupsAPI(AccountGroupsService mock) {
    impl = mock;
  }

  /**
   * Create a new group.
   *
   * <p>Creates a group in the Databricks account with a unique name, using the supplied group
   * details.
   */
  public Group create(Group request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteAccountGroupRequest().setId(id));
  }

  /**
   * Delete a group.
   *
   * <p>Deletes a group from the Databricks account.
   */
  public void delete(DeleteAccountGroupRequest request) {
    impl.delete(request);
  }

  public Group get(String id) {
    return get(new GetAccountGroupRequest().setId(id));
  }

  /**
   * Get group details.
   *
   * <p>Gets the information for a specific group in the Databricks account.
   */
  public Group get(GetAccountGroupRequest request) {
    return impl.get(request);
  }

  /**
   * List group details.
   *
   * <p>Gets all details of the groups associated with the Databricks account.
   */
  public Iterable<Group> list(ListAccountGroupsRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == 0L) {
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

  public AccountGroupsService impl() {
    return impl;
  }
}
