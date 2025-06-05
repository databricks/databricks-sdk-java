// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RestartClusterPb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("restart_user")
  private String restartUser;

  public RestartClusterPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public RestartClusterPb setRestartUser(String restartUser) {
    this.restartUser = restartUser;
    return this;
  }

  public String getRestartUser() {
    return restartUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestartClusterPb that = (RestartClusterPb) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(restartUser, that.restartUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, restartUser);
  }

  @Override
  public String toString() {
    return new ToStringer(RestartClusterPb.class)
        .add("clusterId", clusterId)
        .add("restartUser", restartUser)
        .toString();
  }
}
