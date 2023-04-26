// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DbsqlPermissionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DbsqlPermissionsAPI.class);

  private final DbsqlPermissionsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public DbsqlPermissionsAPI(ApiClient apiClient) {
    impl = new DbsqlPermissionsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sql.DbsqlPermissionsService} object
   */
  public DbsqlPermissionsAPI(DbsqlPermissionsService mock) {
    impl = mock;
  }

  /**
   * <p>get.</p>
   *
   * @param objectType a {@link com.databricks.sdk.service.sql.ObjectTypePlural} object
   * @param objectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetResponse} object
   */
  public GetResponse get(ObjectTypePlural objectType, String objectId) {
    return get(new GetDbsqlPermissionRequest().setObjectType(objectType).setObjectId(objectId));
  }

  /**
   * Get object ACL.
   *
   * <p>Gets a JSON representation of the access control list (ACL) for a specified object.
   *
   * @param request a {@link com.databricks.sdk.service.sql.GetDbsqlPermissionRequest} object
   * @return a {@link com.databricks.sdk.service.sql.GetResponse} object
   */
  public GetResponse get(GetDbsqlPermissionRequest request) {
    return impl.get(request);
  }

  /**
   * <p>set.</p>
   *
   * @param objectType a {@link com.databricks.sdk.service.sql.ObjectTypePlural} object
   * @param objectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.SetResponse} object
   */
  public SetResponse set(ObjectTypePlural objectType, String objectId) {
    return set(new SetRequest().setObjectType(objectType).setObjectId(objectId));
  }

  /**
   * Set object ACL.
   *
   * <p>Sets the access control list (ACL) for a specified object. This operation will complete
   * rewrite the ACL.
   *
   * @param request a {@link com.databricks.sdk.service.sql.SetRequest} object
   * @return a {@link com.databricks.sdk.service.sql.SetResponse} object
   */
  public SetResponse set(SetRequest request) {
    return impl.set(request);
  }

  /**
   * <p>transferOwnership.</p>
   *
   * @param objectType a {@link com.databricks.sdk.service.sql.OwnableObjectType} object
   * @param objectId a {@link com.databricks.sdk.service.sql.TransferOwnershipObjectId} object
   * @return a {@link com.databricks.sdk.service.sql.Success} object
   */
  public Success transferOwnership(
      OwnableObjectType objectType, TransferOwnershipObjectId objectId) {
    return transferOwnership(
        new TransferOwnershipRequest().setObjectType(objectType).setObjectId(objectId));
  }

  /**
   * Transfer object ownership.
   *
   * <p>Transfers ownership of a dashboard, query, or alert to an active user. Requires an admin API
   * key.
   *
   * @param request a {@link com.databricks.sdk.service.sql.TransferOwnershipRequest} object
   * @return a {@link com.databricks.sdk.service.sql.Success} object
   */
  public Success transferOwnership(TransferOwnershipRequest request) {
    return impl.transferOwnership(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.DbsqlPermissionsService} object
   */
  public DbsqlPermissionsService impl() {
    return impl;
  }
}
