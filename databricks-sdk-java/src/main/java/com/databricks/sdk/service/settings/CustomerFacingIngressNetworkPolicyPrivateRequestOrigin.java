// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The origin of a private access request, identified by the endpoint through which the request
 * arrives.
 */
@Generated
public class CustomerFacingIngressNetworkPolicyPrivateRequestOrigin {
  /**
   * Matches requests arriving over any private connectivity, including registered endpoints and the
   * workspace's Azure Private Link (ui-api) endpoints. Can only be used in deny rules of
   * workspace-level network policies. Must be set to true when specified.
   */
  @JsonProperty("all_private_access")
  private Boolean allPrivateAccess;

  /**
   * Matches requests arriving through any endpoint registered to the account. Must be set to true
   * when specified.
   */
  @JsonProperty("all_registered_endpoints")
  private Boolean allRegisteredEndpoints;

  /**
   * Matches requests arriving through the workspace's Azure Private Link (ui-api) endpoints. Can
   * only be used in deny rules of workspace-level network policies. Must be set to true when
   * specified.
   */
  @JsonProperty("azure_workspace_private_link")
  private Boolean azureWorkspacePrivateLink;

  /** Matches requests arriving through any of the specified registered endpoints. */
  @JsonProperty("endpoints")
  private CustomerFacingIngressNetworkPolicyEndpoints endpoints;

  public CustomerFacingIngressNetworkPolicyPrivateRequestOrigin setAllPrivateAccess(
      Boolean allPrivateAccess) {
    this.allPrivateAccess = allPrivateAccess;
    return this;
  }

  public Boolean getAllPrivateAccess() {
    return allPrivateAccess;
  }

  public CustomerFacingIngressNetworkPolicyPrivateRequestOrigin setAllRegisteredEndpoints(
      Boolean allRegisteredEndpoints) {
    this.allRegisteredEndpoints = allRegisteredEndpoints;
    return this;
  }

  public Boolean getAllRegisteredEndpoints() {
    return allRegisteredEndpoints;
  }

  public CustomerFacingIngressNetworkPolicyPrivateRequestOrigin setAzureWorkspacePrivateLink(
      Boolean azureWorkspacePrivateLink) {
    this.azureWorkspacePrivateLink = azureWorkspacePrivateLink;
    return this;
  }

  public Boolean getAzureWorkspacePrivateLink() {
    return azureWorkspacePrivateLink;
  }

  public CustomerFacingIngressNetworkPolicyPrivateRequestOrigin setEndpoints(
      CustomerFacingIngressNetworkPolicyEndpoints endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyEndpoints getEndpoints() {
    return endpoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyPrivateRequestOrigin that =
        (CustomerFacingIngressNetworkPolicyPrivateRequestOrigin) o;
    return Objects.equals(allPrivateAccess, that.allPrivateAccess)
        && Objects.equals(allRegisteredEndpoints, that.allRegisteredEndpoints)
        && Objects.equals(azureWorkspacePrivateLink, that.azureWorkspacePrivateLink)
        && Objects.equals(endpoints, that.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allPrivateAccess, allRegisteredEndpoints, azureWorkspacePrivateLink, endpoints);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyPrivateRequestOrigin.class)
        .add("allPrivateAccess", allPrivateAccess)
        .add("allRegisteredEndpoints", allRegisteredEndpoints)
        .add("azureWorkspacePrivateLink", azureWorkspacePrivateLink)
        .add("endpoints", endpoints)
        .toString();
  }
}
