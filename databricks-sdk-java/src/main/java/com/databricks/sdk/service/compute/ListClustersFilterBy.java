// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListClustersFilterBy {
  /** The source of cluster creation. */
  @JsonProperty("cluster_sources")
  @QueryParam("cluster_sources")
  private Collection<ClusterSource> clusterSources;

  /** The current state of the clusters. */
  @JsonProperty("cluster_states")
  @QueryParam("cluster_states")
  private Collection<State> clusterStates;

  /** Whether the clusters are pinned or not. */
  @JsonProperty("is_pinned")
  @QueryParam("is_pinned")
  private Boolean isPinned;

  /** The ID of the cluster policy used to create the cluster if applicable. */
  @JsonProperty("policy_id")
  @QueryParam("policy_id")
  private String policyId;

  public ListClustersFilterBy setClusterSources(Collection<ClusterSource> clusterSources) {
    this.clusterSources = clusterSources;
    return this;
  }

  public Collection<ClusterSource> getClusterSources() {
    return clusterSources;
  }

  public ListClustersFilterBy setClusterStates(Collection<State> clusterStates) {
    this.clusterStates = clusterStates;
    return this;
  }

  public Collection<State> getClusterStates() {
    return clusterStates;
  }

  public ListClustersFilterBy setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  public Boolean getIsPinned() {
    return isPinned;
  }

  public ListClustersFilterBy setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersFilterBy that = (ListClustersFilterBy) o;
    return Objects.equals(clusterSources, that.clusterSources)
        && Objects.equals(clusterStates, that.clusterStates)
        && Objects.equals(isPinned, that.isPinned)
        && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterSources, clusterStates, isPinned, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersFilterBy.class)
        .add("clusterSources", clusterSources)
        .add("clusterStates", clusterStates)
        .add("isPinned", isPinned)
        .add("policyId", policyId)
        .toString();
  }
}
