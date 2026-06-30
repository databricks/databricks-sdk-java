// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyPrivateAccess {
  /** */
  @JsonProperty("allow_rules")
  private Collection<CustomerFacingIngressNetworkPolicyPrivateIngressRule> allowRules;

  /** */
  @JsonProperty("deny_rules")
  private Collection<CustomerFacingIngressNetworkPolicyPrivateIngressRule> denyRules;

  /** */
  @JsonProperty("restriction_mode")
  private CustomerFacingIngressNetworkPolicyPrivateAccessRestrictionMode restrictionMode;

  public CustomerFacingIngressNetworkPolicyPrivateAccess setAllowRules(
      Collection<CustomerFacingIngressNetworkPolicyPrivateIngressRule> allowRules) {
    this.allowRules = allowRules;
    return this;
  }

  public Collection<CustomerFacingIngressNetworkPolicyPrivateIngressRule> getAllowRules() {
    return allowRules;
  }

  public CustomerFacingIngressNetworkPolicyPrivateAccess setDenyRules(
      Collection<CustomerFacingIngressNetworkPolicyPrivateIngressRule> denyRules) {
    this.denyRules = denyRules;
    return this;
  }

  public Collection<CustomerFacingIngressNetworkPolicyPrivateIngressRule> getDenyRules() {
    return denyRules;
  }

  public CustomerFacingIngressNetworkPolicyPrivateAccess setRestrictionMode(
      CustomerFacingIngressNetworkPolicyPrivateAccessRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyPrivateAccessRestrictionMode getRestrictionMode() {
    return restrictionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyPrivateAccess that =
        (CustomerFacingIngressNetworkPolicyPrivateAccess) o;
    return Objects.equals(allowRules, that.allowRules)
        && Objects.equals(denyRules, that.denyRules)
        && Objects.equals(restrictionMode, that.restrictionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowRules, denyRules, restrictionMode);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyPrivateAccess.class)
        .add("allowRules", allowRules)
        .add("denyRules", denyRules)
        .add("restrictionMode", restrictionMode)
        .toString();
  }
}
