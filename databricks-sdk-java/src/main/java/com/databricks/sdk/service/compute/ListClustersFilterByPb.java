// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListClustersFilterByPb {
  @JsonProperty("cluster_sources")
  @QueryParam("cluster_sources")
  private Collection<ClusterSource> clusterSources;

  @JsonProperty("cluster_states")
  @QueryParam("cluster_states")
  private Collection<State> clusterStates;

  @JsonProperty("is_pinned")
  @QueryParam("is_pinned")
  private Boolean isPinned;

  @JsonProperty("policy_id")
  @QueryParam("policy_id")
  private String policyId;

  public ListClustersFilterByPb setClusterSources(Collection<ClusterSource> clusterSources) {
    this.clusterSources = clusterSources;
    return this;
  }

  public Collection<ClusterSource> getClusterSources() {
    return clusterSources;
  }

  public ListClustersFilterByPb setClusterStates(Collection<State> clusterStates) {
    this.clusterStates = clusterStates;
    return this;
  }

  public Collection<State> getClusterStates() {
    return clusterStates;
  }

  public ListClustersFilterByPb setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  public Boolean getIsPinned() {
    return isPinned;
  }

  public ListClustersFilterByPb setPolicyId(String policyId) {
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
    ListClustersFilterByPb that = (ListClustersFilterByPb) o;
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
    return new ToStringer(ListClustersFilterByPb.class)
        .add("clusterSources", clusterSources)
        .add("clusterStates", clusterStates)
        .add("isPinned", isPinned)
        .add("policyId", policyId)
        .toString();
  }
}
