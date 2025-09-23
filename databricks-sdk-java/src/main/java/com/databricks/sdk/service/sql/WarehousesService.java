// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * A SQL warehouse is a compute resource that lets you run SQL commands on data objects within
 * Databricks SQL. Compute resources are infrastructure resources that provide processing
 * capabilities in the cloud.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WarehousesService {
  /** Creates a new SQL warehouse. */
  CreateWarehouseResponse create(CreateWarehouseRequest createWarehouseRequest);

  /** Deletes a SQL warehouse. */
  void delete(DeleteWarehouseRequest deleteWarehouseRequest);

  /** Updates the configuration for a SQL warehouse. */
  void edit(EditWarehouseRequest editWarehouseRequest);

  /** Gets the information for a single SQL warehouse. */
  GetWarehouseResponse get(GetWarehouseRequest getWarehouseRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetWarehousePermissionLevelsResponse getPermissionLevels(
      GetWarehousePermissionLevelsRequest getWarehousePermissionLevelsRequest);

  /**
   * Gets the permissions of a SQL warehouse. SQL warehouses can inherit permissions from their root
   * object.
   */
  WarehousePermissions getPermissions(
      GetWarehousePermissionsRequest getWarehousePermissionsRequest);

  /** Gets the workspace level configuration that is shared by all SQL warehouses in a workspace. */
  GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig();

  /** Lists all SQL warehouses that a user has access to. */
  ListWarehousesResponse list(ListWarehousesRequest listWarehousesRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  WarehousePermissions setPermissions(WarehousePermissionsRequest warehousePermissionsRequest);

  /** Sets the workspace level configuration that is shared by all SQL warehouses in a workspace. */
  void setWorkspaceWarehouseConfig(
      SetWorkspaceWarehouseConfigRequest setWorkspaceWarehouseConfigRequest);

  /** Starts a SQL warehouse. */
  void start(StartRequest startRequest);

  /** Stops a SQL warehouse. */
  void stop(StopRequest stopRequest);

  /**
   * Updates the permissions on a SQL warehouse. SQL warehouses can inherit permissions from their
   * root object.
   */
  WarehousePermissions updatePermissions(WarehousePermissionsRequest warehousePermissionsRequest);
}
