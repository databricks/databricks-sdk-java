// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RequestedClaims {
  /** */
  @JsonProperty("permission_set")
  private RequestedClaimsPermissionSet permissionSet;

  /** */
  @JsonProperty("resources")
  private Collection<RequestedResource> resources;

  public RequestedClaims setPermissionSet(RequestedClaimsPermissionSet permissionSet) {
    this.permissionSet = permissionSet;
    return this;
  }

  public RequestedClaimsPermissionSet getPermissionSet() {
    return permissionSet;
  }

  public RequestedClaims setResources(Collection<RequestedResource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<RequestedResource> getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedClaims that = (RequestedClaims) o;
    return Objects.equals(permissionSet, that.permissionSet)
        && Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionSet, resources);
  }

  @Override
  public String toString() {
    return new ToStringer(RequestedClaims.class)
        .add("permissionSet", permissionSet)
        .add("resources", resources)
        .toString();
  }
}
