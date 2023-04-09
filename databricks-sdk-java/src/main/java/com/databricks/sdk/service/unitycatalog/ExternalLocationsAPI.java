// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

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
 */
public class ExternalLocationsAPI {
  private final ExternalLocationsService impl;

  /** Regular-use constructor */
  public ExternalLocationsAPI(ApiClient apiClient) {
    impl = new ExternalLocationsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ExternalLocationsAPI(ExternalLocationsService mock) {
    impl = mock;
  }

  public ExternalLocationInfo create(String name, String url, String credentialName) {
    return create(
        new CreateExternalLocation().setName(name).setUrl(url).setCredentialName(credentialName));
  }

  /**
   * Create an external location.
   *
   * <p>Creates a new external location entry in the metastore. The caller must be a metastore admin
   * or have the **CREATE_EXTERNAL_LOCATION** privilege on both the metastore and the associated
   * storage credential.
   */
  public ExternalLocationInfo create(CreateExternalLocation request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteExternalLocationRequest().setName(name));
  }

  /**
   * Delete an external location.
   *
   * <p>Deletes the specified external location from the metastore. The caller must be the owner of
   * the external location.
   */
  public void delete(DeleteExternalLocationRequest request) {
    impl.delete(request);
  }

  public ExternalLocationInfo get(String name) {
    return get(new GetExternalLocationRequest().setName(name));
  }

  /**
   * Get an external location.
   *
   * <p>Gets an external location from the metastore. The caller must be either a metastore admin,
   * the owner of the external location, or a user that has some privilege on the external location.
   */
  public ExternalLocationInfo get(GetExternalLocationRequest request) {
    return impl.get(request);
  }

  /**
   * List external locations.
   *
   * <p>Gets an array of external locations (__ExternalLocationInfo__ objects) from the metastore.
   * The caller must be a metastore admin, the owner of the external location, or a user that has
   * some privilege on the external location. There is no guarantee of a specific ordering of the
   * elements in the array.
   */
  public ListExternalLocationsResponse list() {
    return impl.list();
  }

  public ExternalLocationInfo update(String name) {
    return update(new UpdateExternalLocation().setName(name));
  }

  /**
   * Update an external location.
   *
   * <p>Updates an external location in the metastore. The caller must be the owner of the external
   * location, or be a metastore admin. In the second case, the admin can only update the name of
   * the external location.
   */
  public ExternalLocationInfo update(UpdateExternalLocation request) {
    return impl.update(request);
  }

  public ExternalLocationsService impl() {
    return impl;
  }
}
