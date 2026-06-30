// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin {
  /** Matches all source workspaces. */
  @JsonProperty("all_source_workspaces")
  private Boolean allSourceWorkspaces;

  /** Specific source workspace IDs to match. */
  @JsonProperty("selected_workspaces")
  private CustomerFacingIngressNetworkPolicyWorkspaceIdList selectedWorkspaces;

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin setAllSourceWorkspaces(
      Boolean allSourceWorkspaces) {
    this.allSourceWorkspaces = allSourceWorkspaces;
    return this;
  }

  public Boolean getAllSourceWorkspaces() {
    return allSourceWorkspaces;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin setSelectedWorkspaces(
      CustomerFacingIngressNetworkPolicyWorkspaceIdList selectedWorkspaces) {
    this.selectedWorkspaces = selectedWorkspaces;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyWorkspaceIdList getSelectedWorkspaces() {
    return selectedWorkspaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin that =
        (CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin) o;
    return Objects.equals(allSourceWorkspaces, that.allSourceWorkspaces)
        && Objects.equals(selectedWorkspaces, that.selectedWorkspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allSourceWorkspaces, selectedWorkspaces);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin.class)
        .add("allSourceWorkspaces", allSourceWorkspaces)
        .add("selectedWorkspaces", selectedWorkspaces)
        .toString();
  }
}
