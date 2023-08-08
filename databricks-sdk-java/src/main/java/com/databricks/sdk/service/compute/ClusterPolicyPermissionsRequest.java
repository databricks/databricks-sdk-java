// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ClusterPolicyPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<ClusterPolicyAccessControlRequest> accessControlList;

  /** The cluster policy for which to get or manage permissions. */
  private String clusterPolicyId;

  public ClusterPolicyPermissionsRequest setAccessControlList(
      Collection<ClusterPolicyAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ClusterPolicyAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ClusterPolicyPermissionsRequest setClusterPolicyId(String clusterPolicyId) {
    this.clusterPolicyId = clusterPolicyId;
    return this;
  }

  public String getClusterPolicyId() {
    return clusterPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterPolicyPermissionsRequest that = (ClusterPolicyPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(clusterPolicyId, that.clusterPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, clusterPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPolicyPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("clusterPolicyId", clusterPolicyId)
        .toString();
  }
}
