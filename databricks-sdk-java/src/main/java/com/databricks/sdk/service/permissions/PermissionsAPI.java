// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Permissions API are used to create read, write, edit, update and manage access for various users
 * on different objects and endpoints.
 */
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
    return get(
        new Get().setRequestObjectType(requestObjectType).setRequestObjectId(requestObjectId));
  }

  /**
   * Get object permissions.
   *
   * <p>Gets the permission of an object. Objects can inherit permissions from their parent objects
   * or root objects.
   */
  public ObjectPermissions get(Get request) {
    return impl.get(request);
  }

  public GetPermissionLevelsResponse getPermissionLevels(
      String requestObjectType, String requestObjectId) {
    return getPermissionLevels(
        new GetPermissionLevels()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Get permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevels request) {
    return impl.getPermissionLevels(request);
  }

  public void set(String requestObjectType, String requestObjectId) {
    set(
        new PermissionsRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Set permissions.
   *
   * <p>Sets permissions on object. Objects can inherit permissions from their parent objects and
   * root objects.
   */
  public void set(PermissionsRequest request) {
    impl.set(request);
  }

  public void update(String requestObjectType, String requestObjectId) {
    update(
        new PermissionsRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Update permission.
   *
   * <p>Updates the permissions on an object.
   */
  public void update(PermissionsRequest request) {
    impl.update(request);
  }

  public PermissionsService impl() {
    return impl;
  }
}
