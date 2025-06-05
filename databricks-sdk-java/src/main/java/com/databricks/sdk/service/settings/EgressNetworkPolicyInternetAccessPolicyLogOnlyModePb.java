// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb {
  @JsonProperty("log_only_mode_type")
  private EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType logOnlyModeType;

  @JsonProperty("workloads")
  private Collection<EgressNetworkPolicyInternetAccessPolicyLogOnlyModeWorkloadType> workloads;

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb setLogOnlyModeType(
      EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType logOnlyModeType) {
    this.logOnlyModeType = logOnlyModeType;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType getLogOnlyModeType() {
    return logOnlyModeType;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb setWorkloads(
      Collection<EgressNetworkPolicyInternetAccessPolicyLogOnlyModeWorkloadType> workloads) {
    this.workloads = workloads;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyLogOnlyModeWorkloadType> getWorkloads() {
    return workloads;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb that =
        (EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb) o;
    return Objects.equals(logOnlyModeType, that.logOnlyModeType)
        && Objects.equals(workloads, that.workloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logOnlyModeType, workloads);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicyLogOnlyModePb.class)
        .add("logOnlyModeType", logOnlyModeType)
        .add("workloads", workloads)
        .toString();
  }
}
