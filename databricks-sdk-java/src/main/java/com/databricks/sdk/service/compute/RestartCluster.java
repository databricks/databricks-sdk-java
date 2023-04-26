// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RestartCluster class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RestartCluster {
  /** The cluster to be started. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** <needs content added> */
  @JsonProperty("restart_user")
  private String restartUser;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.RestartCluster} object
   */
  public RestartCluster setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>restartUser</code>.</p>
   *
   * @param restartUser a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.RestartCluster} object
   */
  public RestartCluster setRestartUser(String restartUser) {
    this.restartUser = restartUser;
    return this;
  }

  /**
   * <p>Getter for the field <code>restartUser</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRestartUser() {
    return restartUser;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestartCluster that = (RestartCluster) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(restartUser, that.restartUser);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, restartUser);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RestartCluster.class)
        .add("clusterId", clusterId)
        .add("restartUser", restartUser)
        .toString();
  }
}
