// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetClusterPolicyPermissionLevelsRequest {
  /** The cluster policy for which to get or manage permissions. */
  @JsonIgnore private String clusterPolicyId;

  public GetClusterPolicyPermissionLevelsRequest setClusterPolicyId(String clusterPolicyId) {
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
    GetClusterPolicyPermissionLevelsRequest that = (GetClusterPolicyPermissionLevelsRequest) o;
    return Objects.equals(clusterPolicyId, that.clusterPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPolicyPermissionLevelsRequest.class)
        .add("clusterPolicyId", clusterPolicyId)
        .toString();
  }
}
