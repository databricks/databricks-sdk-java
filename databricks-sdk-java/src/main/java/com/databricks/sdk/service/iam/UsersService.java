// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

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
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface UsersService {
  /**
   * Creates a new user in the Databricks workspace. This new user will also be added to the
   * Databricks account.
   */
  User create(User user);

  /**
   * Deletes a user. Deleting a user from a Databricks workspace also removes objects associated
   * with the user.
   */
  void delete(DeleteUserRequest deleteUserRequest);

  /** Gets information for a specific user in Databricks workspace. */
  User get(GetUserRequest getUserRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetPasswordPermissionLevelsResponse getPermissionLevels();

  /**
   * Gets the permissions of all passwords. Passwords can inherit permissions from their root
   * object.
   */
  PasswordPermissions getPermissions();

  /** Gets details for all the users associated with a Databricks workspace. */
  ListUsersResponse list(ListUsersRequest listUsersRequest);

  /**
   * Partially updates a user resource by applying the supplied operations on specific user
   * attributes.
   */
  void patch(PartialUpdate partialUpdate);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  PasswordPermissions setPermissions(PasswordPermissionsRequest passwordPermissionsRequest);

  /** Replaces a user's information with the data supplied in request. */
  void update(User user);

  /**
   * Updates the permissions on all passwords. Passwords can inherit permissions from their root
   * object.
   */
  PasswordPermissions updatePermissions(PasswordPermissionsRequest passwordPermissionsRequest);
}
