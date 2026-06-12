// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Disable legacy features for new Databricks workspaces.
 *
 * <p>For newly created workspaces:
 *
 * <ol>
 *   <li>Disables the use of DBFS root and mounts.
 *   <li>Hive Metastore will not be provisioned.
 *   <li>Disables the use of ‘No-isolation clusters’.
 *   <li>Disables Databricks Runtime versions prior to 13.3LTS.
 * </ol>
 *
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DisableLegacyFeaturesService {
  /** Deletes the disable legacy features setting. */
  DeleteDisableLegacyFeaturesResponse delete(
      DeleteDisableLegacyFeaturesRequest deleteDisableLegacyFeaturesRequest);

  /** Gets the value of the disable legacy features setting. */
  DisableLegacyFeatures get(GetDisableLegacyFeaturesRequest getDisableLegacyFeaturesRequest);

  /** Updates the value of the disable legacy features setting. */
  DisableLegacyFeatures update(
      UpdateDisableLegacyFeaturesRequest updateDisableLegacyFeaturesRequest);
}
