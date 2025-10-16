// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.idempotencytesting;

import com.databricks.sdk.support.Generated;

/**
 * Test service for Idempotency of Operations
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface IdempotencyTestingService {

  TestResource createTestResource(CreateTestResourceRequest createTestResourceRequest);
}
