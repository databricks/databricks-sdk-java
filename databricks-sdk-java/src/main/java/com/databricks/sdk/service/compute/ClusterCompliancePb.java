// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class ClusterCompliancePb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("is_compliant")
  private Boolean isCompliant;

  @JsonProperty("violations")
  private Map<String, String> violations;

  public ClusterCompliancePb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterCompliancePb setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public ClusterCompliancePb setViolations(Map<String, String> violations) {
    this.violations = violations;
    return this;
  }

  public Map<String, String> getViolations() {
    return violations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterCompliancePb that = (ClusterCompliancePb) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, isCompliant, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterCompliancePb.class)
        .add("clusterId", clusterId)
        .add("isCompliant", isCompliant)
        .add("violations", violations)
        .toString();
  }
}
