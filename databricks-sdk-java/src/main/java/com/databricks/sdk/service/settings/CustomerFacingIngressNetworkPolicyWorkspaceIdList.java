// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyWorkspaceIdList {
  /** */
  @JsonProperty("workspace_ids")
  private Collection<Long> workspaceIds;

  public CustomerFacingIngressNetworkPolicyWorkspaceIdList setWorkspaceIds(
      Collection<Long> workspaceIds) {
    this.workspaceIds = workspaceIds;
    return this;
  }

  public Collection<Long> getWorkspaceIds() {
    return workspaceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyWorkspaceIdList that =
        (CustomerFacingIngressNetworkPolicyWorkspaceIdList) o;
    return Objects.equals(workspaceIds, that.workspaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceIds);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyWorkspaceIdList.class)
        .add("workspaceIds", workspaceIds)
        .toString();
  }
}
