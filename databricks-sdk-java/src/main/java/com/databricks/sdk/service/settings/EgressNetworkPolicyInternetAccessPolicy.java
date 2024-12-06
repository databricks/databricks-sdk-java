// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EgressNetworkPolicyInternetAccessPolicy {
  /** */
  @JsonProperty("allowed_internet_destinations")
  private Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
      allowedInternetDestinations;

  /** */
  @JsonProperty("allowed_storage_destinations")
  private Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
      allowedStorageDestinations;

  /** Optional. If not specified, assume the policy is enforced for all workloads. */
  @JsonProperty("log_only_mode")
  private EgressNetworkPolicyInternetAccessPolicyLogOnlyMode logOnlyMode;

  /**
   * At which level can Databricks and Databricks managed compute access Internet. FULL_ACCESS:
   * Databricks can access Internet. No blocking rules will apply. RESTRICTED_ACCESS: Databricks can
   * only access explicitly allowed internet and storage destinations, as well as UC connections and
   * external locations. PRIVATE_ACCESS_ONLY (not used): Databricks can only access destinations via
   * private link.
   */
  @JsonProperty("restriction_mode")
  private EgressNetworkPolicyInternetAccessPolicyRestrictionMode restrictionMode;

  public EgressNetworkPolicyInternetAccessPolicy setAllowedInternetDestinations(
      Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
          allowedInternetDestinations) {
    this.allowedInternetDestinations = allowedInternetDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
      getAllowedInternetDestinations() {
    return allowedInternetDestinations;
  }

  public EgressNetworkPolicyInternetAccessPolicy setAllowedStorageDestinations(
      Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
          allowedStorageDestinations) {
    this.allowedStorageDestinations = allowedStorageDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
      getAllowedStorageDestinations() {
    return allowedStorageDestinations;
  }

  public EgressNetworkPolicyInternetAccessPolicy setLogOnlyMode(
      EgressNetworkPolicyInternetAccessPolicyLogOnlyMode logOnlyMode) {
    this.logOnlyMode = logOnlyMode;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode getLogOnlyMode() {
    return logOnlyMode;
  }

  public EgressNetworkPolicyInternetAccessPolicy setRestrictionMode(
      EgressNetworkPolicyInternetAccessPolicyRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyRestrictionMode getRestrictionMode() {
    return restrictionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyInternetAccessPolicy that = (EgressNetworkPolicyInternetAccessPolicy) o;
    return Objects.equals(allowedInternetDestinations, that.allowedInternetDestinations)
        && Objects.equals(allowedStorageDestinations, that.allowedStorageDestinations)
        && Objects.equals(logOnlyMode, that.logOnlyMode)
        && Objects.equals(restrictionMode, that.restrictionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedInternetDestinations, allowedStorageDestinations, logOnlyMode, restrictionMode);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicy.class)
        .add("allowedInternetDestinations", allowedInternetDestinations)
        .add("allowedStorageDestinations", allowedStorageDestinations)
        .add("logOnlyMode", logOnlyMode)
        .add("restrictionMode", restrictionMode)
        .toString();
  }
}
