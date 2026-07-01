// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to cancel the pending enforcement for a cluster. */
@Generated
public class CancelPendingClusterEnforcementRequest {
  /**
   * If true and no pending enforcement exists, the request will succeed but no action will be
   * taken.
   */
  @JsonProperty("allow_missing")
  private Boolean allowMissing;

  /** The ID of the cluster to cancel the pending enforcement for. */
  @JsonProperty("cluster_id")
  private String clusterId;

  public CancelPendingClusterEnforcementRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public CancelPendingClusterEnforcementRequest setClusterId(String clusterId) {
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
    CancelPendingClusterEnforcementRequest that = (CancelPendingClusterEnforcementRequest) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelPendingClusterEnforcementRequest.class)
        .add("allowMissing", allowMissing)
        .add("clusterId", clusterId)
        .toString();
  }
}
