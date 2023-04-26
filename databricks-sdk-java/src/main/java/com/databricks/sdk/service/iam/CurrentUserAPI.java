// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This API allows retrieving information about currently authenticated user or service principal.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CurrentUserAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CurrentUserAPI.class);

  private final CurrentUserService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public CurrentUserAPI(ApiClient apiClient) {
    impl = new CurrentUserImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.iam.CurrentUserService} object
   */
  public CurrentUserAPI(CurrentUserService mock) {
    impl = mock;
  }

  /**
   * Get current user info.
   *
   * <p>Get details about the current method caller's identity.
   *
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User me() {
    return impl.me();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.CurrentUserService} object
   */
  public CurrentUserService impl() {
    return impl;
  }
}
