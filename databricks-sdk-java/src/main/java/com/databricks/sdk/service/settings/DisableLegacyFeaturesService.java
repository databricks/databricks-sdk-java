// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Disable legacy features for new Databricks workspaces.
 *
 * <p>For newly created workspaces: 1. Disables the use of DBFS root and mounts. 2. Hive Metastore
 * will not be provisioned. 3. Disables the use of ‘No-isolation clusters’. 4. Disables Databricks
 * Runtime versions prior to 13.3LTS.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DisableLegacyFeaturesService {
  /**
   * Delete the disable legacy features setting.
   *
   * <p>Deletes the disable legacy features setting.
   */
  DeleteDisableLegacyFeaturesResponse delete(
      DeleteDisableLegacyFeaturesRequest deleteDisableLegacyFeaturesRequest);

  /**
   * Get the disable legacy features setting.
   *
   * <p>Gets the value of the disable legacy features setting.
   */
  DisableLegacyFeatures get(GetDisableLegacyFeaturesRequest getDisableLegacyFeaturesRequest);

  /**
   * Update the disable legacy features setting.
   *
   * <p>Updates the value of the disable legacy features setting.
   */
  DisableLegacyFeatures update(
      UpdateDisableLegacyFeaturesRequest updateDisableLegacyFeaturesRequest);
}
