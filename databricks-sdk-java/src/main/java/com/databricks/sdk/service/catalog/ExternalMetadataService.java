// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * External Metadata objects enable customers to register and manage metadata about external systems
 * within Unity Catalog.
 *
 * <p>These APIs provide a standardized way to create, update, retrieve, list, and delete external
 * metadata objects. Fine-grained authorization ensures that only users with appropriate permissions
 * can view and manage external metadata objects.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ExternalMetadataService {
  /**
   * Creates a new external metadata object in the parent metastore if the caller is a metastore
   * admin or has the **CREATE_EXTERNAL_METADATA** privilege. Grants **BROWSE** to all account users
   * upon creation by default.
   */
  ExternalMetadata createExternalMetadata(
      CreateExternalMetadataRequest createExternalMetadataRequest);

  /**
   * Deletes the external metadata object that matches the supplied name. The caller must be a
   * metastore admin, the owner of the external metadata object, or a user that has the **MANAGE**
   * privilege.
   */
  void deleteExternalMetadata(DeleteExternalMetadataRequest deleteExternalMetadataRequest);

  /**
   * Gets the specified external metadata object in a metastore. The caller must be a metastore
   * admin, the owner of the external metadata object, or a user that has the **BROWSE** privilege.
   */
  ExternalMetadata getExternalMetadata(GetExternalMetadataRequest getExternalMetadataRequest);

  /**
   * Gets an array of external metadata objects in the metastore. If the caller is the metastore
   * admin, all external metadata objects will be retrieved. Otherwise, only external metadata
   * objects that the caller has **BROWSE** on will be retrieved. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  ListExternalMetadataResponse listExternalMetadata(
      ListExternalMetadataRequest listExternalMetadataRequest);

  /**
   * Updates the external metadata object that matches the supplied name. The caller can only update
   * either the owner or other metadata fields in one request. The caller must be a metastore admin,
   * the owner of the external metadata object, or a user that has the **MODIFY** privilege. If the
   * caller is updating the owner, they must also have the **MANAGE** privilege.
   */
  ExternalMetadata updateExternalMetadata(
      UpdateExternalMetadataRequest updateExternalMetadataRequest);
}
