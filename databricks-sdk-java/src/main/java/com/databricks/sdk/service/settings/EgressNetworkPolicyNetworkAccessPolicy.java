// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EgressNetworkPolicyNetworkAccessPolicy {
  /**
   * List of internet destinations that serverless workloads are allowed to access when in
   * RESTRICTED_ACCESS mode.
   */
  @JsonProperty("allowed_internet_destinations")
  private Collection<EgressNetworkPolicyNetworkAccessPolicyInternetDestination>
      allowedInternetDestinations;

  /**
   * List of storage destinations that serverless workloads are allowed to access when in
   * RESTRICTED_ACCESS mode.
   */
  @JsonProperty("allowed_storage_destinations")
  private Collection<EgressNetworkPolicyNetworkAccessPolicyStorageDestination>
      allowedStorageDestinations;

  /** Optional. When policy_enforcement is not provided, we default to ENFORCE_MODE_ALL_SERVICES */
  @JsonProperty("policy_enforcement")
  private EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement policyEnforcement;

  /** The restriction mode that controls how serverless workloads can access the internet. */
  @JsonProperty("restriction_mode")
  private EgressNetworkPolicyNetworkAccessPolicyRestrictionMode restrictionMode;

  public EgressNetworkPolicyNetworkAccessPolicy setAllowedInternetDestinations(
      Collection<EgressNetworkPolicyNetworkAccessPolicyInternetDestination>
          allowedInternetDestinations) {
    this.allowedInternetDestinations = allowedInternetDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyNetworkAccessPolicyInternetDestination>
      getAllowedInternetDestinations() {
    return allowedInternetDestinations;
  }

  public EgressNetworkPolicyNetworkAccessPolicy setAllowedStorageDestinations(
      Collection<EgressNetworkPolicyNetworkAccessPolicyStorageDestination>
          allowedStorageDestinations) {
    this.allowedStorageDestinations = allowedStorageDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyNetworkAccessPolicyStorageDestination>
      getAllowedStorageDestinations() {
    return allowedStorageDestinations;
  }

  public EgressNetworkPolicyNetworkAccessPolicy setPolicyEnforcement(
      EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement policyEnforcement) {
    this.policyEnforcement = policyEnforcement;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement getPolicyEnforcement() {
    return policyEnforcement;
  }

  public EgressNetworkPolicyNetworkAccessPolicy setRestrictionMode(
      EgressNetworkPolicyNetworkAccessPolicyRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyRestrictionMode getRestrictionMode() {
    return restrictionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyNetworkAccessPolicy that = (EgressNetworkPolicyNetworkAccessPolicy) o;
    return Objects.equals(allowedInternetDestinations, that.allowedInternetDestinations)
        && Objects.equals(allowedStorageDestinations, that.allowedStorageDestinations)
        && Objects.equals(policyEnforcement, that.policyEnforcement)
        && Objects.equals(restrictionMode, that.restrictionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedInternetDestinations,
        allowedStorageDestinations,
        policyEnforcement,
        restrictionMode);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicy.class)
        .add("allowedInternetDestinations", allowedInternetDestinations)
        .add("allowedStorageDestinations", allowedStorageDestinations)
        .add("policyEnforcement", policyEnforcement)
        .add("restrictionMode", restrictionMode)
        .toString();
  }
}
