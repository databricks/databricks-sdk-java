// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;



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
    return get(new GetDbsqlPermissionRequest()
      .setObjectType(objectType)
      .setObjectId(objectId));
  }
  

	/**
   * Get object ACL.
   * 
   * Gets a JSON representation of the access control list (ACL) for a specified
   * object.
   */
  public GetResponse get(GetDbsqlPermissionRequest request) {
    return impl.get(request);
  }
  
	
  public SetResponse set(ObjectTypePlural objectType, String objectId) {
    return set(new SetRequest()
      .setObjectType(objectType)
      .setObjectId(objectId));
  }
  

	/**
   * Set object ACL.
   * 
   * Sets the access control list (ACL) for a specified object. This operation
   * will complete rewrite the ACL.
   */
  public SetResponse set(SetRequest request) {
    return impl.set(request);
  }
  
	
  public Success transferOwnership(OwnableObjectType objectType, TransferOwnershipObjectId objectId) {
    return transferOwnership(new TransferOwnershipRequest()
      .setObjectType(objectType)
      .setObjectId(objectId));
  }
  

	/**
   * Transfer object ownership.
   * 
   * Transfers ownership of a dashboard, query, or alert to an active user.
   * Requires an admin API key.
   */
  public Success transferOwnership(TransferOwnershipRequest request) {
    return impl.transferOwnership(request);
  }
  
  public DbsqlPermissionsService impl() {
    return impl;
  }
}












