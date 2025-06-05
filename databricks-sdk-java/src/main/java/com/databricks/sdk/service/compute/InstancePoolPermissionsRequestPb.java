// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class InstancePoolPermissionsRequestPb {
  @JsonProperty("access_control_list")
  private Collection<InstancePoolAccessControlRequest> accessControlList;

  @JsonIgnore private String instancePoolId;

  public InstancePoolPermissionsRequestPb setAccessControlList(
      Collection<InstancePoolAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<InstancePoolAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public InstancePoolPermissionsRequestPb setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolPermissionsRequestPb that = (InstancePoolPermissionsRequestPb) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolPermissionsRequestPb.class)
        .add("accessControlList", accessControlList)
        .add("instancePoolId", instancePoolId)
        .toString();
  }
}
