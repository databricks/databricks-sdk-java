// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Wrapper for Account Settings services */
@Generated
public class AccountSettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountSettingsAPI.class);

  private final AccountSettingsService impl;

  /** Regular-use constructor */
  public AccountSettingsAPI(ApiClient apiClient) {
    impl = new AccountSettingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountSettingsAPI(AccountSettingsService mock) {
    impl = mock;
  }

  public AccountSettingsService impl() {
    return impl;
  }
}
