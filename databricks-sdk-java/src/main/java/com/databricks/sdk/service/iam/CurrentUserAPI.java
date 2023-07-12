// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;



/**
 * This API allows retrieving information about currently authenticated user or
 * service principal.
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
   * Get details about the current method caller's identity.
   */
  public User me() {
    return impl.me();
  }
  
  public CurrentUserService impl() {
    return impl;
  }
}












