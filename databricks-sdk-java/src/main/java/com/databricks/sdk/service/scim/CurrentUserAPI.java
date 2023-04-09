// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * This API allows retrieving information about currently authenticated user or service principal.
 */
public class CurrentUserAPI {
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
