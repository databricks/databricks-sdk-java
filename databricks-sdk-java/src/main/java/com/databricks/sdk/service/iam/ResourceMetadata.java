// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ResourceMetadata {
  /** */
  @JsonProperty("resourceType")
  private String resourceType;

  public ResourceMetadata setResourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  public String getResourceType() {
    return resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceMetadata that = (ResourceMetadata) o;
    return Objects.equals(resourceType, that.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType);
  }

  @Override
  public String toString() {
    return new ToStringer(ResourceMetadata.class).add("resourceType", resourceType).toString();
  }
}
