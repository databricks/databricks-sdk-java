// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Volumes are a Unity Catalog (UC) capability for accessing, storing, governing, organizing and
 * processing files. Use cases include running machine learning on unstructured data such as image,
 * audio, video, or PDF files, organizing data sets during the data exploration stages in data
 * science, working with libraries that require access to the local file system on cluster machines,
 * storing library and config files of arbitrary formats such as .whl or .txt centrally and
 * providing secure access across workspaces to it, or transforming and querying non-tabular data
 * files in ETL.
 */
@Generated
public class VolumesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(VolumesAPI.class);

  private final VolumesService impl;

  /** Regular-use constructor */
  public VolumesAPI(ApiClient apiClient) {
    impl = new VolumesImpl(apiClient);
  }

  /** Constructor for mocks */
  public VolumesAPI(VolumesService mock) {
    impl = mock;
  }

  /**
   * Creates a new volume.
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
  public VolumeInfo create(CreateVolumeRequestContent request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteVolumeRequest().setName(name));
  }

  /**
   * Deletes a volume from the specified parent catalog and schema.
   *
   * <p>The caller must be a metastore admin or an owner of the volume. For the latter case, the
   * caller must also be the owner or have the **USE_CATALOG** privilege on the parent catalog and
   * the **USE_SCHEMA** privilege on the parent schema.
   */
  public void delete(DeleteVolumeRequest request) {
    impl.delete(request);
  }

  public Iterable<VolumeInfo> list(String catalogName, String schemaName) {
    return list(new ListVolumesRequest().setCatalogName(catalogName).setSchemaName(schemaName));
  }

  /**
   * Gets an array of volumes for the current metastore under the parent catalog and schema.
   *
   * <p>The returned volumes are filtered based on the privileges of the calling user. For example,
   * the metastore admin is able to list all the volumes. A regular user needs to be the owner or
   * have the **READ VOLUME** privilege on the volume to recieve the volumes in the response. For
   * the latter case, the caller must also be the owner or have the **USE_CATALOG** privilege on the
   * parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>There is no guarantee of a specific ordering of the elements in the array.
   */
  public Iterable<VolumeInfo> list(ListVolumesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListVolumesResponseContent::getVolumes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public VolumeInfo read(String name) {
    return read(new ReadVolumeRequest().setName(name));
  }

  /**
   * Gets a volume from the metastore for a specific catalog and schema.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **READ VOLUME** privilege
   * on) the volume. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  public VolumeInfo read(ReadVolumeRequest request) {
    return impl.read(request);
  }

  /**
   * Updates the specified volume under the specified parent catalog and schema.
   *
   * <p>The caller must be a metastore admin or an owner of the volume. For the latter case, the
   * caller must also be the owner or have the **USE_CATALOG** privilege on the parent catalog and
   * the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>Currently only the name, the owner or the comment of the volume could be updated.
   */
  public VolumeInfo update(UpdateVolumeRequestContent request) {
    return impl.update(request);
  }

  public VolumesService impl() {
    return impl;
  }
}
