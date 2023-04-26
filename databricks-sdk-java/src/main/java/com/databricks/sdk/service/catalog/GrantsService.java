// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface GrantsService {
  /**
   * Get permissions.
   *
   * <p>Gets the permissions for a securable.
   *
   * @param getGrantRequest a {@link com.databricks.sdk.service.catalog.GetGrantRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsList} object
   */
  PermissionsList get(GetGrantRequest getGrantRequest);

  /**
   * Get effective permissions.
   *
   * <p>Gets the effective permissions for a securable.
   *
   * @param getEffectiveRequest a {@link com.databricks.sdk.service.catalog.GetEffectiveRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePermissionsList} object
   */
  EffectivePermissionsList getEffective(GetEffectiveRequest getEffectiveRequest);

  /**
   * Update permissions.
   *
   * <p>Updates the permissions for a securable.
   *
   * @param updatePermissions a {@link com.databricks.sdk.service.catalog.UpdatePermissions} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsList} object
   */
  PermissionsList update(UpdatePermissions updatePermissions);
}
