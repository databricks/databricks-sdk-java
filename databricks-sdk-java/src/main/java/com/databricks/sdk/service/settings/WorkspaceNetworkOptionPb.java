// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class WorkspaceNetworkOptionPb {
  @JsonProperty("network_policy_id")
  private String networkPolicyId;

  @JsonProperty("workspace_id")
  private Long workspaceId;

  public WorkspaceNetworkOptionPb setNetworkPolicyId(String networkPolicyId) {
    this.networkPolicyId = networkPolicyId;
    return this;
  }

  public String getNetworkPolicyId() {
    return networkPolicyId;
  }

  public WorkspaceNetworkOptionPb setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceNetworkOptionPb that = (WorkspaceNetworkOptionPb) o;
    return Objects.equals(networkPolicyId, that.networkPolicyId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicyId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceNetworkOptionPb.class)
        .add("networkPolicyId", networkPolicyId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
