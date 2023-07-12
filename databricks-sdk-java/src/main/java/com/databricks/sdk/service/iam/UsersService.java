// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * User identities recognized by Databricks and represented by email addresses.
 * 
 * Databricks recommends using SCIM provisioning to sync users and groups
 * automatically from your identity provider to your Databricks workspace. SCIM
 * streamlines onboarding a new employee or team by using your identity provider
 * to create users and groups in Databricks workspace and give them the proper
 * level of access. When a user leaves your organization or no longer needs
 * access to Databricks workspace, admins can terminate the user in your
 * identity provider and that user’s account will also be removed from
 * Databricks workspace. This ensures a consistent offboarding process and
 * prevents unauthorized users from accessing sensitive data.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface UsersService {
	/**
   * Create a new user.
   * 
   * Creates a new user in the Databricks workspace. This new user will also be
   * added to the Databricks account.
   */
  User create(User user);
  
	/**
   * Delete a user.
   * 
   * Deletes a user. Deleting a user from a Databricks workspace also removes
   * objects associated with the user.
   */
  void delete(DeleteUserRequest deleteUserRequest);
  
	/**
   * Get user details.
   * 
   * Gets information for a specific user in Databricks workspace.
   */
  User get(GetUserRequest getUserRequest);
  
	/**
   * List users.
   * 
   * Gets details for all the users associated with a Databricks workspace.
   */
  ListUsersResponse list(ListUsersRequest listUsersRequest);
  
	/**
   * Update user details.
   * 
   * Partially updates a user resource by applying the supplied operations on
   * specific user attributes.
   */
  void patch(PartialUpdate partialUpdate);
  
	/**
   * Replace a user.
   * 
   * Replaces a user's information with the data supplied in request.
   */
  void update(User user);
  
}