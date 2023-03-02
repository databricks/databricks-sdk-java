// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * The SQL Permissions API is similar to the endpoints of the
 * :method:permissions/set. However, this exposes only one endpoint, which gets
 * the Access Control List for a given object. You cannot modify any permissions
 * using this API.
 * 
 * There are three levels of permission:
 * 
 * - `CAN_VIEW`: Allows read-only access
 * 
 * - `CAN_RUN`: Allows read access and run access (superset of `CAN_VIEW`)
 * 
 * - `CAN_MANAGE`: Allows all actions: read, run, edit, delete, modify
 * permissions (superset of `CAN_RUN`)
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface DbsqlPermissionsService {
	/**
     * Get object ACL.
     * 
     * Gets a JSON representation of the access control list (ACL) for a
     * specified object.
     */
    GetResponse get(GetDbsqlPermissionRequest getDbsqlPermissionRequest);
    
	/**
     * Set object ACL.
     * 
     * Sets the access control list (ACL) for a specified object. This operation
     * will complete rewrite the ACL.
     */
    SetResponse set(SetRequest setRequest);
    
	/**
     * Transfer object ownership.
     * 
     * Transfers ownership of a dashboard, query, or alert to an active user.
     * Requires an admin API key.
     */
    Success transferOwnership(TransferOwnershipRequest transferOwnershipRequest);
    
}