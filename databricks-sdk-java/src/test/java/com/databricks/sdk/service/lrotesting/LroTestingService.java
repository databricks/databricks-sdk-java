// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.support.Generated;

/**
 * Test service for Long Running Operations
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LroTestingService {

  void cancelOperation(CancelOperationRequest cancelOperationRequest);

  /** Simple method to create test resource for LRO testing */
  Operation createTestResource(CreateTestResourceRequest createTestResourceRequest);

  Operation getOperation(GetOperationRequest getOperationRequest);

  /** Simple method to get test resource */
  TestResource getTestResource(GetTestResourceRequest getTestResourceRequest);
}
