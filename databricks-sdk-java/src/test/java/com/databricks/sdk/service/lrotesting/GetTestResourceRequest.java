// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetTestResourceRequest {
  /** Resource ID to get */
  @JsonIgnore private String resourceId;

  public GetTestResourceRequest setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTestResourceRequest that = (GetTestResourceRequest) o;
    return Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTestResourceRequest.class).add("resourceId", resourceId).toString();
  }
}
