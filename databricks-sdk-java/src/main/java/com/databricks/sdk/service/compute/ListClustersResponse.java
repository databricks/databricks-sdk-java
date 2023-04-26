// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListClustersResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListClustersResponse {
  /** <needs content added> */
  @JsonProperty("clusters")
  private Collection<ClusterInfo> clusters;

  /**
   * <p>Setter for the field <code>clusters</code>.</p>
   *
   * @param clusters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListClustersResponse} object
   */
  public ListClustersResponse setClusters(Collection<ClusterInfo> clusters) {
    this.clusters = clusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusters</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ClusterInfo> getClusters() {
    return clusters;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersResponse that = (ListClustersResponse) o;
    return Objects.equals(clusters, that.clusters);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clusters);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListClustersResponse.class).add("clusters", clusters).toString();
  }
}
