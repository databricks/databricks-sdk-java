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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UsersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(UsersAPI.class);

  private final UsersService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public UsersAPI(ApiClient apiClient) {
    impl = new UsersImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.iam.UsersService} object
   */
  public UsersAPI(UsersService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User create(String id) {
    return create(new User().setId(id));
  }

  /**
   * Create a new user.
   *
   * <p>Creates a new user in the Databricks Workspace. This new user will also be added to the
   * Databricks account.
   *
   * @param request a {@link com.databricks.sdk.service.iam.User} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User create(User request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void delete(String id) {
    delete(new DeleteUserRequest().setId(id));
  }

  /**
   * Delete a user.
   *
   * <p>Deletes a user. Deleting a user from a Databricks Workspace also removes objects associated
   * with the user.
   *
   * @param request a {@link com.databricks.sdk.service.iam.DeleteUserRequest} object
   */
  public void delete(DeleteUserRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User get(String id) {
    return get(new GetUserRequest().setId(id));
  }

  /**
   * Get user details.
   *
   * <p>Gets information for a specific user in Databricks Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.GetUserRequest} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User get(GetUserRequest request) {
    return impl.get(request);
  }

  /**
   * List users.
   *
   * <p>Gets details for all the users associated with a Databricks Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.ListUsersRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<User> list(ListUsersRequest request) {
    return impl.list(request).getResources();
  }

  /**
   * <p>patch.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void patch(String id) {
    patch(new PartialUpdate().setId(id));
  }

  /**
   * Update user details.
   *
   * <p>Partially updates a user resource by applying the supplied operations on specific user
   * attributes.
   *
   * @param request a {@link com.databricks.sdk.service.iam.PartialUpdate} object
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  /**
   * <p>update.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void update(String id) {
    update(new User().setId(id));
  }

  /**
   * Replace a user.
   *
   * <p>Replaces a user's information with the data supplied in request.
   *
   * @param request a {@link com.databricks.sdk.service.iam.User} object
   */
  public void update(User request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.UsersService} object
   */
  public UsersService impl() {
    return impl;
  }
}
