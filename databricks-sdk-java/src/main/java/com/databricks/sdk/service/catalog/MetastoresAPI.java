// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class MetastoresAPI {
  private static final Logger LOG = LoggerFactory.getLogger(MetastoresAPI.class);

  private final MetastoresService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public MetastoresAPI(ApiClient apiClient) {
    impl = new MetastoresImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.catalog.MetastoresService} object
   */
  public MetastoresAPI(MetastoresService mock) {
    impl = mock;
  }

  /**
   * <p>assign.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @param defaultCatalogName a {@link java.lang.String} object
   * @param workspaceId a long
   */
  public void assign(String metastoreId, String defaultCatalogName, long workspaceId) {
    assign(
        new CreateMetastoreAssignment()
            .setMetastoreId(metastoreId)
            .setDefaultCatalogName(defaultCatalogName)
            .setWorkspaceId(workspaceId));
  }

  /**
   * Create an assignment.
   *
   * <p>Creates a new metastore assignment. If an assignment for the same __workspace_id__ exists,
   * it will be overwritten by the new __metastore_id__ and __default_catalog_name__. The caller
   * must be an account admin.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.CreateMetastoreAssignment} object
   */
  public void assign(CreateMetastoreAssignment request) {
    impl.assign(request);
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param storageRoot a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo create(String name, String storageRoot) {
    return create(new CreateMetastore().setName(name).setStorageRoot(storageRoot));
  }

  /**
   * Create a metastore.
   *
   * <p>Creates a new metastore based on a provided name and storage root path.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.CreateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo create(CreateMetastore request) {
    return impl.create(request);
  }

  /**
   * Get metastore assignment for workspace.
   *
   * <p>Gets the metastore assignment for the workspace being accessed.
   *
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreAssignment} object
   */
  public MetastoreAssignment current() {
    return impl.current();
  }

  /**
   * <p>delete.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void delete(String id) {
    delete(new DeleteMetastoreRequest().setId(id));
  }

  /**
   * Delete a metastore.
   *
   * <p>Deletes a metastore. The caller must be a metastore admin.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.DeleteMetastoreRequest} object
   */
  public void delete(DeleteMetastoreRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo get(String id) {
    return get(new GetMetastoreRequest().setId(id));
  }

  /**
   * Get a metastore.
   *
   * <p>Gets a metastore that matches the supplied ID. The caller must be a metastore admin to
   * retrieve this info.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.GetMetastoreRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo get(GetMetastoreRequest request) {
    return impl.get(request);
  }

  /**
   * List metastores.
   *
   * <p>Gets an array of the available metastores (as __MetastoreInfo__ objects). The caller must be
   * an admin to retrieve this info. There is no guarantee of a specific ordering of the elements in
   * the array.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<MetastoreInfo> list() {
    return impl.list().getMetastores();
  }

  /**
   * <p>maintenance.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @param enable a boolean
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse} object
   */
  public UpdateAutoMaintenanceResponse maintenance(String metastoreId, boolean enable) {
    return maintenance(new UpdateAutoMaintenance().setMetastoreId(metastoreId).setEnable(enable));
  }

  /**
   * Enables or disables auto maintenance on the metastore.
   *
   * <p>Enables or disables auto maintenance on the metastore.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenance} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse} object
   */
  public UpdateAutoMaintenanceResponse maintenance(UpdateAutoMaintenance request) {
    return impl.maintenance(request);
  }

  /**
   * Get a metastore summary.
   *
   * <p>Gets information about a metastore. This summary includes the storage credential, the cloud
   * vendor, the cloud region, and the global metastore ID.
   *
   * @return a {@link com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse} object
   */
  public GetMetastoreSummaryResponse summary() {
    return impl.summary();
  }

  /**
   * <p>unassign.</p>
   *
   * @param workspaceId a long
   * @param metastoreId a {@link java.lang.String} object
   */
  public void unassign(long workspaceId, String metastoreId) {
    unassign(new UnassignRequest().setWorkspaceId(workspaceId).setMetastoreId(metastoreId));
  }

  /**
   * Delete an assignment.
   *
   * <p>Deletes a metastore assignment. The caller must be an account administrator.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UnassignRequest} object
   */
  public void unassign(UnassignRequest request) {
    impl.unassign(request);
  }

  /**
   * <p>update.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo update(String metastoreId, String id) {
    return update(new UpdateMetastore().setMetastoreId(metastoreId).setId(id));
  }

  /**
   * Update a metastore.
   *
   * <p>Updates information for a specific metastore. The caller must be a metastore admin.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo update(UpdateMetastore request) {
    return impl.update(request);
  }

  /**
   * <p>updateAssignment.</p>
   *
   * @param workspaceId a long
   * @param metastoreId a {@link java.lang.String} object
   */
  public void updateAssignment(long workspaceId, String metastoreId) {
    updateAssignment(
        new UpdateMetastoreAssignment().setWorkspaceId(workspaceId).setMetastoreId(metastoreId));
  }

  /**
   * Update an assignment.
   *
   * <p>Updates a metastore assignment. This operation can be used to update __metastore_id__ or
   * __default_catalog_name__ for a specified Workspace, if the Workspace is already assigned a
   * metastore. The caller must be an account admin to update __metastore_id__; otherwise, the
   * caller can be a Workspace admin.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UpdateMetastoreAssignment} object
   */
  public void updateAssignment(UpdateMetastoreAssignment request) {
    impl.updateAssignment(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.MetastoresService} object
   */
  public MetastoresService impl() {
    return impl;
  }
}
