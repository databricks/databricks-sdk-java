// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

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
 */
@Generated
public interface MetastoresService {
  /**
   * Creates a new metastore assignment. If an assignment for the same __workspace_id__ exists, it
   * will be overwritten by the new __metastore_id__ and __default_catalog_name__. The caller must
   * be an account admin.
   */
  void assign(CreateMetastoreAssignment createMetastoreAssignment);

  /**
   * Creates a new metastore based on a provided name and optional storage root path. By default (if
   * the __owner__ field is not set), the owner of the new metastore is the user calling the
   * __createMetastore__ API. If the __owner__ field is set to the empty string (**""**), the
   * ownership is assigned to the System User instead.
   */
  MetastoreInfo create(CreateMetastore createMetastore);

  /** Gets the metastore assignment for the workspace being accessed. */
  MetastoreAssignment current();

  /** Deletes a metastore. The caller must be a metastore admin. */
  void delete(DeleteMetastoreRequest deleteMetastoreRequest);

  /**
   * Gets a metastore that matches the supplied ID. The caller must be a metastore admin to retrieve
   * this info.
   */
  MetastoreInfo get(GetMetastoreRequest getMetastoreRequest);

  /**
   * Gets an array of the available metastores (as __MetastoreInfo__ objects). The caller must be an
   * admin to retrieve this info. There is no guarantee of a specific ordering of the elements in
   * the array.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results >= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached. This behavior follows Google AIP-158 guidelines.
   */
  ListMetastoresResponse list(ListMetastoresRequest listMetastoresRequest);

  /**
   * Gets information about a metastore. This summary includes the storage credential, the cloud
   * vendor, the cloud region, and the global metastore ID.
   */
  GetMetastoreSummaryResponse summary();

  /** Deletes a metastore assignment. The caller must be an account administrator. */
  void unassign(UnassignRequest unassignRequest);

  /**
   * Updates information for a specific metastore. The caller must be a metastore admin. If the
   * __owner__ field is set to the empty string (**""**), the ownership is updated to the System
   * User.
   */
  MetastoreInfo update(UpdateMetastore updateMetastore);

  /**
   * Updates a metastore assignment. This operation can be used to update __metastore_id__ or
   * __default_catalog_name__ for a specified Workspace, if the Workspace is already assigned a
   * metastore. The caller must be an account admin to update __metastore_id__; otherwise, the
   * caller can be a Workspace admin.
   */
  void updateAssignment(UpdateMetastoreAssignment updateMetastoreAssignment);
}
