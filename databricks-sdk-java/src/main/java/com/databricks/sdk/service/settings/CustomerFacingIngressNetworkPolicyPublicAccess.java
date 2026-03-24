// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyPublicAccess {
  /** */
  @JsonProperty("allow_rules")
  private Collection<CustomerFacingIngressNetworkPolicyPublicIngressRule> allowRules;

  /** */
  @JsonProperty("deny_rules")
  private Collection<CustomerFacingIngressNetworkPolicyPublicIngressRule> denyRules;

  /** */
  @JsonProperty("restriction_mode")
  private CustomerFacingIngressNetworkPolicyPublicAccessRestrictionMode restrictionMode;

  public CustomerFacingIngressNetworkPolicyPublicAccess setAllowRules(
      Collection<CustomerFacingIngressNetworkPolicyPublicIngressRule> allowRules) {
    this.allowRules = allowRules;
    return this;
  }

  public Collection<CustomerFacingIngressNetworkPolicyPublicIngressRule> getAllowRules() {
    return allowRules;
  }

  public CustomerFacingIngressNetworkPolicyPublicAccess setDenyRules(
      Collection<CustomerFacingIngressNetworkPolicyPublicIngressRule> denyRules) {
    this.denyRules = denyRules;
    return this;
  }

  public Collection<CustomerFacingIngressNetworkPolicyPublicIngressRule> getDenyRules() {
    return denyRules;
  }

  public CustomerFacingIngressNetworkPolicyPublicAccess setRestrictionMode(
      CustomerFacingIngressNetworkPolicyPublicAccessRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyPublicAccessRestrictionMode getRestrictionMode() {
    return restrictionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyPublicAccess that =
        (CustomerFacingIngressNetworkPolicyPublicAccess) o;
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
    return new ToStringer(CustomerFacingIngressNetworkPolicyPublicAccess.class)
        .add("allowRules", allowRules)
        .add("denyRules", denyRules)
        .add("restrictionMode", restrictionMode)
        .toString();
  }
}
