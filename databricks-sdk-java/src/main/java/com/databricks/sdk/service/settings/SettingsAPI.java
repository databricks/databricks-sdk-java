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

  /**
   * Delete the default namespace setting.
   *
   * <p>Deletes the default namespace setting for the workspace. A fresh etag needs to be provided
   * in DELETE requests (as a query parameter). The etag can be retrieved by making a GET request
   * before the DELETE request. If the setting is updated/deleted concurrently, DELETE will fail
   * with 409 and the request will need to be retried by using the fresh etag in the 409 response.
   */
  public DeleteDefaultNamespaceSettingResponse deleteDefaultNamespaceSetting(
      DeleteDefaultNamespaceSettingRequest request) {
    return impl.deleteDefaultNamespaceSetting(request);
  }

  /**
   * Delete the restrict workspace admins setting.
   *
   * <p>Reverts the restrict workspace admins setting status for the workspace. A fresh etag needs
   * to be provided in DELETE requests (as a query parameter). The etag can be retrieved by making a
   * GET request before the DELETE request. If the setting is updated/deleted concurrently, DELETE
   * will fail with 409 and the request will need to be retried by using the fresh etag in the 409
   * response.
   */
  public DeleteRestrictWorkspaceAdminsSettingResponse deleteRestrictWorkspaceAdminsSetting(
      DeleteRestrictWorkspaceAdminsSettingRequest request) {
    return impl.deleteRestrictWorkspaceAdminsSetting(request);
  }

  /**
   * Get the default namespace setting.
   *
   * <p>Gets the default namespace setting.
   */
  public DefaultNamespaceSetting getDefaultNamespaceSetting(
      GetDefaultNamespaceSettingRequest request) {
    return impl.getDefaultNamespaceSetting(request);
  }

  /**
   * Get the restrict workspace admins setting.
   *
   * <p>Gets the restrict workspace admins setting.
   */
  public RestrictWorkspaceAdminsSetting getRestrictWorkspaceAdminsSetting(
      GetRestrictWorkspaceAdminsSettingRequest request) {
    return impl.getRestrictWorkspaceAdminsSetting(request);
  }

  public DefaultNamespaceSetting updateDefaultNamespaceSetting(
      boolean allowMissing, DefaultNamespaceSetting setting, String fieldMask) {
    return updateDefaultNamespaceSetting(
        new UpdateDefaultNamespaceSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
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
  public DefaultNamespaceSetting updateDefaultNamespaceSetting(
      UpdateDefaultNamespaceSettingRequest request) {
    return impl.updateDefaultNamespaceSetting(request);
  }

  public RestrictWorkspaceAdminsSetting updateRestrictWorkspaceAdminsSetting(
      boolean allowMissing, RestrictWorkspaceAdminsSetting setting, String fieldMask) {
    return updateRestrictWorkspaceAdminsSetting(
        new UpdateRestrictWorkspaceAdminsSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the restrict workspace admins setting.
   *
   * <p>Updates the restrict workspace admins setting for the workspace. A fresh etag needs to be
   * provided in PATCH requests (as part of the setting field). The etag can be retrieved by making
   * a GET request before the PATCH request. If the setting is updated concurrently, PATCH will fail
   * with 409 and the request will need to be retried by using the fresh etag in the 409 response.
   */
  public RestrictWorkspaceAdminsSetting updateRestrictWorkspaceAdminsSetting(
      UpdateRestrictWorkspaceAdminsSettingRequest request) {
    return impl.updateRestrictWorkspaceAdminsSetting(request);
  }

  public SettingsService impl() {
    return impl;
  }
}
