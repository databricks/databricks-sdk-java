// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * 'Disabling legacy access' has the following impacts:
 *
 * <p>1. Disables direct access to the Hive Metastore. However, you can still access Hive Metastore
 * through HMS Federation. 2. Disables Fallback Mode (docs link) on any External Location access
 * from the workspace. 3. Alters DBFS path access to use External Location permissions in place of
 * legacy credentials. 4. Enforces Unity Catalog access on all path based access.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DisableLegacyAccessService {
  /**
   * Delete Legacy Access Disablement Status.
   *
   * <p>Deletes legacy access disablement status.
   */
  DeleteDisableLegacyAccessResponse delete(
      DeleteDisableLegacyAccessRequest deleteDisableLegacyAccessRequest);

  /**
   * Retrieve Legacy Access Disablement Status.
   *
   * <p>Retrieves legacy access disablement Status.
   */
  DisableLegacyAccess get(GetDisableLegacyAccessRequest getDisableLegacyAccessRequest);

  /**
   * Update Legacy Access Disablement Status.
   *
   * <p>Updates legacy access disablement status.
   */
  DisableLegacyAccess update(UpdateDisableLegacyAccessRequest updateDisableLegacyAccessRequest);
}
