// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

/**
 * Permissions API are used to create read, write, edit, update and manage access for various users
 * on different objects and endpoints.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface PermissionsService {
  /**
   * Get object permissions.
   *
   * <p>Gets the permission of an object. Objects can inherit permissions from their parent objects
   * or root objects.
   */
  ObjectPermissions get(Get get);

  /**
   * Get permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevels getPermissionLevels);

  /**
   * Set permissions.
   *
   * <p>Sets permissions on object. Objects can inherit permissions from their parent objects and
   * root objects.
   */
  void set(PermissionsRequest permissionsRequest);

  /**
   * Update permission.
   *
   * <p>Updates the permissions on an object.
   */
  void update(PermissionsRequest permissionsRequest);
}
