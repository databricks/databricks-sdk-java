// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ChangeClusterOwner {
  /** <needs content added> */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** New owner of the cluster_id after this RPC. */
  @JsonProperty("owner_username")
  private String ownerUsername;

  public ChangeClusterOwner setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ChangeClusterOwner setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

  public String getOwnerUsername() {
    return ownerUsername;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChangeClusterOwner that = (ChangeClusterOwner) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(ownerUsername, that.ownerUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, ownerUsername);
  }

  @Override
  public String toString() {
    return new ToStringer(ChangeClusterOwner.class)
        .add("clusterId", clusterId)
        .add("ownerUsername", ownerUsername)
        .toString();
  }
}
