// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Disabling legacy DBFS has the following implications:
 *
 * <p>1. Access to DBFS root and DBFS mounts is disallowed (as well as the creation of new mounts).
 * 2. Disables Databricks Runtime versions prior to 13.3LTS.
 *
 * <p>When the setting is off, all DBFS functionality is enabled and no restrictions are imposed on
 * Databricks Runtime versions. This setting can take up to 20 minutes to take effect and requires a
 * manual restart of all-purpose compute clusters and SQL warehouses.
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

  /** Deletes the disable legacy DBFS setting for a workspace, reverting back to the default. */
  public DeleteDisableLegacyDbfsResponse delete(DeleteDisableLegacyDbfsRequest request) {
    return impl.delete(request);
  }

  /** Gets the disable legacy DBFS setting. */
  public DisableLegacyDbfs get(GetDisableLegacyDbfsRequest request) {
    return impl.get(request);
  }

  /** Updates the disable legacy DBFS setting for the workspace. */
  public DisableLegacyDbfs update(UpdateDisableLegacyDbfsRequest request) {
    return impl.update(request);
  }

  public DisableLegacyDbfsService impl() {
    return impl;
  }
}
