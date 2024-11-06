// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 'Disabling legacy access' has the following impacts:
 *
 * <p>1. Disables direct access to the Hive Metastore. However, you can still access Hive Metastore
 * through HMS Federation. 2. Disables Fallback Mode (docs link) on any External Location access
 * from the workspace. 3. Alters DBFS path access to use External Location permissions in place of
 * legacy credentials. 4. Enforces Unity Catalog access on all path based access.
 */
@Generated
public class DisableLegacyAccessAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DisableLegacyAccessAPI.class);

  private final DisableLegacyAccessService impl;

  /** Regular-use constructor */
  public DisableLegacyAccessAPI(ApiClient apiClient) {
    impl = new DisableLegacyAccessImpl(apiClient);
  }

  /** Constructor for mocks */
  public DisableLegacyAccessAPI(DisableLegacyAccessService mock) {
    impl = mock;
  }

  /**
   * Delete Legacy Access Disablement Status.
   *
   * <p>Deletes legacy access disablement status.
   */
  public DeleteDisableLegacyAccessResponse delete(DeleteDisableLegacyAccessRequest request) {
    return impl.delete(request);
  }

  /**
   * Retrieve Legacy Access Disablement Status.
   *
   * <p>Retrieves legacy access disablement Status.
   */
  public DisableLegacyAccess get(GetDisableLegacyAccessRequest request) {
    return impl.get(request);
  }

  public DisableLegacyAccess update(
      boolean allowMissing, DisableLegacyAccess setting, String fieldMask) {
    return update(
        new UpdateDisableLegacyAccessRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update Legacy Access Disablement Status.
   *
   * <p>Updates legacy access disablement status.
   */
  public DisableLegacyAccess update(UpdateDisableLegacyAccessRequest request) {
    return impl.update(request);
  }

  public DisableLegacyAccessService impl() {
    return impl;
  }
}
