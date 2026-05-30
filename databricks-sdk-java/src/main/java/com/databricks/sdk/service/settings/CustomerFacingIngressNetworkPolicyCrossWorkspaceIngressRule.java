// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule {
  /** */
  @JsonProperty("authentication")
  private CustomerFacingIngressNetworkPolicyAuthentication authentication;

  /** */
  @JsonProperty("destination")
  private CustomerFacingIngressNetworkPolicyRequestDestination destination;

  /** The label for this ingress rule. */
  @JsonProperty("label")
  private String label;

  /** */
  @JsonProperty("origin")
  private CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin origin;

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule setAuthentication(
      CustomerFacingIngressNetworkPolicyAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAuthentication getAuthentication() {
    return authentication;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule setDestination(
      CustomerFacingIngressNetworkPolicyRequestDestination destination) {
    this.destination = destination;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination getDestination() {
    return destination;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule setOrigin(
      CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin origin) {
    this.origin = origin;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceRequestOrigin getOrigin() {
    return origin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule that =
        (CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule) o;
    return Objects.equals(authentication, that.authentication)
        && Objects.equals(destination, that.destination)
        && Objects.equals(label, that.label)
        && Objects.equals(origin, that.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, destination, label, origin);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule.class)
        .add("authentication", authentication)
        .add("destination", destination)
        .add("label", label)
        .add("origin", origin)
        .toString();
  }
}
