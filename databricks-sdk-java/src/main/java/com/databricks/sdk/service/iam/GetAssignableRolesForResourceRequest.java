// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get assignable roles for a resource */
@Generated
public class GetAssignableRolesForResourceRequest {
  /** The resource name for which assignable roles will be listed. */
  @QueryParam("resource")
  private String resource;

  public GetAssignableRolesForResourceRequest setResource(String resource) {
    this.resource = resource;
    return this;
  }

  public String getResource() {
    return resource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAssignableRolesForResourceRequest that = (GetAssignableRolesForResourceRequest) o;
    return Objects.equals(resource, that.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAssignableRolesForResourceRequest.class)
        .add("resource", resource)
        .toString();
  }
}
