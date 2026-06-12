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
public interface SharesService extends SharesExtService {
  /**
   * Creates a new share for data objects. Data objects can be added after creation with
   * <b>update</b>. The caller must be a metastore admin or have the <b>CREATE_SHARE</b> privilege
   * on the metastore.
   */
  ShareInfo create(CreateShare createShare);

  /** Deletes a data object share from the metastore. The caller must be an owner of the share. */
  void delete(DeleteShareRequest deleteShareRequest);

  /**
   * Gets a data object share from the metastore. The caller must have the USE_SHARE privilege on
   * the metastore or be the owner of the share.
   */
  ShareInfo get(GetShareRequest getShareRequest);

  /**
   * Gets an array of data object shares from the metastore. If the caller has the USE_SHARE
   * privilege on the metastore, all shares are returned. Otherwise, only shares owned by the caller
   * are returned. There is no guarantee of a specific ordering of the elements in the array.
   */
  ListSharesResponse listShares(SharesListRequest sharesListRequest);

  /**
   * Gets the permissions for a data share from the metastore. The caller must have the USE_SHARE
   * privilege on the metastore or be the owner of the share.
   */
  GetSharePermissionsResponse sharePermissions(SharePermissionsRequest sharePermissionsRequest);

  /**
   * Updates the share with the changes and data objects in the request. The caller must be the
   * owner of the share or a metastore admin.
   *
   * <p>When the caller is a metastore admin, only the <b>owner</b> field can be updated.
   *
   * <p>In the case the share name is changed, <b>updateShare</b> requires that the caller is the
   * owner of the share and has the CREATE_SHARE privilege.
   *
   * <p>If there are notebook files in the share, the <b>storage_root</b> field cannot be updated.
   *
   * <p>For each table that is added through this method, the share owner must also have
   * <b>SELECT</b> privilege on the table. This privilege must be maintained indefinitely for
   * recipients to be able to access the table. Typically, you should use a group as the share
   * owner.
   *
   * <p>Table removals through <b>update</b> do not require additional privileges.
   */
  ShareInfo update(UpdateShare updateShare);

  /**
   * Updates the permissions for a data share in the metastore. The caller must have both the
   * USE_SHARE and SET_SHARE_PERMISSION privileges on the metastore, or be the owner of the share.
   *
   * <p>For new recipient grants, the user must also be the owner of the recipients. recipient
   * revocations do not require additional privileges.
   */
  UpdateSharePermissionsResponse updatePermissions(UpdateSharePermissions updateSharePermissions);
}
