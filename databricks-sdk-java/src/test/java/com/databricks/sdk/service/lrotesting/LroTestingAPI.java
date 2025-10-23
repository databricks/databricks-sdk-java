// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Test service for Long Running Operations */
@Generated
public class LroTestingAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LroTestingAPI.class);

  private final LroTestingService impl;

  /** Regular-use constructor */
  public LroTestingAPI(ApiClient apiClient) {
    impl = new LroTestingImpl(apiClient);
  }

  /** Constructor for mocks */
  public LroTestingAPI(LroTestingService mock) {
    impl = mock;
  }

  public void cancelOperation(CancelOperationRequest request) {
    impl.cancelOperation(request);
  }

  /** Simple method to create test resource for LRO testing */
  public CreateTestResourceOperation createTestResource(CreateTestResourceRequest request) {
    Operation operation = impl.createTestResource(request);
    return new CreateTestResourceOperation(impl, operation);
  }

  public DeleteTestResourceOperation deleteTestResource(String resourceId) {
    return deleteTestResource(new DeleteTestResourceRequest().setResourceId(resourceId));
  }

  public DeleteTestResourceOperation deleteTestResource(DeleteTestResourceRequest request) {
    Operation operation = impl.deleteTestResource(request);
    return new DeleteTestResourceOperation(impl, operation);
  }

  public Operation getOperation(String name) {
    return getOperation(new GetOperationRequest().setName(name));
  }

  public Operation getOperation(GetOperationRequest request) {
    return impl.getOperation(request);
  }

  public TestResource getTestResource(String resourceId) {
    return getTestResource(new GetTestResourceRequest().setResourceId(resourceId));
  }

  /** Simple method to get test resource */
  public TestResource getTestResource(GetTestResourceRequest request) {
    return impl.getTestResource(request);
  }

  public LroTestingService impl() {
    return impl;
  }
}
