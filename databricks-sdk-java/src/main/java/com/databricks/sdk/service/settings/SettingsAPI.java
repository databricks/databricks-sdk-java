// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The default namespace setting API allows users to configure the default namespace for a
 * Databricks workspace.
 *
 * <p>Through this API, users can retrieve, set, or modify the default namespace used when queries
 * do not reference a fully qualified three-level name. For example, if you use the API to set
 * 'retail_prod' as the default catalog, then a query 'SELECT * FROM myTable' would reference the
 * object 'retail_prod.default.myTable' (the schema 'default' is always assumed).
 *
 * <p>This setting requires a restart of clusters and SQL warehouses to take effect. Additionally,
 * the default namespace only applies when using Unity Catalog-enabled compute.
 */
@Generated
public class SettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SettingsAPI.class);

  private final SettingsService impl;

  /** Regular-use constructor */
  public SettingsAPI(ApiClient apiClient) {
    impl = new SettingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SettingsAPI(SettingsService mock) {
    impl = mock;
  }

  public DeleteDefaultWorkspaceNamespaceResponse deleteDefaultWorkspaceNamespace(String etag) {
    return deleteDefaultWorkspaceNamespace(
        new DeleteDefaultWorkspaceNamespaceRequest().setEtag(etag));
  }

  /**
   * Delete the default namespace setting.
   *
   * <p>Deletes the default namespace setting for the workspace. A fresh etag needs to be provided
   * in DELETE requests (as a query parameter). The etag can be retrieved by making a GET request
   * before the DELETE request. If the setting is updated/deleted concurrently, DELETE will fail
   * with 409 and the request will need to be retried by using the fresh etag in the 409 response.
   */
  public DeleteDefaultWorkspaceNamespaceResponse deleteDefaultWorkspaceNamespace(
      DeleteDefaultWorkspaceNamespaceRequest request) {
    return impl.deleteDefaultWorkspaceNamespace(request);
  }

  public DefaultNamespaceSetting readDefaultWorkspaceNamespace(String etag) {
    return readDefaultWorkspaceNamespace(new ReadDefaultWorkspaceNamespaceRequest().setEtag(etag));
  }

  /**
   * Get the default namespace setting.
   *
   * <p>Gets the default namespace setting.
   */
  public DefaultNamespaceSetting readDefaultWorkspaceNamespace(
      ReadDefaultWorkspaceNamespaceRequest request) {
    return impl.readDefaultWorkspaceNamespace(request);
  }

  /**
   * Update the default namespace setting.
   *
   * <p>Updates the default namespace setting for the workspace. A fresh etag needs to be provided
   * in PATCH requests (as part of the setting field). The etag can be retrieved by making a GET
   * request before the PATCH request. Note that if the setting does not exist, GET will return a
   * NOT_FOUND error and the etag will be present in the error response, which should be set in the
   * PATCH request. If the setting is updated concurrently, PATCH will fail with 409 and the request
   * will need to be retried by using the fresh etag in the 409 response.
   */
  public DefaultNamespaceSetting updateDefaultWorkspaceNamespace(
      UpdateDefaultWorkspaceNamespaceRequest request) {
    return impl.updateDefaultWorkspaceNamespace(request);
  }

  public SettingsService impl() {
    return impl;
  }
}
