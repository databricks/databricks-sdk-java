// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

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
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DefaultNamespaceService {
  /**
   * Delete the default namespace setting.
   *
   * <p>Deletes the default namespace setting for the workspace. A fresh etag needs to be provided
   * in DELETE requests (as a query parameter). The etag can be retrieved by making a GET request
   * before the DELETE request. If the setting is updated/deleted concurrently, DELETE will fail
   * with 409 and the request will need to be retried by using the fresh etag in the 409 response.
   */
  DeleteDefaultNamespaceSettingResponse deleteDefaultNamespaceSetting(
      DeleteDefaultNamespaceSettingRequest deleteDefaultNamespaceSettingRequest);

  /**
   * Get the default namespace setting.
   *
   * <p>Gets the default namespace setting.
   */
  DefaultNamespaceSetting getDefaultNamespaceSetting(
      GetDefaultNamespaceSettingRequest getDefaultNamespaceSettingRequest);

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
  DefaultNamespaceSetting updateDefaultNamespaceSetting(
      UpdateDefaultNamespaceSettingRequest updateDefaultNamespaceSettingRequest);
}
