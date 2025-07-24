// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether automatic cluster update is enabled for the current workspace. By default, it is
 * turned off.
 */
@Generated
public class AutomaticClusterUpdateAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AutomaticClusterUpdateAPI.class);

  private final AutomaticClusterUpdateService impl;

  /** Regular-use constructor */
  public AutomaticClusterUpdateAPI(ApiClient apiClient) {
    impl = new AutomaticClusterUpdateImpl(apiClient);
  }

  /** Constructor for mocks */
  public AutomaticClusterUpdateAPI(AutomaticClusterUpdateService mock) {
    impl = mock;
  }

  /** Gets the automatic cluster update setting. */
  public AutomaticClusterUpdateSetting get(GetAutomaticClusterUpdateSettingRequest request) {
    return impl.get(request);
  }

  /**
   * Updates the automatic cluster update setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  public AutomaticClusterUpdateSetting update(UpdateAutomaticClusterUpdateSettingRequest request) {
    return impl.update(request);
  }

  public AutomaticClusterUpdateService impl() {
    return impl;
  }
}
