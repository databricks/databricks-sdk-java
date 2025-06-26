// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 'Disabling legacy access' has the following impacts:
 *
 * <p>1. Disables direct access to Hive Metastores from the workspace. However, you can still access
 * a Hive Metastore through Hive Metastore federation. 2. Disables fallback mode on external
 * location access from the workspace. 3. Disables Databricks Runtime versions prior to 13.3LTS.
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

  /** Deletes legacy access disablement status. */
  public DeleteDisableLegacyAccessResponse delete(DeleteDisableLegacyAccessRequest request) {
    return impl.delete(request);
  }

  /** Retrieves legacy access disablement Status. */
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

  /** Updates legacy access disablement status. */
  public DisableLegacyAccess update(UpdateDisableLegacyAccessRequest request) {
    return impl.update(request);
  }

  public DisableLegacyAccessService impl() {
    return impl;
  }
}
