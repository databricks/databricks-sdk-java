// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

/**
 * The SQL Permissions API is similar to the endpoints of the :method:permissions/set. However, this
 * exposes only one endpoint, which gets the Access Control List for a given object. You cannot
 * modify any permissions using this API.
 *
 * <p>There are three levels of permission:
 *
 * <p>- `CAN_VIEW`: Allows read-only access
 *
 * <p>- `CAN_RUN`: Allows read access and run access (superset of `CAN_VIEW`)
 *
 * <p>- `CAN_MANAGE`: Allows all actions: read, run, edit, delete, modify permissions (superset of
 * `CAN_RUN`)
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface DbsqlPermissionsService {
  /**
   * Get object ACL.
   *
   * <p>Gets a JSON representation of the access control list (ACL) for a specified object.
   *
   * @param getDbsqlPermissionRequest a {@link com.databricks.sdk.service.sql.GetDbsqlPermissionRequest} object
   * @return a {@link com.databricks.sdk.service.sql.GetResponse} object
   */
  GetResponse get(GetDbsqlPermissionRequest getDbsqlPermissionRequest);

  /**
   * Set object ACL.
   *
   * <p>Sets the access control list (ACL) for a specified object. This operation will complete
   * rewrite the ACL.
   *
   * @param setRequest a {@link com.databricks.sdk.service.sql.SetRequest} object
   * @return a {@link com.databricks.sdk.service.sql.SetResponse} object
   */
  SetResponse set(SetRequest setRequest);

  /**
   * Transfer object ownership.
   *
   * <p>Transfers ownership of a dashboard, query, or alert to an active user. Requires an admin API
   * key.
   *
   * @param transferOwnershipRequest a {@link com.databricks.sdk.service.sql.TransferOwnershipRequest} object
   * @return a {@link com.databricks.sdk.service.sql.Success} object
   */
  Success transferOwnership(TransferOwnershipRequest transferOwnershipRequest);
}
