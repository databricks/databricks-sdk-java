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
public class UsersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(UsersAPI.class);

  private final UsersService impl;

  /** Regular-use constructor */
  public UsersAPI(ApiClient apiClient) {
    impl = new UsersImpl(apiClient);
  }

  /** Constructor for mocks */
  public UsersAPI(UsersService mock) {
    impl = mock;
  }

  /**
   * Create a new user.
   *
   * <p>Creates a new user in the Databricks workspace. This new user will also be added to the
   * Databricks account.
   */
  public User create(User request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteUserRequest().setId(id));
  }

  /**
   * Delete a user.
   *
   * <p>Deletes a user. Deleting a user from a Databricks workspace also removes objects associated
   * with the user.
   */
  public void delete(DeleteUserRequest request) {
    impl.delete(request);
  }

  public User get(String id) {
    return get(new GetUserRequest().setId(id));
  }

  /**
   * Get user details.
   *
   * <p>Gets information for a specific user in Databricks workspace.
   */
  public User get(GetUserRequest request) {
    return impl.get(request);
  }

  /**
   * Get password permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetPasswordPermissionLevelsResponse getPermissionLevels() {
    return impl.getPermissionLevels();
  }

  /**
   * Get password permissions.
   *
   * <p>Gets the permissions of all passwords. Passwords can inherit permissions from their root
   * object.
   */
  public PasswordPermissions getPermissions() {
    return impl.getPermissions();
  }

  /**
   * List users.
   *
   * <p>Gets details for all the users associated with a Databricks workspace.
   */
  public Iterable<User> list(ListUsersRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == 0) {
      request.setCount(100L);
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
            })
        .withDedupe(User::getId);
  }

  public void patch(String id) {
    patch(new PartialUpdate().setId(id));
  }

  /**
   * Update user details.
   *
   * <p>Partially updates a user resource by applying the supplied operations on specific user
   * attributes.
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  /**
   * Set password permissions.
   *
   * <p>Sets permissions on all passwords. Passwords can inherit permissions from their root object.
   */
  public PasswordPermissions setPermissions(PasswordPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  public void update(String id) {
    update(new User().setId(id));
  }

  /**
   * Replace a user.
   *
   * <p>Replaces a user's information with the data supplied in request.
   */
  public void update(User request) {
    impl.update(request);
  }

  /**
   * Update password permissions.
   *
   * <p>Updates the permissions on all passwords. Passwords can inherit permissions from their root
   * object.
   */
  public PasswordPermissions updatePermissions(PasswordPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public UsersService impl() {
    return impl;
  }
}
