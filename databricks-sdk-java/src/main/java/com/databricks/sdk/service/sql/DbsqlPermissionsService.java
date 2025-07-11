// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

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
 * <p>**Note**: A new version of the Databricks SQL API is now available. [Learn more]
 *
 * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DbsqlPermissionsService {
  /**
   * Gets a JSON representation of the access control list (ACL) for a specified object.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:workspace/getpermissions instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  GetResponse get(GetDbsqlPermissionRequest getDbsqlPermissionRequest);

  /**
   * Sets the access control list (ACL) for a specified object. This operation will complete rewrite
   * the ACL.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:workspace/setpermissions instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  SetResponse set(SetRequest setRequest);

  /**
   * Transfers ownership of a dashboard, query, or alert to an active user. Requires an admin API
   * key.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. For queries and alerts,
   * please use :method:queries/update and :method:alerts/update respectively instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  Success transferOwnership(TransferOwnershipRequest transferOwnershipRequest);
}
