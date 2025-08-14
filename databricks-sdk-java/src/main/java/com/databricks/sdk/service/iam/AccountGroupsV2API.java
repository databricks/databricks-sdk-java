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
public class AccountGroupsV2API {
  private static final Logger LOG = LoggerFactory.getLogger(AccountGroupsV2API.class);

  private final AccountGroupsV2Service impl;

  /** Regular-use constructor */
  public AccountGroupsV2API(ApiClient apiClient) {
    impl = new AccountGroupsV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public AccountGroupsV2API(AccountGroupsV2Service mock) {
    impl = mock;
  }

  /**
   * Creates a group in the Databricks account with a unique name, using the supplied group details.
   */
  public AccountGroup create(CreateAccountGroupRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteAccountGroupRequest().setId(id));
  }

  /** Deletes a group from the Databricks account. */
  public void delete(DeleteAccountGroupRequest request) {
    impl.delete(request);
  }

  public AccountGroup get(String id) {
    return get(new GetAccountGroupRequest().setId(id));
  }

  /** Gets the information for a specific group in the Databricks account. */
  public AccountGroup get(GetAccountGroupRequest request) {
    return impl.get(request);
  }

  /** Gets all details of the groups associated with the Databricks account. */
  public Iterable<AccountGroup> list(ListAccountGroupsRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == null) {
      request.setCount(10000L);
    }
    return new Paginator<>(
        request,
        impl::list,
        ListAccountGroupsResponse::getResources,
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
  public void patch(PatchAccountGroupRequest request) {
    impl.patch(request);
  }

  /** Updates the details of a group by replacing the entire group entity. */
  public void update(UpdateAccountGroupRequest request) {
    impl.update(request);
  }

  public AccountGroupsV2Service impl() {
    return impl;
  }
}
