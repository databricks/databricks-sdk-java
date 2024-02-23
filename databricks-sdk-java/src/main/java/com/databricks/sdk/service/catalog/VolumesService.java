// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Volumes are a Unity Catalog (UC) capability for accessing, storing, governing, organizing and
 * processing files. Use cases include running machine learning on unstructured data such as image,
 * audio, video, or PDF files, organizing data sets during the data exploration stages in data
 * science, working with libraries that require access to the local file system on cluster machines,
 * storing library and config files of arbitrary formats such as .whl or .txt centrally and
 * providing secure access across workspaces to it, or transforming and querying non-tabular data
 * files in ETL.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface VolumesService {
  /**
   * Create a Volume.
   *
   * <p>Creates a new volume.
   *
   * <p>The user could create either an external volume or a managed volume. An external volume will
   * be created in the specified external location, while a managed volume will be located in the
   * default location which is specified by the parent schema, or the parent catalog, or the
   * Metastore.
   *
   * <p>For the volume creation to succeed, the user must satisfy following conditions: - The caller
   * must be a metastore admin, or be the owner of the parent catalog and schema, or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema. - The caller must have **CREATE VOLUME** privilege on the parent schema.
   *
   * <p>For an external volume, following conditions also need to satisfy - The caller must have
   * **CREATE EXTERNAL VOLUME** privilege on the external location. - There are no other tables, nor
   * volumes existing in the specified storage location. - The specified storage location is not
   * under the location of other tables, nor volumes, or catalogs or schemas.
   */
  VolumeInfo create(CreateVolumeRequestContent createVolumeRequestContent);

  /**
   * Delete a Volume.
   *
   * <p>Deletes a volume from the specified parent catalog and schema.
   *
   * <p>The caller must be a metastore admin or an owner of the volume. For the latter case, the
   * caller must also be the owner or have the **USE_CATALOG** privilege on the parent catalog and
   * the **USE_SCHEMA** privilege on the parent schema.
   */
  void delete(DeleteVolumeRequest deleteVolumeRequest);

  /**
   * List Volumes.
   *
   * <p>Gets an array of volumes for the current metastore under the parent catalog and schema.
   *
   * <p>The returned volumes are filtered based on the privileges of the calling user. For example,
   * the metastore admin is able to list all the volumes. A regular user needs to be the owner or
   * have the **READ VOLUME** privilege on the volume to recieve the volumes in the response. For
   * the latter case, the caller must also be the owner or have the **USE_CATALOG** privilege on the
   * parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>There is no guarantee of a specific ordering of the elements in the array.
   */
  ListVolumesResponseContent list(ListVolumesRequest listVolumesRequest);

  /**
   * Get a Volume.
   *
   * <p>Gets a volume from the metastore for a specific catalog and schema.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **READ VOLUME** privilege
   * on) the volume. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  VolumeInfo read(ReadVolumeRequest readVolumeRequest);

  /**
   * Update a Volume.
   *
   * <p>Updates the specified volume under the specified parent catalog and schema.
   *
   * <p>The caller must be a metastore admin or an owner of the volume. For the latter case, the
   * caller must also be the owner or have the **USE_CATALOG** privilege on the parent catalog and
   * the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>Currently only the name, the owner or the comment of the volume could be updated.
   */
  VolumeInfo update(UpdateVolumeRequestContent updateVolumeRequestContent);
}
