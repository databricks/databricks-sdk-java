// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListClustersResponse {
  /** <needs content added> */
  @JsonProperty("clusters")
  private Collection<ClusterInfo> clusters;

  public ListClustersResponse setClusters(Collection<ClusterInfo> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<ClusterInfo> getClusters() {
    return clusters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersResponse that = (ListClustersResponse) o;
    return Objects.equals(clusters, that.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersResponse.class).add("clusters", clusters).toString();
  }
}
