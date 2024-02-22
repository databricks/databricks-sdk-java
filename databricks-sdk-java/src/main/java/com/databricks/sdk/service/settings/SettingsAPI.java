// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Wrapper for Workspace Settings services */
@Generated
public class SettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SettingsAPI.class);

  private final SettingsService impl;

  /** Regular-use constructor */
  public SettingsAPI(ApiClient apiClient) {
    impl = new SettingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SettingsAPI(SettingsService mock) {
    impl = mock;
  }

  public SettingsService impl() {
    return impl;
  }
}
