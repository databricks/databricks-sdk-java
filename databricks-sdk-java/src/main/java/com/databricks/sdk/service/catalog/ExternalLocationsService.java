// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

/**
 * An external location is an object that combines a cloud storage path with a storage credential
 * that authorizes access to the cloud storage path. Each external location is subject to Unity
 * Catalog access-control policies that control which users and groups can access the credential. If
 * a user does not have access to an external location in Unity Catalog, the request fails and Unity
 * Catalog does not attempt to authenticate to your cloud tenant on the user’s behalf.
 *
 * <p>Databricks recommends using external locations rather than using storage credentials directly.
 *
 * <p>To create external locations, you must be a metastore admin or a user with the
 * **CREATE_EXTERNAL_LOCATION** privilege.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface ExternalLocationsService {
  /**
   * Create an external location.
   *
   * <p>Creates a new external location entry in the metastore. The caller must be a metastore admin
   * or have the **CREATE_EXTERNAL_LOCATION** privilege on both the metastore and the associated
   * storage credential.
   *
   * @param createExternalLocation a {@link com.databricks.sdk.service.catalog.CreateExternalLocation} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  ExternalLocationInfo create(CreateExternalLocation createExternalLocation);

  /**
   * Delete an external location.
   *
   * <p>Deletes the specified external location from the metastore. The caller must be the owner of
   * the external location.
   *
   * @param deleteExternalLocationRequest a {@link com.databricks.sdk.service.catalog.DeleteExternalLocationRequest} object
   */
  void delete(DeleteExternalLocationRequest deleteExternalLocationRequest);

  /**
   * Get an external location.
   *
   * <p>Gets an external location from the metastore. The caller must be either a metastore admin,
   * the owner of the external location, or a user that has some privilege on the external location.
   *
   * @param getExternalLocationRequest a {@link com.databricks.sdk.service.catalog.GetExternalLocationRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  ExternalLocationInfo get(GetExternalLocationRequest getExternalLocationRequest);

  /**
   * List external locations.
   *
   * <p>Gets an array of external locations (__ExternalLocationInfo__ objects) from the metastore.
   * The caller must be a metastore admin, the owner of the external location, or a user that has
   * some privilege on the external location. There is no guarantee of a specific ordering of the
   * elements in the array.
   *
   * @return a {@link com.databricks.sdk.service.catalog.ListExternalLocationsResponse} object
   */
  ListExternalLocationsResponse list();

  /**
   * Update an external location.
   *
   * <p>Updates an external location in the metastore. The caller must be the owner of the external
   * location, or be a metastore admin. In the second case, the admin can only update the name of
   * the external location.
   *
   * @param updateExternalLocation a {@link com.databricks.sdk.service.catalog.UpdateExternalLocation} object
   * @return a {@link com.databricks.sdk.service.catalog.ExternalLocationInfo} object
   */
  ExternalLocationInfo update(UpdateExternalLocation updateExternalLocation);
}
