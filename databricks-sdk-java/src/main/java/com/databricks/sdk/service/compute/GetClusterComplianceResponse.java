// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class GetClusterComplianceResponse {
  /**
   * Whether the cluster is compliant with its policy or not. Clusters could be out of compliance if
   * the policy was updated after the cluster was last edited.
   */
  @JsonProperty("is_compliant")
  private Boolean isCompliant;

  /**
   * Information about the pending enforcement for the cluster. Only present if a pending
   * enforcement is scheduled for the cluster.
   */
  @JsonProperty("pending_enforcement")
  private PendingEnforcement pendingEnforcement;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. The values indicate
   * an error message describing the policy validation error.
   */
  @JsonProperty("violations")
  private Map<String, String> violations;

  public GetClusterComplianceResponse setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public GetClusterComplianceResponse setPendingEnforcement(PendingEnforcement pendingEnforcement) {
    this.pendingEnforcement = pendingEnforcement;
    return this;
  }

  public PendingEnforcement getPendingEnforcement() {
    return pendingEnforcement;
  }

  public GetClusterComplianceResponse setViolations(Map<String, String> violations) {
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
    GetClusterComplianceResponse that = (GetClusterComplianceResponse) o;
    return Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(pendingEnforcement, that.pendingEnforcement)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompliant, pendingEnforcement, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterComplianceResponse.class)
        .add("isCompliant", isCompliant)
        .add("pendingEnforcement", pendingEnforcement)
        .add("violations", violations)
        .toString();
  }
}
