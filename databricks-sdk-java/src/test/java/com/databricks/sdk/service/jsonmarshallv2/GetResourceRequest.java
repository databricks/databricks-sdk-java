// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jsonmarshallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetResourceRequest {
  /** */
  @JsonIgnore private String name;

  /** Description. */
  @JsonIgnore
  @QueryParam("resource")
  private Resource resource;

  public GetResourceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetResourceRequest setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  public Resource getResource() {
    return resource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetResourceRequest that = (GetResourceRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(resource, that.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resource);
  }

  @Override
  public String toString() {
    return new ToStringer(GetResourceRequest.class)
        .add("name", name)
        .add("resource", resource)
        .toString();
  }
}
