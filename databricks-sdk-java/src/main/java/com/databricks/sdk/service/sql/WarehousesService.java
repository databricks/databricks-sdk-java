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

  /**
   * Creates a new default warehouse override for a user. Users can create their own override.
   * Admins can create overrides for any user.
   */
  DefaultWarehouseOverride createDefaultWarehouseOverride(
      CreateDefaultWarehouseOverrideRequest createDefaultWarehouseOverrideRequest);

  /** Deletes a SQL warehouse. */
  void delete(DeleteWarehouseRequest deleteWarehouseRequest);

  /**
   * Deletes the default warehouse override for a user. Users can delete their own override. Admins
   * can delete overrides for any user. After deletion, the workspace default warehouse will be
   * used.
   */
  void deleteDefaultWarehouseOverride(
      DeleteDefaultWarehouseOverrideRequest deleteDefaultWarehouseOverrideRequest);

  /** Updates the configuration for a SQL warehouse. */
  void edit(EditWarehouseRequest editWarehouseRequest);

  /** Gets the information for a single SQL warehouse. */
  GetWarehouseResponse get(GetWarehouseRequest getWarehouseRequest);

  /**
   * Returns the default warehouse override for a user. Users can fetch their own override. Admins
   * can fetch overrides for any user. If no override exists, the UI will fallback to the workspace
   * default warehouse.
   */
  DefaultWarehouseOverride getDefaultWarehouseOverride(
      GetDefaultWarehouseOverrideRequest getDefaultWarehouseOverrideRequest);

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
   * Lists all default warehouse overrides in the workspace. Only workspace administrators can list
   * all overrides.
   */
  ListDefaultWarehouseOverridesResponse listDefaultWarehouseOverrides(
      ListDefaultWarehouseOverridesRequest listDefaultWarehouseOverridesRequest);

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
   * Updates an existing default warehouse override for a user. Users can update their own override.
   * Admins can update overrides for any user.
   */
  DefaultWarehouseOverride updateDefaultWarehouseOverride(
      UpdateDefaultWarehouseOverrideRequest updateDefaultWarehouseOverrideRequest);

  /**
   * Updates the permissions on a SQL warehouse. SQL warehouses can inherit permissions from their
   * root object.
   */
  WarehousePermissions updatePermissions(WarehousePermissionsRequest warehousePermissionsRequest);
}
