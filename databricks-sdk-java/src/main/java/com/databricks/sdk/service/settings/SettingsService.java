// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * // TODO(yuyuan.tang) to add the description for the setting
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SettingsService {
  /**
   * Delete the default namespace.
   *
   * <p>Deletes the default namespace.
   */
  DeleteDefaultWorkspaceNamespaceResponse deleteDefaultWorkspaceNamespace(
      DeleteDefaultWorkspaceNamespaceRequest deleteDefaultWorkspaceNamespaceRequest);

  /**
   * Get the default namespace.
   *
   * <p>Gets the default namespace.
   */
  DefaultNamespaceSetting readDefaultWorkspaceNamespace(
      ReadDefaultWorkspaceNamespaceRequest readDefaultWorkspaceNamespaceRequest);

  /**
   * Updates the default namespace setting.
   *
   * <p>Updates the default namespace setting for the workspace. A fresh etag needs to be provided
   * in PATCH requests (as part the setting field). The etag can be retrieved by making a GET
   * request before the PATCH request. Note that if the setting does not exist, GET will return a
   * NOT_FOUND error and the etag will be present in the error response, which should be set in the
   * PATCH request.
   */
  DefaultNamespaceSetting updateDefaultWorkspaceNamespace(
      UpdateDefaultWorkspaceNamespaceRequest updateDefaultWorkspaceNamespaceRequest);
}
