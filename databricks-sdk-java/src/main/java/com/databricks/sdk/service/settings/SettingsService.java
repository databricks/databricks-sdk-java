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
public interface SettingsService {
  /**
   * Delete the default namespace setting.
   *
   * <p>Deletes the default namespace setting for the workspace. A fresh etag needs to be provided
   * in `DELETE` requests (as a query parameter). The etag can be retrieved by making a `GET`
   * request before the `DELETE` request. If the setting is updated/deleted concurrently, `DELETE`
   * fails with 409 and the request must be retried by using the fresh etag in the 409 response.
   */
  DeleteDefaultNamespaceSettingResponse deleteDefaultNamespaceSetting(
      DeleteDefaultNamespaceSettingRequest deleteDefaultNamespaceSettingRequest);

  /**
   * Delete the restrict workspace admins setting.
   *
   * <p>Reverts the restrict workspace admins setting status for the workspace. A fresh etag needs
   * to be provided in `DELETE` requests (as a query parameter). The etag can be retrieved by making
   * a `GET` request before the DELETE request. If the setting is updated/deleted concurrently,
   * `DELETE` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  DeleteRestrictWorkspaceAdminsSettingResponse deleteRestrictWorkspaceAdminsSetting(
      DeleteRestrictWorkspaceAdminsSettingRequest deleteRestrictWorkspaceAdminsSettingRequest);

  /**
   * Get the automatic cluster update setting.
   *
   * <p>Gets the automatic cluster update setting.
   */
  AutomaticClusterUpdateSetting getAutomaticClusterUpdateSetting(
      GetAutomaticClusterUpdateSettingRequest getAutomaticClusterUpdateSettingRequest);

  /**
   * Get the compliance security profile setting.
   *
   * <p>Gets the compliance security profile setting.
   */
  CspEnablementSetting getCspEnablementSetting(
      GetCspEnablementSettingRequest getCspEnablementSettingRequest);

  /**
   * Get the default namespace setting.
   *
   * <p>Gets the default namespace setting.
   */
  DefaultNamespaceSetting getDefaultNamespaceSetting(
      GetDefaultNamespaceSettingRequest getDefaultNamespaceSettingRequest);

  /**
   * Get the enhanced security monitoring setting.
   *
   * <p>Gets the enhanced security monitoring setting.
   */
  EsmEnablementSetting getEsmEnablementSetting(
      GetEsmEnablementSettingRequest getEsmEnablementSettingRequest);

  /**
   * Get the restrict workspace admins setting.
   *
   * <p>Gets the restrict workspace admins setting.
   */
  RestrictWorkspaceAdminsSetting getRestrictWorkspaceAdminsSetting(
      GetRestrictWorkspaceAdminsSettingRequest getRestrictWorkspaceAdminsSettingRequest);

  /**
   * Update the automatic cluster update setting.
   *
   * <p>Updates the automatic cluster update setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  AutomaticClusterUpdateSetting updateAutomaticClusterUpdateSetting(
      UpdateAutomaticClusterUpdateSettingRequest updateAutomaticClusterUpdateSettingRequest);

  /**
   * Update the compliance security profile setting.
   *
   * <p>Updates the compliance security profile setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  CspEnablementSetting updateCspEnablementSetting(
      UpdateCspEnablementSettingRequest updateCspEnablementSettingRequest);

  /**
   * Update the default namespace setting.
   *
   * <p>Updates the default namespace setting for the workspace. A fresh etag needs to be provided
   * in `PATCH` requests (as part of the setting field). The etag can be retrieved by making a `GET`
   * request before the `PATCH` request. Note that if the setting does not exist, `GET` returns a
   * NOT_FOUND error and the etag is present in the error response, which should be set in the
   * `PATCH` request. If the setting is updated concurrently, `PATCH` fails with 409 and the request
   * must be retried by using the fresh etag in the 409 response.
   */
  DefaultNamespaceSetting updateDefaultNamespaceSetting(
      UpdateDefaultNamespaceSettingRequest updateDefaultNamespaceSettingRequest);

  /**
   * Update the enhanced security monitoring setting.
   *
   * <p>Updates the enhanced security monitoring setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  EsmEnablementSetting updateEsmEnablementSetting(
      UpdateEsmEnablementSettingRequest updateEsmEnablementSettingRequest);

  /**
   * Update the restrict workspace admins setting.
   *
   * <p>Updates the restrict workspace admins setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a GET request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  RestrictWorkspaceAdminsSetting updateRestrictWorkspaceAdminsSetting(
      UpdateRestrictWorkspaceAdminsSettingRequest updateRestrictWorkspaceAdminsSettingRequest);
}
