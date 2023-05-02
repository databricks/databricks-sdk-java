// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This API allows retrieving information about currently authenticated user or service principal.
 */
@Generated
public class CurrentUserAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CurrentUserAPI.class);

  private final CurrentUserService impl;

  /** Regular-use constructor */
  public CurrentUserAPI(ApiClient apiClient) {
    impl = new CurrentUserImpl(apiClient);
  }

  /** Constructor for mocks */
  public CurrentUserAPI(CurrentUserService mock) {
    impl = mock;
  }

  /**
   * Get current user info.
   *
   * <p>Get details about the current method caller's identity.
   */
  public User me() {
    return impl.me();
  }

  public CurrentUserService impl() {
    return impl;
  }
}
