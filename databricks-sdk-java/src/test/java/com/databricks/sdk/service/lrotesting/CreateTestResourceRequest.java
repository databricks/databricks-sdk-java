// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateTestResourceRequest {
  /** The resource to create */
  @JsonProperty("resource")
  private TestResource resource;

  public CreateTestResourceRequest setResource(TestResource resource) {
    this.resource = resource;
    return this;
  }

  public TestResource getResource() {
    return resource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTestResourceRequest that = (CreateTestResourceRequest) o;
    return Objects.equals(resource, that.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTestResourceRequest.class).add("resource", resource).toString();
  }
}
