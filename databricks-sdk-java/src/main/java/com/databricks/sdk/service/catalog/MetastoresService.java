// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

/**
 * A metastore is the top-level container of objects in Unity Catalog. It stores data assets (tables
 * and views) and the permissions that govern access to them. Databricks account admins can create
 * metastores and assign them to Databricks workspaces to control which workloads use each
 * metastore. For a workspace to use Unity Catalog, it must have a Unity Catalog metastore attached.
 *
 * <p>Each metastore is configured with a root storage location in a cloud storage account. This
 * storage location is used for metadata and managed tables data.
 *
 * <p>NOTE: This metastore is distinct from the metastore included in Databricks workspaces created
 * before Unity Catalog was released. If your workspace includes a legacy Hive metastore, the data
 * in that metastore is available in a catalog named hive_metastore.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface MetastoresService {
  /**
   * Create an assignment.
   *
   * <p>Creates a new metastore assignment. If an assignment for the same __workspace_id__ exists,
   * it will be overwritten by the new __metastore_id__ and __default_catalog_name__. The caller
   * must be an account admin.
   *
   * @param createMetastoreAssignment a {@link com.databricks.sdk.service.catalog.CreateMetastoreAssignment} object
   */
  void assign(CreateMetastoreAssignment createMetastoreAssignment);

  /**
   * Create a metastore.
   *
   * <p>Creates a new metastore based on a provided name and storage root path.
   *
   * @param createMetastore a {@link com.databricks.sdk.service.catalog.CreateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  MetastoreInfo create(CreateMetastore createMetastore);

  /**
   * Get metastore assignment for workspace.
   *
   * <p>Gets the metastore assignment for the workspace being accessed.
   *
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  MetastoreAssignment current();

  /**
   * Delete a metastore.
   *
   * <p>Deletes a metastore. The caller must be a metastore admin.
   *
   * @param deleteMetastoreRequest a {@link com.databricks.sdk.service.catalog.DeleteMetastoreRequest} object
   */
  void delete(DeleteMetastoreRequest deleteMetastoreRequest);

  /**
   * Get a metastore.
   *
   * <p>Gets a metastore that matches the supplied ID. The caller must be a metastore admin to
   * retrieve this info.
   *
   * @param getMetastoreRequest a {@link com.databricks.sdk.service.catalog.GetMetastoreRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  MetastoreInfo get(GetMetastoreRequest getMetastoreRequest);

  /**
   * List metastores.
   *
   * <p>Gets an array of the available metastores (as __MetastoreInfo__ objects). The caller must be
   * an admin to retrieve this info. There is no guarantee of a specific ordering of the elements in
   * the array.
   *
   * @return a {@link com.databricks.sdk.service.catalog.ListMetastoresResponse} object
   */
  ListMetastoresResponse list();

  /**
   * Enables or disables auto maintenance on the metastore.
   *
   * <p>Enables or disables auto maintenance on the metastore.
   *
   * @param updateAutoMaintenance a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenance} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse} object
   */
  UpdateAutoMaintenanceResponse maintenance(UpdateAutoMaintenance updateAutoMaintenance);

  /**
   * Get a metastore summary.
   *
   * <p>Gets information about a metastore. This summary includes the storage credential, the cloud
   * vendor, the cloud region, and the global metastore ID.
   *
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  GetMetastoreSummaryResponse summary();

  /**
   * Delete an assignment.
   *
   * <p>Deletes a metastore assignment. The caller must be an account administrator.
   *
   * @param unassignRequest a {@link com.databricks.sdk.service.catalog.UnassignRequest} object
   */
  void unassign(UnassignRequest unassignRequest);

  /**
   * Update a metastore.
   *
   * <p>Updates information for a specific metastore. The caller must be a metastore admin.
   *
   * @param updateMetastore a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  MetastoreInfo update(UpdateMetastore updateMetastore);

  /**
   * Update an assignment.
   *
   * <p>Updates a metastore assignment. This operation can be used to update __metastore_id__ or
   * __default_catalog_name__ for a specified Workspace, if the Workspace is already assigned a
   * metastore. The caller must be an account admin to update __metastore_id__; otherwise, the
   * caller can be a Workspace admin.
   *
   * @param updateMetastoreAssignment a {@link com.databricks.sdk.service.catalog.UpdateMetastoreAssignment} object
   */
  void updateAssignment(UpdateMetastoreAssignment updateMetastoreAssignment);
}
