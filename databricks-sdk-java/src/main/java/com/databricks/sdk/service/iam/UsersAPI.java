// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;



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
   * Creates a new user in the Databricks workspace. This new user will also be
   * added to the Databricks account.
   */
  public User create(User request) {
    return impl.create(request);
  }
  
	
  public void delete(String id) {
    delete(new DeleteUserRequest()
      .setId(id));
  }
  

	/**
   * Delete a user.
   * 
   * Deletes a user. Deleting a user from a Databricks workspace also removes
   * objects associated with the user.
   */
  public void delete(DeleteUserRequest request) {
    impl.delete(request);
  }
  
	
  public User get(String id) {
    return get(new GetUserRequest()
      .setId(id));
  }
  

	/**
   * Get user details.
   * 
   * Gets information for a specific user in Databricks workspace.
   */
  public User get(GetUserRequest request) {
    return impl.get(request);
  }
  
	

	/**
   * List users.
   * 
   * Gets details for all the users associated with a Databricks workspace.
   */
  public Iterable<User> list(ListUsersRequest request) {
    return impl.list(request).getResources();
  }
  
	
  public void patch(String id) {
    patch(new PartialUpdate()
      .setId(id));
  }
  

	/**
   * Update user details.
   * 
   * Partially updates a user resource by applying the supplied operations on
   * specific user attributes.
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }
  
	
  public void update(String id) {
    update(new User()
      .setId(id));
  }
  

	/**
   * Replace a user.
   * 
   * Replaces a user's information with the data supplied in request.
   */
  public void update(User request) {
    impl.update(request);
  }
  
  public UsersService impl() {
    return impl;
  }
}












