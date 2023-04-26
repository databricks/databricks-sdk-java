// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Permissions API are used to create read, write, edit, update and manage access for various users
 * on different objects and endpoints.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermissionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PermissionsAPI.class);

  private final PermissionsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PermissionsAPI(ApiClient apiClient) {
    impl = new PermissionsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.iam.PermissionsService} object
   */
  public PermissionsAPI(PermissionsService mock) {
    impl = mock;
  }

  /**
   * <p>get.</p>
   *
   * @param requestObjectType a {@link java.lang.String} object
   * @param requestObjectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ObjectPermissions} object
   */
  public ObjectPermissions get(String requestObjectType, String requestObjectId) {
    return get(
        new GetPermissionRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Get object permissions.
   *
   * <p>Gets the permission of an object. Objects can inherit permissions from their parent objects
   * or root objects.
   *
   * @param request a {@link com.databricks.sdk.service.iam.GetPermissionRequest} object
   * @return a {@link com.databricks.sdk.service.iam.ObjectPermissions} object
   */
  public ObjectPermissions get(GetPermissionRequest request) {
    return impl.get(request);
  }

  /**
   * <p>getPermissionLevels.</p>
   *
   * @param requestObjectType a {@link java.lang.String} object
   * @param requestObjectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.GetPermissionLevelsResponse} object
   */
  public GetPermissionLevelsResponse getPermissionLevels(
      String requestObjectType, String requestObjectId) {
    return getPermissionLevels(
        new GetPermissionLevelsRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Get permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   *
   * @param request a {@link com.databricks.sdk.service.iam.GetPermissionLevelsRequest} object
   * @return a {@link com.databricks.sdk.service.iam.GetPermissionLevelsResponse} object
   */
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  /**
   * <p>set.</p>
   *
   * @param requestObjectType a {@link java.lang.String} object
   * @param requestObjectId a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.iam.PermissionsRequest} object
   */
  public void set(PermissionsRequest request) {
    impl.set(request);
  }

  /**
   * <p>update.</p>
   *
   * @param requestObjectType a {@link java.lang.String} object
   * @param requestObjectId a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.iam.PermissionsRequest} object
   */
  public void update(PermissionsRequest request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.PermissionsService} object
   */
  public PermissionsService impl() {
    return impl;
  }
}
