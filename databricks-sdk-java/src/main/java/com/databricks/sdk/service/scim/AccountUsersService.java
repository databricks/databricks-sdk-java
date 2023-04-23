// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

/**
 * User identities recognized by Databricks and represented by email addresses.
 *
 * <p>Databricks recommends using SCIM provisioning to sync users and groups automatically from your
 * identity provider to your Databricks Account. SCIM streamlines onboarding a new employee or team
 * by using your identity provider to create users and groups in Databricks Account and give them
 * the proper level of access. When a user leaves your organization or no longer needs access to
 * Databricks Account, admins can terminate the user in your identity provider and that user’s
 * account will also be removed from Databricks Account. This ensures a consistent offboarding
 * process and prevents unauthorized users from accessing sensitive data.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface AccountUsersService {
  /**
   * Create a new user.
   *
   * <p>Creates a new user in the Databricks Account. This new user will also be added to the
   * Databricks account.
   */
  User create(User user);

  /**
   * Delete a user.
   *
   * <p>Deletes a user. Deleting a user from a Databricks Account also removes objects associated
   * with the user.
   */
  void delete(DeleteUserRequest deleteUserRequest);

  /**
   * Get user details.
   *
   * <p>Gets information for a specific user in Databricks Account.
   */
  User get(GetUserRequest getUserRequest);

  /**
   * List users.
   *
   * <p>Gets details for all the users associated with a Databricks Account.
   */
  ListUsersResponse list(ListUsersRequest listUsersRequest);

  /**
   * Update user details.
   *
   * <p>Partially updates a user resource by applying the supplied operations on specific user
   * attributes.
   */
  void patch(PartialUpdate partialUpdate);

  /**
   * Replace a user.
   *
   * <p>Replaces a user's information with the data supplied in request.
   */
  void update(User user);
}
