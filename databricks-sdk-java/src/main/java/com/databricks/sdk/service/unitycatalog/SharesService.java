// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Databricks Delta Sharing: Shares REST API
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface SharesService {
	/**
     * Create a share.
     * 
     * Creates a new share for data objects. Data objects can be added at this
     * time or after creation with **update**. The caller must be a Metastore
     * admin or have the CREATE_SHARE privilege on the Metastore.
     */
    ShareInfo create(CreateShare createShare);
    
	/**
     * Delete a share.
     * 
     * Deletes a data object share from the Metastore. The caller must be an
     * owner of the share.
     */
    void delete(DeleteShareRequest deleteShareRequest);
    
	/**
     * Get a share.
     * 
     * Gets a data object share from the Metastore. The caller must be a
     * Metastore admin or the owner of the share.
     */
    ShareInfo get(GetShareRequest getShareRequest);
    
	/**
     * List shares.
     * 
     * Gets an array of data object shares from the Metastore. The caller must
     * be a Metastore admin or the owner of the share.
     */
    ListSharesResponse list();
    
	/**
     * Get permissions.
     * 
     * Gets the permissions for a data share from the Metastore. The caller must
     * be a Metastore admin or the owner of the share.
     */
    GetSharePermissionsResponse sharePermissions(SharePermissionsRequest sharePermissionsRequest);
    
	/**
     * Update a share.
     * 
     * Updates the share with the changes and data objects in the request. The
     * caller must be the owner of the share or a Metastore admin.
     * 
     * When the caller is a Metastore admin, only the __owner__ field can be
     * updated.
     * 
     * In the case that the Share name is changed, **updateShare** requires that
     * the caller is both the share owner and a Metastore admin.
     * 
     * For each table that is added through this method, the share owner must
     * also have SELECT privilege on the table. This privilege must be
     * maintained indefinitely for recipients to be able to access the table.
     * Typically, you should use a group as the share owner.
     * 
     * Table removals through **update** do not require additional privileges.
     */
    ShareInfo update(UpdateShare updateShare);
    
	/**
     * Update permissions.
     * 
     * Updates the permissions for a data share in the Metastore. The caller
     * must be a Metastore admin or an owner of the share.
     * 
     * For new recipient grants, the user must also be the owner of the
     * recipients. recipient revocations do not require additional privileges.
     */
    void updatePermissions(UpdateSharePermissions updateSharePermissions);
    
}