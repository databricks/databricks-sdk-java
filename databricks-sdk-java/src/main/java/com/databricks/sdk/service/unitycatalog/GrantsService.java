// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * In Unity Catalog, data is secure by default. Initially, users have no access
 * to data in a metastore. Access can be granted by either a metastore admin,
 * the owner of an object, or the owner of the catalog or schema that contains
 * the object. Securable objects in Unity Catalog are hierarchical and
 * privileges are inherited downward.
 * 
 * Initially, users have no access to data in a metastore. Access can be granted
 * by either a metastore admin, the owner of an object, or the owner of the
 * catalog or schema that contains the object.
 * 
 * Securable objects in Unity Catalog are hierarchical and privileges are
 * inherited downward. This means that granting a privilege on the catalog
 * automatically grants the privilege to all current and future objects within
 * the catalog. Similarly, privileges granted on a schema are inherited by all
 * current and future objects within that schema.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface GrantsService {
	/**
     * Get permissions.
     * 
     * Gets the permissions for a Securable type.
     */
    GetPermissionsResponse get(GetGrantRequest getGrantRequest);
    
	/**
     * Update permissions.
     * 
     * Updates the permissions for a Securable type.
     */
    void update(UpdatePermissions updatePermissions);
    
}