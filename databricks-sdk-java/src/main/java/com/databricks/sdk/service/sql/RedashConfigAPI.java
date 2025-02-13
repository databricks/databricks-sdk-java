// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Redash V2 service for workspace configurations (internal) */
@Generated
public class RedashConfigAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RedashConfigAPI.class);

  private final RedashConfigService impl;

  /** Regular-use constructor */
  public RedashConfigAPI(ApiClient apiClient) {
    impl = new RedashConfigImpl(apiClient);
  }

  /** Constructor for mocks */
  public RedashConfigAPI(RedashConfigService mock) {
    impl = mock;
  }

  /** Read workspace configuration for Redash-v2. */
  public ClientConfig getConfig() {
    return impl.getConfig();
  }

  public RedashConfigService impl() {
    return impl;
  }
}
