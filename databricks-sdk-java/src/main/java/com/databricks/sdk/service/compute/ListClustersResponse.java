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
public class ListClustersResponse {
  /**
   * <needs content added>
   */
  @JsonProperty("clusters")
  private Collection<ClusterDetails> clusters;
  
  public ListClustersResponse setClusters(Collection<ClusterDetails> clusters) {
    this.clusters = clusters;
    return this;
  }

  public Collection<ClusterDetails> getClusters() {
    return clusters;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersResponse that = (ListClustersResponse) o;
    return Objects.equals(clusters, that.clusters)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersResponse.class)
      .add("clusters", clusters).toString();
  }
}
