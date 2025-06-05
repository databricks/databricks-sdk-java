// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ClusterPermissionsRequestPb {
  @JsonProperty("access_control_list")
  private Collection<ClusterAccessControlRequest> accessControlList;

  @JsonIgnore private String clusterId;

  public ClusterPermissionsRequestPb setAccessControlList(
      Collection<ClusterAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ClusterAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ClusterPermissionsRequestPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterPermissionsRequestPb that = (ClusterPermissionsRequestPb) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPermissionsRequestPb.class)
        .add("accessControlList", accessControlList)
        .add("clusterId", clusterId)
        .toString();
  }
}
