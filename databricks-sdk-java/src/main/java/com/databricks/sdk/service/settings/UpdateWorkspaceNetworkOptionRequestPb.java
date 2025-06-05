// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update workspace network option */
@Generated
class UpdateWorkspaceNetworkOptionRequestPb {
  @JsonIgnore private Long workspaceId;

  @JsonProperty("workspace_network_option")
  private WorkspaceNetworkOption workspaceNetworkOption;

  public UpdateWorkspaceNetworkOptionRequestPb setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  public UpdateWorkspaceNetworkOptionRequestPb setWorkspaceNetworkOption(
      WorkspaceNetworkOption workspaceNetworkOption) {
    this.workspaceNetworkOption = workspaceNetworkOption;
    return this;
  }

  public WorkspaceNetworkOption getWorkspaceNetworkOption() {
    return workspaceNetworkOption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceNetworkOptionRequestPb that = (UpdateWorkspaceNetworkOptionRequestPb) o;
    return Objects.equals(workspaceId, that.workspaceId)
        && Objects.equals(workspaceNetworkOption, that.workspaceNetworkOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId, workspaceNetworkOption);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceNetworkOptionRequestPb.class)
        .add("workspaceId", workspaceId)
        .add("workspaceNetworkOption", workspaceNetworkOption)
        .toString();
  }
}
