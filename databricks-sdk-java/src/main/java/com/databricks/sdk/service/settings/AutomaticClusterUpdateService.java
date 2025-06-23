// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether automatic cluster update is enabled for the current workspace. By default, it is
 * turned off.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AutomaticClusterUpdateService {
  /** Gets the automatic cluster update setting. */
  AutomaticClusterUpdateSetting get(
      GetAutomaticClusterUpdateSettingRequest getAutomaticClusterUpdateSettingRequest);

  /**
   * Updates the automatic cluster update setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  AutomaticClusterUpdateSetting update(
      UpdateAutomaticClusterUpdateSettingRequest updateAutomaticClusterUpdateSettingRequest);
}
