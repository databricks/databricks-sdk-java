// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User identities recognized by Databricks and represented by email addresses.
 *
 * <p>Databricks recommends using SCIM provisioning to sync users and groups automatically from your
 * identity provider to your Databricks Workspace. SCIM streamlines onboarding a new employee or
 * team by using your identity provider to create users and groups in Databricks Workspace and give
 * them the proper level of access. When a user leaves your organization or no longer needs access
 * to Databricks Workspace, admins can terminate the user in your identity provider and that user’s
 * account will also be removed from Databricks Workspace. This ensures a consistent offboarding
 * process and prevents unauthorized users from accessing sensitive data.
 */
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

  public User create(String id) {
    return create(new User().setId(id));
  }

  /**
   * Create a new user.
   *
   * <p>Creates a new user in the Databricks Workspace. This new user will also be added to the
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
   * <p>Deletes a user. Deleting a user from a Databricks Workspace also removes objects associated
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
   * <p>Gets information for a specific user in Databricks Workspace.
   */
  public User get(GetUserRequest request) {
    return impl.get(request);
  }

  /**
   * List users.
   *
   * <p>Gets details for all the users associated with a Databricks Workspace.
   */
  public Iterable<User> list(ListUsersRequest request) {
    return impl.list(request).getResources();
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

  public UsersService impl() {
    return impl;
  }
}
