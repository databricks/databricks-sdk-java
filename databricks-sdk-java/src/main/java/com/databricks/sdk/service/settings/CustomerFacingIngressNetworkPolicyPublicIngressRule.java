// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An ingress rule is enforced when a request satisfies all specified attributes — including request
 * origin, destination, and authentication.
 */
@Generated
public class CustomerFacingIngressNetworkPolicyPublicIngressRule {
  /** */
  @JsonProperty("authentication")
  private CustomerFacingIngressNetworkPolicyAuthentication authentication;

  /** */
  @JsonProperty("destination")
  private CustomerFacingIngressNetworkPolicyRequestDestination destination;

  /**
   * User-provided name for this ingress rule. Helps identify which rule caused a request to be
   * denied or dry-run denied.
   */
  @JsonProperty("label")
  private String label;

  /** */
  @JsonProperty("origin")
  private CustomerFacingIngressNetworkPolicyPublicRequestOrigin origin;

  public CustomerFacingIngressNetworkPolicyPublicIngressRule setAuthentication(
      CustomerFacingIngressNetworkPolicyAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAuthentication getAuthentication() {
    return authentication;
  }

  public CustomerFacingIngressNetworkPolicyPublicIngressRule setDestination(
      CustomerFacingIngressNetworkPolicyRequestDestination destination) {
    this.destination = destination;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination getDestination() {
    return destination;
  }

  public CustomerFacingIngressNetworkPolicyPublicIngressRule setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public CustomerFacingIngressNetworkPolicyPublicIngressRule setOrigin(
      CustomerFacingIngressNetworkPolicyPublicRequestOrigin origin) {
    this.origin = origin;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyPublicRequestOrigin getOrigin() {
    return origin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyPublicIngressRule that =
        (CustomerFacingIngressNetworkPolicyPublicIngressRule) o;
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
    return new ToStringer(CustomerFacingIngressNetworkPolicyPublicIngressRule.class)
        .add("authentication", authentication)
        .add("destination", destination)
        .add("label", label)
        .add("origin", origin)
        .toString();
  }
}
