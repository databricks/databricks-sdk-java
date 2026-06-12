// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * Permissions API are used to create read, write, edit, update and manage access for various users
 * on different objects and endpoints.
 *
 * <ul>
 *   <li><b><a href=":service:apps">Apps permissions</a></b> — Manage which users can manage or use
 *       apps.
 *   <li><b><a href=":service:clusters">Cluster permissions</a></b> — Manage which users can manage,
 *       restart, or attach to clusters.
 *   <li><b><a href=":service:clusterpolicies">Cluster policy permissions</a></b> — Manage which
 *       users can use cluster policies.
 *   <li><b><a href=":service:pipelines">Spark Declarative Pipelines permissions</a></b> — Manage
 *       which users can view, manage, run, cancel, or own a Spark Declarative Pipeline.
 *   <li><b><a href=":service:jobs">Job permissions</a></b> — Manage which users can view, manage,
 *       trigger, cancel, or own a job.
 *   <li><b><a href=":service:experiments">MLflow experiment permissions</a></b> — Manage which
 *       users can read, edit, or manage MLflow experiments.
 *   <li><b><a href=":service:modelregistry">MLflow registered model permissions</a></b> — Manage
 *       which users can read, edit, or manage MLflow registered models.
 *   <li><b><a href=":service:instancepools">Instance Pool permissions</a></b> — Manage which users
 *       can manage or attach to pools.
 *   <li><b><a href="repos">Repo permissions</a></b> — Manage which users can read, run, edit, or
 *       manage a repo.
 *   <li><b><a href=":service:servingendpoints">Serving endpoint permissions</a></b> — Manage which
 *       users can view, query, or manage a serving endpoint.
 *   <li><b><a href=":service:warehouses">SQL warehouse permissions</a></b> — Manage which users can
 *       use or manage SQL warehouses.
 *   <li><b><a href=":service:tokenmanagement">Token permissions</a></b> — Manage which users can
 *       create or use tokens.
 *   <li><b><a href=":service:workspace">Workspace object permissions</a></b> — Manage which users
 *       can read, run, edit, or manage alerts, dbsql-dashboards, directories, files, notebooks and
 *       queries. For the mapping of the required permissions for specific actions or abilities and
 *       other important information, see <a
 *       href="https://docs.databricks.com/security/auth-authz/access-control/index.html">Access
 *       Control</a>. Note that to manage access control on service principals, use <b><a
 *       href=":service:accountaccesscontrolproxy">Account Access Control Proxy</a></b>.
 * </ul>
 *
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PermissionsService {
  /**
   * Gets the permissions of an object. Objects can inherit permissions from their parent objects or
   * root object.
   */
  ObjectPermissions get(GetPermissionRequest getPermissionRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetPermissionLevelsResponse getPermissionLevels(
      GetPermissionLevelsRequest getPermissionLevelsRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their parent objects or
   * root object.
   */
  ObjectPermissions set(SetObjectPermissions setObjectPermissions);

  /**
   * Updates the permissions on an object. Objects can inherit permissions from their parent objects
   * or root object.
   */
  ObjectPermissions update(UpdateObjectPermissions updateObjectPermissions);
}
