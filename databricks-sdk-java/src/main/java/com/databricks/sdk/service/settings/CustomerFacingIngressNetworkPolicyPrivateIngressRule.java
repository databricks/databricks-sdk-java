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
public class CustomerFacingIngressNetworkPolicyPrivateIngressRule {
  /**
   * The authenticated identity the request must match. When unset, the rule matches all users and
   * service principals. On the account-level network policy, scoping to specific identities is not
   * currently supported, so this field must be unset (the rule matches all users and service
   * principals).
   */
  @JsonProperty("authentication")
  private CustomerFacingIngressNetworkPolicyAuthentication authentication;

  /**
   * The destination the request must match — the resource being accessed, for example the workspace
   * UI, workspace APIs, or account-level APIs. See RequestDestination.
   */
  @JsonProperty("destination")
  private CustomerFacingIngressNetworkPolicyRequestDestination destination;

  /** The label for this ingress rule. */
  @JsonProperty("label")
  private String label;

  /**
   * The origin the request must match — the private connectivity the request arrives through, for
   * example a specific set of registered endpoints or any endpoint registered to the account. See
   * PrivateRequestOrigin.
   */
  @JsonProperty("origin")
  private CustomerFacingIngressNetworkPolicyPrivateRequestOrigin origin;

  public CustomerFacingIngressNetworkPolicyPrivateIngressRule setAuthentication(
      CustomerFacingIngressNetworkPolicyAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAuthentication getAuthentication() {
    return authentication;
  }

  public CustomerFacingIngressNetworkPolicyPrivateIngressRule setDestination(
      CustomerFacingIngressNetworkPolicyRequestDestination destination) {
    this.destination = destination;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyRequestDestination getDestination() {
    return destination;
  }

  public CustomerFacingIngressNetworkPolicyPrivateIngressRule setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public CustomerFacingIngressNetworkPolicyPrivateIngressRule setOrigin(
      CustomerFacingIngressNetworkPolicyPrivateRequestOrigin origin) {
    this.origin = origin;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyPrivateRequestOrigin getOrigin() {
    return origin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyPrivateIngressRule that =
        (CustomerFacingIngressNetworkPolicyPrivateIngressRule) o;
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
    return new ToStringer(CustomerFacingIngressNetworkPolicyPrivateIngressRule.class)
        .add("authentication", authentication)
        .add("destination", destination)
        .add("label", label)
        .add("origin", origin)
        .toString();
  }
}
