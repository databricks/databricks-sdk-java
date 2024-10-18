// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * When this setting is on, access to DBFS root and DBFS mounts is disallowed (as well as creation
 * of new mounts). When the setting is off, all DBFS functionality is enabled
 */
@Generated
public class DisableLegacyDbfsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DisableLegacyDbfsAPI.class);

  private final DisableLegacyDbfsService impl;

  /** Regular-use constructor */
  public DisableLegacyDbfsAPI(ApiClient apiClient) {
    impl = new DisableLegacyDbfsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DisableLegacyDbfsAPI(DisableLegacyDbfsService mock) {
    impl = mock;
  }

  /**
   * Delete the disable legacy DBFS setting.
   *
   * <p>Deletes the disable legacy DBFS setting for a workspace, reverting back to the default.
   */
  public DeleteDisableLegacyDbfsResponse delete(DeleteDisableLegacyDbfsRequest request) {
    return impl.delete(request);
  }

  /**
   * Get the disable legacy DBFS setting.
   *
   * <p>Gets the disable legacy DBFS setting.
   */
  public DisableLegacyDbfs get(GetDisableLegacyDbfsRequest request) {
    return impl.get(request);
  }

  public DisableLegacyDbfs update(
      boolean allowMissing, DisableLegacyDbfs setting, String fieldMask) {
    return update(
        new UpdateDisableLegacyDbfsRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the disable legacy DBFS setting.
   *
   * <p>Updates the disable legacy DBFS setting for the workspace.
   */
  public DisableLegacyDbfs update(UpdateDisableLegacyDbfsRequest request) {
    return impl.update(request);
  }

  public DisableLegacyDbfsService impl() {
    return impl;
  }
}
