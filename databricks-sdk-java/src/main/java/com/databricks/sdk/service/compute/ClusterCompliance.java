// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class ClusterCompliance {
  /** Canonical unique identifier for a cluster. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** Whether this cluster is in compliance with the latest version of its policy. */
  @JsonProperty("is_compliant")
  private Boolean isCompliant;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. The values indicate
   * an error message describing the policy validation error.
   */
  @JsonProperty("violations")
  private Map<String, String> violations;

  public ClusterCompliance setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterCompliance setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public ClusterCompliance setViolations(Map<String, String> violations) {
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
    ClusterCompliance that = (ClusterCompliance) o;
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
    return new ToStringer(ClusterCompliance.class)
        .add("clusterId", clusterId)
        .add("isCompliant", isCompliant)
        .add("violations", violations)
        .toString();
  }
}
