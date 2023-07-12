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
 * Permissions API are used to create read, write, edit, update and manage
 * access for various users on different objects and endpoints.
 */
@Generated
public class PermissionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PermissionsAPI.class);

  private final PermissionsService impl;

  /** Regular-use constructor */
  public PermissionsAPI(ApiClient apiClient) {
    impl = new PermissionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public PermissionsAPI(PermissionsService mock) {
    impl = mock;
  }
  

	
	
  public ObjectPermissions get(String requestObjectType, String requestObjectId) {
    return get(new GetPermissionRequest()
      .setRequestObjectType(requestObjectType)
      .setRequestObjectId(requestObjectId));
  }
  

	/**
   * Get object permissions.
   * 
   * Gets the permission of an object. Objects can inherit permissions from
   * their parent objects or root objects.
   */
  public ObjectPermissions get(GetPermissionRequest request) {
    return impl.get(request);
  }
  
	
  public GetPermissionLevelsResponse getPermissionLevels(String requestObjectType, String requestObjectId) {
    return getPermissionLevels(new GetPermissionLevelsRequest()
      .setRequestObjectType(requestObjectType)
      .setRequestObjectId(requestObjectId));
  }
  

	/**
   * Get permission levels.
   * 
   * Gets the permission levels that a user can have on an object.
   */
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }
  
	
  public void set(String requestObjectType, String requestObjectId) {
    set(new PermissionsRequest()
      .setRequestObjectType(requestObjectType)
      .setRequestObjectId(requestObjectId));
  }
  

	/**
   * Set permissions.
   * 
   * Sets permissions on object. Objects can inherit permissions from their
   * parent objects and root objects.
   */
  public void set(PermissionsRequest request) {
    impl.set(request);
  }
  
	
  public void update(String requestObjectType, String requestObjectId) {
    update(new PermissionsRequest()
      .setRequestObjectType(requestObjectType)
      .setRequestObjectId(requestObjectId));
  }
  

	/**
   * Update permission.
   * 
   * Updates the permissions on an object.
   */
  public void update(PermissionsRequest request) {
    impl.update(request);
  }
  
  public PermissionsService impl() {
    return impl;
  }
}












