// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EgressNetworkPolicyInternetAccessPolicyLogOnlyMode {
  /** */
  @JsonProperty("log_only_mode_type")
  private EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType logOnlyModeType;

  /** */
  @JsonProperty("workloads")
  private Collection<EgressNetworkPolicyInternetAccessPolicyLogOnlyModeWorkloadType> workloads;

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode setLogOnlyModeType(
      EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType logOnlyModeType) {
    this.logOnlyModeType = logOnlyModeType;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyModeLogOnlyModeType getLogOnlyModeType() {
    return logOnlyModeType;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode setWorkloads(
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
    EgressNetworkPolicyInternetAccessPolicyLogOnlyMode that =
        (EgressNetworkPolicyInternetAccessPolicyLogOnlyMode) o;
    return Objects.equals(logOnlyModeType, that.logOnlyModeType)
        && Objects.equals(workloads, that.workloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logOnlyModeType, workloads);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicyLogOnlyMode.class)
        .add("logOnlyModeType", logOnlyModeType)
        .add("workloads", workloads)
        .toString();
  }
}
