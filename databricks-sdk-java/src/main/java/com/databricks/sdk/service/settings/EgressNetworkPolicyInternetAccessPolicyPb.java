// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EgressNetworkPolicyInternetAccessPolicyPb {
  @JsonProperty("allowed_internet_destinations")
  private Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
      allowedInternetDestinations;

  @JsonProperty("allowed_storage_destinations")
  private Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
      allowedStorageDestinations;

  @JsonProperty("log_only_mode")
  private EgressNetworkPolicyInternetAccessPolicyLogOnlyMode logOnlyMode;

  @JsonProperty("restriction_mode")
  private EgressNetworkPolicyInternetAccessPolicyRestrictionMode restrictionMode;

  public EgressNetworkPolicyInternetAccessPolicyPb setAllowedInternetDestinations(
      Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
          allowedInternetDestinations) {
    this.allowedInternetDestinations = allowedInternetDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
      getAllowedInternetDestinations() {
    return allowedInternetDestinations;
  }

  public EgressNetworkPolicyInternetAccessPolicyPb setAllowedStorageDestinations(
      Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
          allowedStorageDestinations) {
    this.allowedStorageDestinations = allowedStorageDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
      getAllowedStorageDestinations() {
    return allowedStorageDestinations;
  }

  public EgressNetworkPolicyInternetAccessPolicyPb setLogOnlyMode(
      EgressNetworkPolicyInternetAccessPolicyLogOnlyMode logOnlyMode) {
    this.logOnlyMode = logOnlyMode;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode getLogOnlyMode() {
    return logOnlyMode;
  }

  public EgressNetworkPolicyInternetAccessPolicyPb setRestrictionMode(
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
    EgressNetworkPolicyInternetAccessPolicyPb that = (EgressNetworkPolicyInternetAccessPolicyPb) o;
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
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicyPb.class)
        .add("allowedInternetDestinations", allowedInternetDestinations)
        .add("allowedStorageDestinations", allowedStorageDestinations)
        .add("logOnlyMode", logOnlyMode)
        .add("restrictionMode", restrictionMode)
        .toString();
  }
}
