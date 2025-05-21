// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Disabling legacy DBFS has the following implications:
 *
 * <p>1. Access to DBFS root and DBFS mounts is disallowed (as well as the creation of new mounts).
 * 2. Disables Databricks Runtime versions prior to 13.3LTS.
 *
 * <p>When the setting is off, all DBFS functionality is enabled and no restrictions are imposed on
 * Databricks Runtime versions. This setting can take up to 20 minutes to take effect and requires a
 * manual restart of all-purpose compute clusters and SQL warehouses.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DisableLegacyDbfsService {
  /**
   * Delete the disable legacy DBFS setting.
   *
   * <p>Deletes the disable legacy DBFS setting for a workspace, reverting back to the default.
   */
  DeleteDisableLegacyDbfsResponse delete(
      DeleteDisableLegacyDbfsRequest deleteDisableLegacyDbfsRequest);

  /**
   * Get the disable legacy DBFS setting.
   *
   * <p>Gets the disable legacy DBFS setting.
   */
  DisableLegacyDbfs get(GetDisableLegacyDbfsRequest getDisableLegacyDbfsRequest);

  /**
   * Update the disable legacy DBFS setting.
   *
   * <p>Updates the disable legacy DBFS setting for the workspace.
   */
  DisableLegacyDbfs update(UpdateDisableLegacyDbfsRequest updateDisableLegacyDbfsRequest);
}
