// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A share is a container instantiated with :method:shares/create. Once created you can iteratively
 * register a collection of existing data assets defined within the metastore using
 * :method:shares/update. You can register data assets under their original name, qualified by their
 * original schema, or provide alternate exposed names.
 */
@Generated
public class SharesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SharesAPI.class);

  private final SharesService impl;

  /** Regular-use constructor */
  public SharesAPI(ApiClient apiClient) {
    impl = new SharesImpl(apiClient);
  }

  /** Constructor for mocks */
  public SharesAPI(SharesService mock) {
    impl = mock;
  }

  public ShareInfo create(String name) {
    return create(new CreateShare().setName(name));
  }

  /**
   * Create a share.
   *
   * <p>Creates a new share for data objects. Data objects can be added after creation with
   * **update**. The caller must be a metastore admin or have the **CREATE_SHARE** privilege on the
   * metastore.
   */
  public ShareInfo create(CreateShare request) {
    return impl.create(request);
  }

  public DeleteResponse delete(String name) {
    return delete(new DeleteShareRequest().setName(name));
  }

  /**
   * Delete a share.
   *
   * <p>Deletes a data object share from the metastore. The caller must be an owner of the share.
   */
  public DeleteResponse delete(DeleteShareRequest request) {
    return impl.delete(request);
  }

  public ShareInfo get(String name) {
    return get(new GetShareRequest().setName(name));
  }

  /**
   * Get a share.
   *
   * <p>Gets a data object share from the metastore. The caller must be a metastore admin or the
   * owner of the share.
   */
  public ShareInfo get(GetShareRequest request) {
    return impl.get(request);
  }

  /**
   * List shares.
   *
   * <p>Gets an array of data object shares from the metastore. The caller must be a metastore admin
   * or the owner of the share. There is no guarantee of a specific ordering of the elements in the
   * array.
   */
  public Iterable<ShareInfo> list() {
    return impl.list().getShares();
  }

  public com.databricks.sdk.service.catalog.PermissionsList sharePermissions(String name) {
    return sharePermissions(new SharePermissionsRequest().setName(name));
  }

  /**
   * Get permissions.
   *
   * <p>Gets the permissions for a data share from the metastore. The caller must be a metastore
   * admin or the owner of the share.
   */
  public com.databricks.sdk.service.catalog.PermissionsList sharePermissions(
      SharePermissionsRequest request) {
    return impl.sharePermissions(request);
  }

  public ShareInfo update(String name) {
    return update(new UpdateShare().setName(name));
  }

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
   * <p>For each table that is added through this method, the share owner must also have **SELECT**
   * privilege on the table. This privilege must be maintained indefinitely for recipients to be
   * able to access the table. Typically, you should use a group as the share owner.
   *
   * <p>Table removals through **update** do not require additional privileges.
   */
  public ShareInfo update(UpdateShare request) {
    return impl.update(request);
  }

  public UpdatePermissionsResponse updatePermissions(String name) {
    return updatePermissions(new UpdateSharePermissions().setName(name));
  }

  /**
   * Update permissions.
   *
   * <p>Updates the permissions for a data share in the metastore. The caller must be a metastore
   * admin or an owner of the share.
   *
   * <p>For new recipient grants, the user must also be the owner of the recipients. recipient
   * revocations do not require additional privileges.
   */
  public UpdatePermissionsResponse updatePermissions(UpdateSharePermissions request) {
    return impl.updatePermissions(request);
  }

  public SharesService impl() {
    return impl;
  }
}
