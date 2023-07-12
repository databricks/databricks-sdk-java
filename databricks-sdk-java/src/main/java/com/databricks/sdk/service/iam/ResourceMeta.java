// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ResourceMeta {
  /**
   * Identifier for group type. Can be local workspace group (`WorkspaceGroup`)
   * or account group (`Group`).
   */
  @JsonProperty("resourceType")
  private String resourceType;
  
  public ResourceMeta setResourceType(String resourceType) {
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
    ResourceMeta that = (ResourceMeta) o;
    return Objects.equals(resourceType, that.resourceType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType);
  }

  @Override
  public String toString() {
    return new ToStringer(ResourceMeta.class)
      .add("resourceType", resourceType).toString();
  }
}
