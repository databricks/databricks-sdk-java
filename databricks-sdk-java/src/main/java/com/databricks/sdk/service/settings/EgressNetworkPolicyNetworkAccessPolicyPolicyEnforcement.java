// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement {
  /**
   * When empty, it means dry run for all products. When non-empty, it means dry run for specific
   * products and for the other products, they will run in enforced mode.
   */
  @JsonProperty("dry_run_mode_product_filter")
  private Collection<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDryRunModeProductFilter>
      dryRunModeProductFilter;

  /**
   * The mode of policy enforcement. ENFORCED blocks traffic that violates policy, while DRY_RUN
   * only logs violations without blocking. When not specified, defaults to ENFORCED.
   */
  @JsonProperty("enforcement_mode")
  private EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementEnforcementMode enforcementMode;

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement setDryRunModeProductFilter(
      Collection<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDryRunModeProductFilter>
          dryRunModeProductFilter) {
    this.dryRunModeProductFilter = dryRunModeProductFilter;
    return this;
  }

  public Collection<EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementDryRunModeProductFilter>
      getDryRunModeProductFilter() {
    return dryRunModeProductFilter;
  }

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement setEnforcementMode(
      EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementEnforcementMode enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcementEnforcementMode
      getEnforcementMode() {
    return enforcementMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement that =
        (EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement) o;
    return Objects.equals(dryRunModeProductFilter, that.dryRunModeProductFilter)
        && Objects.equals(enforcementMode, that.enforcementMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRunModeProductFilter, enforcementMode);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement.class)
        .add("dryRunModeProductFilter", dryRunModeProductFilter)
        .add("enforcementMode", enforcementMode)
        .toString();
  }
}
