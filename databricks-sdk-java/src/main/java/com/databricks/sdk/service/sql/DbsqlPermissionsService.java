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
 * <ul>
 *   <li>{@code CAN_VIEW}: Allows read-only access
 *   <li>{@code CAN_RUN}: Allows read access and run access (superset of {@code CAN_VIEW})
 *   <li>{@code CAN_MANAGE}: Allows all actions: read, run, edit, delete, modify permissions
 *       (superset of {@code CAN_RUN})
 * </ul>
 *
 * <p><b>Warning</b>: This API is deprecated. Please see the latest version of the Databricks SQL
 * API. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
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
   * <p><b>Warning</b>: This API is deprecated. Please use :method:workspace/getpermissions instead.
   * <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  GetResponse get(GetDbsqlPermissionRequest getDbsqlPermissionRequest);

  /**
   * Sets the access control list (ACL) for a specified object. This operation will complete rewrite
   * the ACL.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:workspace/setpermissions instead.
   * <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  SetResponse set(SetRequest setRequest);

  /**
   * Transfers ownership of a dashboard, query, or alert to an active user. Requires an admin API
   * key.
   *
   * <p><b>Warning</b>: This API is deprecated. For queries and alerts, please use
   * :method:queries/update and :method:alerts/update respectively instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  Success transferOwnership(TransferOwnershipRequest transferOwnershipRequest);
}
