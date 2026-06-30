// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class WorkspaceNetworkOption {
  /**
   * The network policy ID to apply to the workspace. This controls the network access rules for all
   * serverless compute resources in the workspace. Each workspace can only be linked to one policy
   * at a time. If no policy is explicitly assigned, the workspace will use 'default-policy'.
   */
  @JsonProperty("network_policy_id")
  private String networkPolicyId;

  /** The workspace ID. */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public WorkspaceNetworkOption setNetworkPolicyId(String networkPolicyId) {
    this.networkPolicyId = networkPolicyId;
    return this;
  }

  public String getNetworkPolicyId() {
    return networkPolicyId;
  }

  public WorkspaceNetworkOption setWorkspaceId(Long workspaceId) {
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
    WorkspaceNetworkOption that = (WorkspaceNetworkOption) o;
    return Objects.equals(networkPolicyId, that.networkPolicyId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicyId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceNetworkOption.class)
        .add("networkPolicyId", networkPolicyId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
