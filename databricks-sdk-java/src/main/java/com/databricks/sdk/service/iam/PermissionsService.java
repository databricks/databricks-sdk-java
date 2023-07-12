// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * Permissions API are used to create read, write, edit, update and manage
 * access for various users on different objects and endpoints.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PermissionsService {
	/**
   * Get object permissions.
   * 
   * Gets the permission of an object. Objects can inherit permissions from
   * their parent objects or root objects.
   */
  ObjectPermissions get(GetPermissionRequest getPermissionRequest);
  
	/**
   * Get permission levels.
   * 
   * Gets the permission levels that a user can have on an object.
   */
  GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest getPermissionLevelsRequest);
  
	/**
   * Set permissions.
   * 
   * Sets permissions on object. Objects can inherit permissions from their
   * parent objects and root objects.
   */
  void set(PermissionsRequest permissionsRequest);
  
	/**
   * Update permission.
   * 
   * Updates the permissions on an object.
   */
  void update(PermissionsRequest permissionsRequest);
  
}