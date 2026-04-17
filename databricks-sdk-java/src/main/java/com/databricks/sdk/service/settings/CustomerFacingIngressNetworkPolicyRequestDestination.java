// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyRequestDestination {
  /**
   * When true, match all destinations, no other destination fields can be set. When not set or
   * false, at least one specific destination must be provided.
   */
  @JsonProperty("all_destinations")
  private Boolean allDestinations;

  /** */
  @JsonProperty("workspace_api")
  private CustomerFacingIngressNetworkPolicyWorkspaceApiDestination workspaceApi;

  /** Workspace destinations */
  @JsonProperty("workspace_ui")
  private CustomerFacingIngressNetworkPolicyWorkspaceUiDestination workspaceUi;

  public CustomerFacingIngressNetworkPolicyRequestDestination setAllDestinations(
      Boolean allDestinations) {
    this.allDestinations = allDestinations;
    return this;
  }

  public Boolean getAllDestinations() {
    return allDestinations;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setWorkspaceApi(
      CustomerFacingIngressNetworkPolicyWorkspaceApiDestination workspaceApi) {
    this.workspaceApi = workspaceApi;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyWorkspaceApiDestination getWorkspaceApi() {
    return workspaceApi;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination setWorkspaceUi(
      CustomerFacingIngressNetworkPolicyWorkspaceUiDestination workspaceUi) {
    this.workspaceUi = workspaceUi;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyWorkspaceUiDestination getWorkspaceUi() {
    return workspaceUi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyRequestDestination that =
        (CustomerFacingIngressNetworkPolicyRequestDestination) o;
    return Objects.equals(allDestinations, that.allDestinations)
        && Objects.equals(workspaceApi, that.workspaceApi)
        && Objects.equals(workspaceUi, that.workspaceUi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDestinations, workspaceApi, workspaceUi);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyRequestDestination.class)
        .add("allDestinations", allDestinations)
        .add("workspaceApi", workspaceApi)
        .add("workspaceUi", workspaceUi)
        .toString();
  }
}
