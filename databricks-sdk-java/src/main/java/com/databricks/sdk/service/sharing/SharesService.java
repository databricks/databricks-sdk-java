// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;

/**
 * A share is a container instantiated with :method:shares/create. Once created you can iteratively
 * register a collection of existing data assets defined within the metastore using
 * :method:shares/update. You can register data assets under their original name, qualified by their
 * original schema, or provide alternate exposed names.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SharesService {
  /**
   * Create a share.
   *
   * <p>Creates a new share for data objects. Data objects can be added after creation with
   * **update**. The caller must be a metastore admin or have the **CREATE_SHARE** privilege on the
   * metastore.
   */
  ShareInfo create(CreateShare createShare);

  /**
   * Delete a share.
   *
   * <p>Deletes a data object share from the metastore. The caller must be an owner of the share.
   */
  void delete(DeleteShareRequest deleteShareRequest);

  /**
   * Get a share.
   *
   * <p>Gets a data object share from the metastore. The caller must be a metastore admin or the
   * owner of the share.
   */
  ShareInfo get(GetShareRequest getShareRequest);

  /**
   * List shares.
   *
   * <p>Gets an array of data object shares from the metastore. The caller must be a metastore admin
   * or the owner of the share. There is no guarantee of a specific ordering of the elements in the
   * array.
   */
  ListSharesResponse list(ListSharesRequest listSharesRequest);

  /**
   * Get permissions.
   *
   * <p>Gets the permissions for a data share from the metastore. The caller must be a metastore
   * admin or the owner of the share.
   */
  com.databricks.sdk.service.catalog.PermissionsList sharePermissions(
      SharePermissionsRequest sharePermissionsRequest);

  /**
   * Update a share.
   *
   * <p>Updates the share with the changes and data objects in the request. The caller must be the
   * owner of the share or a metastore admin.
   *
   * <p>When the caller is a metastore admin, only the __owner__ field can be updated.
   *
   * <p>In the case that the share name is changed, **updateShare** requires that the caller is both
   * the share owner and a metastore admin.
   *
   * <p>If there are notebook files in the share, the __storage_root__ field cannot be updated.
   *
   * <p>For each table that is added through this method, the share owner must also have **SELECT**
   * privilege on the table. This privilege must be maintained indefinitely for recipients to be
   * able to access the table. Typically, you should use a group as the share owner.
   *
   * <p>Table removals through **update** do not require additional privileges.
   */
  ShareInfo update(UpdateShare updateShare);

  /**
   * Update permissions.
   *
   * <p>Updates the permissions for a data share in the metastore. The caller must be a metastore
   * admin or an owner of the share.
   *
   * <p>For new recipient grants, the user must also be the owner of the recipients. recipient
   * revocations do not require additional privileges.
   */
  void updatePermissions(UpdateSharePermissions updateSharePermissions);
}
