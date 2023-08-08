// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Permissions API are used to create read, write, edit, update and manage access for various users
 * on different objects and endpoints.
 *
 * <p>* **[Cluster permissions](:service:clusters)** — Manage which users can manage, restart, or
 * attach to clusters.
 *
 * <p>* **[Cluster policy permissions](:service:clusterpolicies)** — Manage which users can use
 * cluster policies.
 *
 * <p>* **[Delta Live Tables pipeline permissions](:service:pipelines)** — Manage which users can
 * view, manage, run, cancel, or own a Delta Live Tables pipeline.
 *
 * <p>* **[Job permissions](:service:jobs)** — Manage which users can view, manage, trigger, cancel,
 * or own a job.
 *
 * <p>* **[MLflow experiment permissions](:service:experiments)** — Manage which users can read,
 * edit, or manage MLflow experiments.
 *
 * <p>* **[MLflow registered model permissions](:service:modelregistry)** — Manage which users can
 * read, edit, or manage MLflow registered models.
 *
 * <p>* **[Password permissions](:service:users)** — Manage which users can use password login when
 * SSO is enabled.
 *
 * <p>* **[Instance Pool permissions](:service:instancepools)** — Manage which users can manage or
 * attach to pools.
 *
 * <p>* **[Repo permissions](repos)** — Manage which users can read, run, edit, or manage a repo.
 *
 * <p>* **[Serving endpoint permissions](:service:servingendpoints)** — Manage which users can view,
 * query, or manage a serving endpoint.
 *
 * <p>* **[SQL warehouse permissions](:service:warehouses)** — Manage which users can use or manage
 * SQL warehouses.
 *
 * <p>* **[Token permissions](:service:tokenmanagement)** — Manage which users can create or use
 * tokens.
 *
 * <p>* **[Workspace object permissions](:service:workspace)** — Manage which users can read, run,
 * edit, or manage directories, files, and notebooks.
 *
 * <p>For the mapping of the required permissions for specific actions or abilities and other
 * important information, see [Access Control].
 *
 * <p>[Access Control]: https://docs.databricks.com/security/auth-authz/access-control/index.html
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
    return get(
        new GetPermissionRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Get object permissions.
   *
   * <p>Gets the permissions of an object. Objects can inherit permissions from their parent objects
   * or root object.
   */
  public ObjectPermissions get(GetPermissionRequest request) {
    return impl.get(request);
  }

  public GetPermissionLevelsResponse getPermissionLevels(
      String requestObjectType, String requestObjectId) {
    return getPermissionLevels(
        new GetPermissionLevelsRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Get object permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public ObjectPermissions set(String requestObjectType, String requestObjectId) {
    return set(
        new PermissionsRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Set object permissions.
   *
   * <p>Sets permissions on an object. Objects can inherit permissions from their parent objects or
   * root object.
   */
  public ObjectPermissions set(PermissionsRequest request) {
    return impl.set(request);
  }

  public ObjectPermissions update(String requestObjectType, String requestObjectId) {
    return update(
        new PermissionsRequest()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Update object permissions.
   *
   * <p>Updates the permissions on an object. Objects can inherit permissions from their parent
   * objects or root object.
   */
  public ObjectPermissions update(PermissionsRequest request) {
    return impl.update(request);
  }

  public PermissionsService impl() {
    return impl;
  }
}
