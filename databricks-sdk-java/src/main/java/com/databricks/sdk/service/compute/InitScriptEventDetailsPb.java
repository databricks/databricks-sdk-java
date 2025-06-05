// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class InitScriptEventDetailsPb {
  @JsonProperty("cluster")
  private Collection<InitScriptInfoAndExecutionDetails> cluster;

  @JsonProperty("global")
  private Collection<InitScriptInfoAndExecutionDetails> global;

  @JsonProperty("reported_for_node")
  private String reportedForNode;

  public InitScriptEventDetailsPb setCluster(
      Collection<InitScriptInfoAndExecutionDetails> cluster) {
    this.cluster = cluster;
    return this;
  }

  public Collection<InitScriptInfoAndExecutionDetails> getCluster() {
    return cluster;
  }

  public InitScriptEventDetailsPb setGlobal(Collection<InitScriptInfoAndExecutionDetails> global) {
    this.global = global;
    return this;
  }

  public Collection<InitScriptInfoAndExecutionDetails> getGlobal() {
    return global;
  }

  public InitScriptEventDetailsPb setReportedForNode(String reportedForNode) {
    this.reportedForNode = reportedForNode;
    return this;
  }

  public String getReportedForNode() {
    return reportedForNode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitScriptEventDetailsPb that = (InitScriptEventDetailsPb) o;
    return Objects.equals(cluster, that.cluster)
        && Objects.equals(global, that.global)
        && Objects.equals(reportedForNode, that.reportedForNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, global, reportedForNode);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptEventDetailsPb.class)
        .add("cluster", cluster)
        .add("global", global)
        .add("reportedForNode", reportedForNode)
        .toString();
  }
}
