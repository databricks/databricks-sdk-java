// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Disable legacy features for new Databricks workspaces.
 *
 * <p>For newly created workspaces: 1. Disables the use of DBFS root and mounts. 2. Hive Metastore
 * will not be provisioned. 3. Disables the use of ‘No-isolation clusters’. 4. Disables Databricks
 * Runtime versions prior to 13.3LTS.
 */
@Generated
public class DisableLegacyFeaturesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DisableLegacyFeaturesAPI.class);

  private final DisableLegacyFeaturesService impl;

  /** Regular-use constructor */
  public DisableLegacyFeaturesAPI(ApiClient apiClient) {
    impl = new DisableLegacyFeaturesImpl(apiClient);
  }

  /** Constructor for mocks */
  public DisableLegacyFeaturesAPI(DisableLegacyFeaturesService mock) {
    impl = mock;
  }

  /** Deletes the disable legacy features setting. */
  public DeleteDisableLegacyFeaturesResponse delete(DeleteDisableLegacyFeaturesRequest request) {
    return impl.delete(request);
  }

  /** Gets the value of the disable legacy features setting. */
  public DisableLegacyFeatures get(GetDisableLegacyFeaturesRequest request) {
    return impl.get(request);
  }

  public DisableLegacyFeatures update(
      boolean allowMissing, DisableLegacyFeatures setting, String fieldMask) {
    return update(
        new UpdateDisableLegacyFeaturesRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /** Updates the value of the disable legacy features setting. */
  public DisableLegacyFeatures update(UpdateDisableLegacyFeaturesRequest request) {
    return impl.update(request);
  }

  public DisableLegacyFeaturesService impl() {
    return impl;
  }
}
