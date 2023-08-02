// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * Permissions API are used to create read, write, edit, update and manage access for various users
 * on different objects and endpoints:
 *
 * <p>* **[Cluster permissions](clusters)** — Manage which users can manage, restart, or attach to
 * clusters.
 *
 * <p>* **[Cluster policy permissions](clusterpolicies)** — Manage which users can use cluster
 * policies.
 *
 * <p>* **[Delta Live Tables pipeline permissions](pipelines)** — Manage which users can view,
 * manage, run, cancel, or own a Delta Live Tables pipeline.
 *
 * <p>* **[Job permissions](jobs)** — Manage which users can view, manage, trigger, cancel, or own a
 * job.
 *
 * <p>* **[MLflow experiment permissions](experiments)** — Manage which users can read, edit, or
 * manage MLflow experiments.
 *
 * <p>* **[MLflow registered model permissions](modelregistry)** — Manage which users can read,
 * edit, or manage MLflow registered models.
 *
 * <p>* **[Password permissions](users)** — Manage which users can use password login when SSO is
 * enabled.
 *
 * <p>* **[Instance Pool permissions](instancepools)** — Manage which users can manage or attach to
 * pools.
 *
 * <p>* **[Repo permissions](repos)** — Manage which users can read, run, edit, or manage a repo.
 *
 * <p>* **[Serving endpoint permissions](servingendpoints)** — Manage which users can view, query,
 * or manage a serving endpoint.
 *
 * <p>* **[SQL warehouse permissions](warehouses)** — Manage which users can use or manage SQL
 * warehouses.
 *
 * <p>* **[Token permissions](tokenmanagement)** — Manage which users can create or use tokens.
 *
 * <p>* **[Workspace object permissions](workspace)** — Manage which users can read, run, edit, or
 * manage directories, files, and notebooks.
 *
 * <p>For the mapping of the required permissions for specific actions or abilities and other
 * important information, see [Access Control].
 *
 * <p>[Access Control]: https://docs.databricks.com/security/auth-authz/access-control/index.html
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PermissionsService {
  /**
   * Get object permissions.
   *
   * <p>Gets the permissions of an object. Objects can inherit permissions from their parent objects
   * or root object.
   */
  ObjectPermissions get(GetPermissionRequest getPermissionRequest);

  /**
   * Get object permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetPermissionLevelsResponse getPermissionLevels(
      GetPermissionLevelsRequest getPermissionLevelsRequest);

  /**
   * Set object permissions.
   *
   * <p>Sets permissions on an object. Objects can inherit permissions from their parent objects or
   * root object.
   */
  ObjectPermissions set(PermissionsRequest permissionsRequest);

  /**
   * Update object permissions.
   *
   * <p>Updates the permissions on an object. Objects can inherit permissions from their parent
   * objects or root object.
   */
  ObjectPermissions update(PermissionsRequest permissionsRequest);
}
