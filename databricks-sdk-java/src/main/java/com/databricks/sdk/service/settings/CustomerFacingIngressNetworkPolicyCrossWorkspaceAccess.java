// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyCrossWorkspaceAccess {
  /** */
  @JsonProperty("allow_rules")
  private Collection<CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule> allowRules;

  /** */
  @JsonProperty("deny_rules")
  private Collection<CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule> denyRules;

  /** */
  @JsonProperty("restriction_mode")
  private CustomerFacingIngressNetworkPolicyCrossWorkspaceAccessRestrictionMode restrictionMode;

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceAccess setAllowRules(
      Collection<CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule> allowRules) {
    this.allowRules = allowRules;
    return this;
  }

  public Collection<CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule> getAllowRules() {
    return allowRules;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceAccess setDenyRules(
      Collection<CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule> denyRules) {
    this.denyRules = denyRules;
    return this;
  }

  public Collection<CustomerFacingIngressNetworkPolicyCrossWorkspaceIngressRule> getDenyRules() {
    return denyRules;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceAccess setRestrictionMode(
      CustomerFacingIngressNetworkPolicyCrossWorkspaceAccessRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyCrossWorkspaceAccessRestrictionMode
      getRestrictionMode() {
    return restrictionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyCrossWorkspaceAccess that =
        (CustomerFacingIngressNetworkPolicyCrossWorkspaceAccess) o;
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
    return new ToStringer(CustomerFacingIngressNetworkPolicyCrossWorkspaceAccess.class)
        .add("allowRules", allowRules)
        .add("denyRules", denyRules)
        .add("restrictionMode", restrictionMode)
        .toString();
  }
}
