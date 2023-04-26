// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface AccountUsersService {
  /**
   * Create a new user.
   *
   * <p>Creates a new user in the Databricks Account. This new user will also be added to the
   * Databricks account.
   *
   * @param user a {@link com.databricks.sdk.service.iam.User} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  User create(User user);

  /**
   * Delete a user.
   *
   * <p>Deletes a user. Deleting a user from a Databricks Account also removes objects associated
   * with the user.
   *
   * @param deleteAccountUserRequest a {@link com.databricks.sdk.service.iam.DeleteAccountUserRequest} object
   */
  void delete(DeleteAccountUserRequest deleteAccountUserRequest);

  /**
   * Get user details.
   *
   * <p>Gets information for a specific user in Databricks Account.
   *
   * @param getAccountUserRequest a {@link com.databricks.sdk.service.iam.GetAccountUserRequest} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  User get(GetAccountUserRequest getAccountUserRequest);

  /**
   * List users.
   *
   * <p>Gets details for all the users associated with a Databricks Account.
   *
   * @param listAccountUsersRequest a {@link com.databricks.sdk.service.iam.ListAccountUsersRequest} object
   * @return a {@link com.databricks.sdk.service.iam.ListUsersResponse} object
   */
  ListUsersResponse list(ListAccountUsersRequest listAccountUsersRequest);

  /**
   * Update user details.
   *
   * <p>Partially updates a user resource by applying the supplied operations on specific user
   * attributes.
   *
   * @param partialUpdate a {@link com.databricks.sdk.service.iam.PartialUpdate} object
   */
  void patch(PartialUpdate partialUpdate);

  /**
   * Replace a user.
   *
   * <p>Replaces a user's information with the data supplied in request.
   *
   * @param user a {@link com.databricks.sdk.service.iam.User} object
   */
  void update(User user);
}
