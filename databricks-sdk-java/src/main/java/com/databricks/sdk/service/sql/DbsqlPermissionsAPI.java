// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
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
 */
@Generated
public class DbsqlPermissionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DbsqlPermissionsAPI.class);

  private final DbsqlPermissionsService impl;

  /** Regular-use constructor */
  public DbsqlPermissionsAPI(ApiClient apiClient) {
    impl = new DbsqlPermissionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DbsqlPermissionsAPI(DbsqlPermissionsService mock) {
    impl = mock;
  }

  public GetResponse get(ObjectTypePlural objectType, String objectId) {
    return get(new GetDbsqlPermissionRequest().setObjectType(objectType).setObjectId(objectId));
  }

  /**
   * Gets a JSON representation of the access control list (ACL) for a specified object.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:workspace/getpermissions instead.
   * <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public GetResponse get(GetDbsqlPermissionRequest request) {
    return impl.get(request);
  }

  /**
   * Sets the access control list (ACL) for a specified object. This operation will complete rewrite
   * the ACL.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:workspace/setpermissions instead.
   * <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public SetResponse set(SetRequest request) {
    return impl.set(request);
  }

  /**
   * Transfers ownership of a dashboard, query, or alert to an active user. Requires an admin API
   * key.
   *
   * <p><b>Warning</b>: This API is deprecated. For queries and alerts, please use
   * :method:queries/update and :method:alerts/update respectively instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public Success transferOwnership(TransferOwnershipRequest request) {
    return impl.transferOwnership(request);
  }

  public DbsqlPermissionsService impl() {
    return impl;
  }
}
