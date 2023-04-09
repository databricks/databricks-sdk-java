// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

/**
 * In Unity Catalog, data is secure by default. Initially, users have no access to data in a
 * metastore. Access can be granted by either a metastore admin, the owner of an object, or the
 * owner of the catalog or schema that contains the object. Securable objects in Unity Catalog are
 * hierarchical and privileges are inherited downward.
 *
 * <p>Securable objects in Unity Catalog are hierarchical and privileges are inherited downward.
 * This means that granting a privilege on the catalog automatically grants the privilege to all
 * current and future objects within the catalog. Similarly, privileges granted on a schema are
 * inherited by all current and future objects within that schema.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface GrantsService {
  /**
   * Get permissions.
   *
   * <p>Gets the permissions for a securable.
   */
  PermissionsList get(GetGrantRequest getGrantRequest);

  /**
   * Get effective permissions.
   *
   * <p>Gets the effective permissions for a securable.
   */
  EffectivePermissionsList getEffective(GetEffectiveRequest getEffectiveRequest);

  /**
   * Update permissions.
   *
   * <p>Updates the permissions for a securable.
   */
  PermissionsList update(UpdatePermissions updatePermissions);
}
