// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PermanentDeleteCluster class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermanentDeleteCluster {
  /** The cluster to be deleted. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.PermanentDeleteCluster} object
   */
  public PermanentDeleteCluster setClusterId(String clusterId) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermanentDeleteCluster that = (PermanentDeleteCluster) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PermanentDeleteCluster.class).add("clusterId", clusterId).toString();
  }
}
