// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.idempotencytesting;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateTestResourceRequest {
  /** */
  @JsonIgnore
  @QueryParam("request_id")
  private String requestId;

  /** */
  @JsonProperty("test_resource")
  private TestResource testResource;

  public CreateTestResourceRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public CreateTestResourceRequest setTestResource(TestResource testResource) {
    this.testResource = testResource;
    return this;
  }

  public TestResource getTestResource() {
    return testResource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTestResourceRequest that = (CreateTestResourceRequest) o;
    return Objects.equals(requestId, that.requestId)
        && Objects.equals(testResource, that.testResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, testResource);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTestResourceRequest.class)
        .add("requestId", requestId)
        .add("testResource", testResource)
        .toString();
  }
}
