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
public class DefaultNamespaceAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultNamespaceAPI.class);

  private final DefaultNamespaceService impl;

  /** Regular-use constructor */
  public DefaultNamespaceAPI(ApiClient apiClient) {
    impl = new DefaultNamespaceImpl(apiClient);
  }

  /** Constructor for mocks */
  public DefaultNamespaceAPI(DefaultNamespaceService mock) {
    impl = mock;
  }

  /**
   * Deletes the default namespace setting for the workspace. A fresh etag needs to be provided in
   * `DELETE` requests (as a query parameter). The etag can be retrieved by making a `GET` request
   * before the `DELETE` request. If the setting is updated/deleted concurrently, `DELETE` fails
   * with 409 and the request must be retried by using the fresh etag in the 409 response.
   */
  public DeleteDefaultNamespaceSettingResponse delete(
      DeleteDefaultNamespaceSettingRequest request) {
    return impl.delete(request);
  }

  /** Gets the default namespace setting. */
  public DefaultNamespaceSetting get(GetDefaultNamespaceSettingRequest request) {
    return impl.get(request);
  }

  public DefaultNamespaceSetting update(
      boolean allowMissing, DefaultNamespaceSetting setting, String fieldMask) {
    return update(
        new UpdateDefaultNamespaceSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Updates the default namespace setting for the workspace. A fresh etag needs to be provided in
   * `PATCH` requests (as part of the setting field). The etag can be retrieved by making a `GET`
   * request before the `PATCH` request. Note that if the setting does not exist, `GET` returns a
   * NOT_FOUND error and the etag is present in the error response, which should be set in the
   * `PATCH` request. If the setting is updated concurrently, `PATCH` fails with 409 and the request
   * must be retried by using the fresh etag in the 409 response.
   */
  public DefaultNamespaceSetting update(UpdateDefaultNamespaceSettingRequest request) {
    return impl.update(request);
  }

  public DefaultNamespaceService impl() {
    return impl;
  }
}
