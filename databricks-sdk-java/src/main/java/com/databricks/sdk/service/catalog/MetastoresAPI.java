// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
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
 */
@Generated
public class MetastoresAPI {
  private static final Logger LOG = LoggerFactory.getLogger(MetastoresAPI.class);

  private final MetastoresService impl;

  /** Regular-use constructor */
  public MetastoresAPI(ApiClient apiClient) {
    impl = new MetastoresImpl(apiClient);
  }

  /** Constructor for mocks */
  public MetastoresAPI(MetastoresService mock) {
    impl = mock;
  }

  /**
   * Creates a new metastore assignment. If an assignment for the same __workspace_id__ exists, it
   * will be overwritten by the new __metastore_id__ and __default_catalog_name__. The caller must
   * be an account admin.
   */
  public void assign(CreateMetastoreAssignment request) {
    impl.assign(request);
  }

  /**
   * Creates a new metastore based on a provided name and optional storage root path. By default (if
   * the __owner__ field is not set), the owner of the new metastore is the user calling the
   * __createMetastore__ API. If the __owner__ field is set to the empty string (**""**), the
   * ownership is assigned to the System User instead.
   */
  public MetastoreInfo create(CreateMetastore request) {
    return impl.create(request);
  }

  /** Gets the metastore assignment for the workspace being accessed. */
  public MetastoreAssignment current() {
    return impl.current();
  }

  public void delete(String id) {
    delete(new DeleteMetastoreRequest().setId(id));
  }

  /** Deletes a metastore. The caller must be a metastore admin. */
  public void delete(DeleteMetastoreRequest request) {
    impl.delete(request);
  }

  public MetastoreInfo get(String id) {
    return get(new GetMetastoreRequest().setId(id));
  }

  /**
   * Gets a metastore that matches the supplied ID. The caller must be a metastore admin to retrieve
   * this info.
   */
  public MetastoreInfo get(GetMetastoreRequest request) {
    return impl.get(request);
  }

  /**
   * Gets an array of the available metastores (as __MetastoreInfo__ objects). The caller must be an
   * admin to retrieve this info. There is no guarantee of a specific ordering of the elements in
   * the array.
   */
  public Iterable<MetastoreInfo> list(ListMetastoresRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListMetastoresResponse::getMetastores,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Gets information about a metastore. This summary includes the storage credential, the cloud
   * vendor, the cloud region, and the global metastore ID.
   */
  public GetMetastoreSummaryResponse summary() {
    return impl.summary();
  }

  public void unassign(long workspaceId) {
    unassign(new UnassignRequest().setWorkspaceId(workspaceId));
  }

  /** Deletes a metastore assignment. The caller must be an account administrator. */
  public void unassign(UnassignRequest request) {
    impl.unassign(request);
  }

  /**
   * Updates information for a specific metastore. The caller must be a metastore admin. If the
   * __owner__ field is set to the empty string (**""**), the ownership is updated to the System
   * User.
   */
  public MetastoreInfo update(UpdateMetastore request) {
    return impl.update(request);
  }

  /**
   * Updates a metastore assignment. This operation can be used to update __metastore_id__ or
   * __default_catalog_name__ for a specified Workspace, if the Workspace is already assigned a
   * metastore. The caller must be an account admin to update __metastore_id__; otherwise, the
   * caller can be a Workspace admin.
   */
  public void updateAssignment(UpdateMetastoreAssignment request) {
    impl.updateAssignment(request);
  }

  public MetastoresService impl() {
    return impl;
  }
}
