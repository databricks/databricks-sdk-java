// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User identities recognized by Databricks and represented by email addresses.
 *
 * <p>Databricks recommends using SCIM provisioning to sync users and groups automatically from your
 * identity provider to your Databricks workspace. SCIM streamlines onboarding a new employee or
 * team by using your identity provider to create users and groups in Databricks workspace and give
 * them the proper level of access. When a user leaves your organization or no longer needs access
 * to Databricks workspace, admins can terminate the user in your identity provider and that user’s
 * account will also be removed from Databricks workspace. This ensures a consistent offboarding
 * process and prevents unauthorized users from accessing sensitive data.
 */
@Generated
public class UsersV2API {
  private static final Logger LOG = LoggerFactory.getLogger(UsersV2API.class);

  private final UsersV2Service impl;

  /** Regular-use constructor */
  public UsersV2API(ApiClient apiClient) {
    impl = new UsersV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public UsersV2API(UsersV2Service mock) {
    impl = mock;
  }

  /**
   * Creates a new user in the Databricks workspace. This new user will also be added to the
   * Databricks account.
   */
  public User create(CreateUserRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteUserRequest().setId(id));
  }

  /**
   * Deletes a user. Deleting a user from a Databricks workspace also removes objects associated
   * with the user.
   */
  public void delete(DeleteUserRequest request) {
    impl.delete(request);
  }

  public User get(String id) {
    return get(new GetUserRequest().setId(id));
  }

  /** Gets information for a specific user in Databricks workspace. */
  public User get(GetUserRequest request) {
    return impl.get(request);
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetPasswordPermissionLevelsResponse getPermissionLevels(
      GetPasswordPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  /**
   * Gets the permissions of all passwords. Passwords can inherit permissions from their root
   * object.
   */
  public PasswordPermissions getPermissions(GetPasswordPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /** Gets details for all the users associated with a Databricks workspace. */
  public Iterable<User> list(ListUsersRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == null) {
      request.setCount(10000L);
    }
    return new Paginator<>(
        request,
        impl::list,
        ListUsersResponse::getResources,
        response -> {
          Long offset = request.getStartIndex();
          if (offset == null) {
            offset = 0L;
          }
          offset += response.getResources().size();
          return request.setStartIndex(offset);
        });
  }

  /**
   * Partially updates a user resource by applying the supplied operations on specific user
   * attributes.
   */
  public void patch(PatchUserRequest request) {
    impl.patch(request);
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public PasswordPermissions setPermissions(PasswordPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /** Replaces a user's information with the data supplied in request. */
  public void update(UpdateUserRequest request) {
    impl.update(request);
  }

  /**
   * Updates the permissions on all passwords. Passwords can inherit permissions from their root
   * object.
   */
  public PasswordPermissions updatePermissions(PasswordPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public UsersV2Service impl() {
    return impl;
  }
}
