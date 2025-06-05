// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ResourceInfoPb {
  @JsonProperty("id")
  @QueryParam("id")
  private String id;

  @JsonProperty("legacy_acl_path")
  @QueryParam("legacy_acl_path")
  private String legacyAclPath;

  @JsonProperty("parent_resource_info")
  @QueryParam("parent_resource_info")
  private ResourceInfo parentResourceInfo;

  public ResourceInfoPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ResourceInfoPb setLegacyAclPath(String legacyAclPath) {
    this.legacyAclPath = legacyAclPath;
    return this;
  }

  public String getLegacyAclPath() {
    return legacyAclPath;
  }

  public ResourceInfoPb setParentResourceInfo(ResourceInfo parentResourceInfo) {
    this.parentResourceInfo = parentResourceInfo;
    return this;
  }

  public ResourceInfo getParentResourceInfo() {
    return parentResourceInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceInfoPb that = (ResourceInfoPb) o;
    return Objects.equals(id, that.id)
        && Objects.equals(legacyAclPath, that.legacyAclPath)
        && Objects.equals(parentResourceInfo, that.parentResourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, legacyAclPath, parentResourceInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(ResourceInfoPb.class)
        .add("id", id)
        .add("legacyAclPath", legacyAclPath)
        .add("parentResourceInfo", parentResourceInfo)
        .toString();
  }
}
