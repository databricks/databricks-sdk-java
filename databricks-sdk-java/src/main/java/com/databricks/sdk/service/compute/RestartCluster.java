// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class RestartCluster {
  /**
   * The cluster to be started.
   */
  @JsonProperty("cluster_id")
  private String clusterId;
  
  /**
   * <needs content added>
   */
  @JsonProperty("restart_user")
  private String restartUser;
  
  public RestartCluster setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }
  
  public RestartCluster setRestartUser(String restartUser) {
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
    RestartCluster that = (RestartCluster) o;
    return Objects.equals(clusterId, that.clusterId)
    && Objects.equals(restartUser, that.restartUser)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, restartUser);
  }

  @Override
  public String toString() {
    return new ToStringer(RestartCluster.class)
      .add("clusterId", clusterId)
      .add("restartUser", restartUser).toString();
  }
}
