// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Permissions API are used to create read, write, edit, update and manage access for various users
 * on different objects and endpoints. * **[Apps permissions](:service:apps)** — Manage which users
 * can manage or use apps. * **[Cluster permissions](:service:clusters)** — Manage which users can
 * manage, restart, or attach to clusters. * **[Cluster policy
 * permissions](:service:clusterpolicies)** — Manage which users can use cluster policies. *
 * **[Delta Live Tables pipeline permissions](:service:pipelines)** — Manage which users can view,
 * manage, run, cancel, or own a Delta Live Tables pipeline. * **[Job permissions](:service:jobs)**
 * — Manage which users can view, manage, trigger, cancel, or own a job. * **[MLflow experiment
 * permissions](:service:experiments)** — Manage which users can read, edit, or manage MLflow
 * experiments. * **[MLflow registered model permissions](:service:modelregistry)** — Manage which
 * users can read, edit, or manage MLflow registered models. * **[Instance Pool
 * permissions](:service:instancepools)** — Manage which users can manage or attach to pools. *
 * **[Repo permissions](repos)** — Manage which users can read, run, edit, or manage a repo. *
 * **[Serving endpoint permissions](:service:servingendpoints)** — Manage which users can view,
 * query, or manage a serving endpoint. * **[SQL warehouse permissions](:service:warehouses)** —
 * Manage which users can use or manage SQL warehouses. * **[Token
 * permissions](:service:tokenmanagement)** — Manage which users can create or use tokens. *
 * **[Workspace object permissions](:service:workspace)** — Manage which users can read, run, edit,
 * or manage alerts, dbsql-dashboards, directories, files, notebooks and queries. For the mapping of
 * the required permissions for specific actions or abilities and other important information, see
 * [Access Control]. Note that to manage access control on service principals, use **[Account Access
 * Control Proxy](:service:accountaccesscontrolproxy)**.
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
   * Gets the permissions of an object. Objects can inherit permissions from their parent objects or
   * root object.
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

  /** Gets the permission levels that a user can have on an object. */
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public ObjectPermissions set(String requestObjectType, String requestObjectId) {
    return set(
        new SetObjectPermissions()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their parent objects or
   * root object.
   */
  public ObjectPermissions set(SetObjectPermissions request) {
    return impl.set(request);
  }

  public ObjectPermissions update(String requestObjectType, String requestObjectId) {
    return update(
        new UpdateObjectPermissions()
            .setRequestObjectType(requestObjectType)
            .setRequestObjectId(requestObjectId));
  }

  /**
   * Updates the permissions on an object. Objects can inherit permissions from their parent objects
   * or root object.
   */
  public ObjectPermissions update(UpdateObjectPermissions request) {
    return impl.update(request);
  }

  public PermissionsService impl() {
    return impl;
  }
}
