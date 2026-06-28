// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetClusterPermissionsRequest {
  /** The cluster for which to get or manage permissions. */
  @JsonIgnore private String clusterId;

  public GetClusterPermissionsRequest setClusterId(String clusterId) {
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
    GetClusterPermissionsRequest that = (GetClusterPermissionsRequest) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPermissionsRequest.class)
        .add("clusterId", clusterId)
        .toString();
  }
}
