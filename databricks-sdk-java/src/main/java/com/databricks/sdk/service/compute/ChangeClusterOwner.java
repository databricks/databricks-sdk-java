// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ChangeClusterOwner class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ChangeClusterOwner {
  /** <needs content added> */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** New owner of the cluster_id after this RPC. */
  @JsonProperty("owner_username")
  private String ownerUsername;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ChangeClusterOwner} object
   */
  public ChangeClusterOwner setClusterId(String clusterId) {
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
   * <p>Setter for the field <code>ownerUsername</code>.</p>
   *
   * @param ownerUsername a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ChangeClusterOwner} object
   */
  public ChangeClusterOwner setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

  /**
   * <p>Getter for the field <code>ownerUsername</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOwnerUsername() {
    return ownerUsername;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChangeClusterOwner that = (ChangeClusterOwner) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(ownerUsername, that.ownerUsername);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId, ownerUsername);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ChangeClusterOwner.class)
        .add("clusterId", clusterId)
        .add("ownerUsername", ownerUsername)
        .toString();
  }
}
