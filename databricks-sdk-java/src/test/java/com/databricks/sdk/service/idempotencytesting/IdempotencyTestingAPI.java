// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.idempotencytesting;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/** Test service for Idempotency of Operations */
@Generated
public class IdempotencyTestingAPI {
  private static final Logger LOG = LoggerFactory.getLogger(IdempotencyTestingAPI.class);

  private final IdempotencyTestingService impl;

  /** Regular-use constructor */
  public IdempotencyTestingAPI(ApiClient apiClient) {
    impl = new IdempotencyTestingImpl(apiClient);
  }

  /** Constructor for mocks */
  public IdempotencyTestingAPI(IdempotencyTestingService mock) {
    impl = mock;
  }

  public TestResource createTestResource(CreateTestResourceRequest request) {
    return impl.createTestResource(request);
  }

  public IdempotencyTestingService impl() {
    return impl;
  }
}
