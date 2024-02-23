// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Contains an information about the enablement status judging (e.g. whether the enterprise tier is
 * enabled) This is only additional information that MUST NOT be used to decide whether the setting
 * is enabled or not. This is intended to use only for purposes like showing an error message to the
 * customer with the additional details. For example, using these details we can check why exactly
 * the feature is disabled for this customer.
 */
@Generated
public class ClusterAutoRestartMessageEnablementDetails {
  /** The feature is force enabled if compliance mode is active */
  @JsonProperty("forced_for_compliance_mode")
  private Boolean forcedForComplianceMode;

  /**
   * The feature is unavailable if the corresponding entitlement disabled (see
   * getShieldEntitlementEnable)
   */
  @JsonProperty("unavailable_for_disabled_entitlement")
  private Boolean unavailableForDisabledEntitlement;

  /** The feature is unavailable if the customer doesn't have enterprise tier */
  @JsonProperty("unavailable_for_non_enterprise_tier")
  private Boolean unavailableForNonEnterpriseTier;

  public ClusterAutoRestartMessageEnablementDetails setForcedForComplianceMode(
      Boolean forcedForComplianceMode) {
    this.forcedForComplianceMode = forcedForComplianceMode;
    return this;
  }

  public Boolean getForcedForComplianceMode() {
    return forcedForComplianceMode;
  }

  public ClusterAutoRestartMessageEnablementDetails setUnavailableForDisabledEntitlement(
      Boolean unavailableForDisabledEntitlement) {
    this.unavailableForDisabledEntitlement = unavailableForDisabledEntitlement;
    return this;
  }

  public Boolean getUnavailableForDisabledEntitlement() {
    return unavailableForDisabledEntitlement;
  }

  public ClusterAutoRestartMessageEnablementDetails setUnavailableForNonEnterpriseTier(
      Boolean unavailableForNonEnterpriseTier) {
    this.unavailableForNonEnterpriseTier = unavailableForNonEnterpriseTier;
    return this;
  }

  public Boolean getUnavailableForNonEnterpriseTier() {
    return unavailableForNonEnterpriseTier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageEnablementDetails that =
        (ClusterAutoRestartMessageEnablementDetails) o;
    return Objects.equals(forcedForComplianceMode, that.forcedForComplianceMode)
        && Objects.equals(unavailableForDisabledEntitlement, that.unavailableForDisabledEntitlement)
        && Objects.equals(unavailableForNonEnterpriseTier, that.unavailableForNonEnterpriseTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        forcedForComplianceMode,
        unavailableForDisabledEntitlement,
        unavailableForNonEnterpriseTier);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageEnablementDetails.class)
        .add("forcedForComplianceMode", forcedForComplianceMode)
        .add("unavailableForDisabledEntitlement", unavailableForDisabledEntitlement)
        .add("unavailableForNonEnterpriseTier", unavailableForNonEnterpriseTier)
        .toString();
  }
}
