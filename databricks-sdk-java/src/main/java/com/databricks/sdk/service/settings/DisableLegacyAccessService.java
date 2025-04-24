// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * 'Disabling legacy access' has the following impacts:
 *
 * <p>1. Disables direct access to Hive Metastores from the workspace. However, you can still access
 * a Hive Metastore through Hive Metastore federation. 2. Disables fallback mode on external
 * location access from the workspace. 3. Disables Databricks Runtime versions prior to 13.3LTS.
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
