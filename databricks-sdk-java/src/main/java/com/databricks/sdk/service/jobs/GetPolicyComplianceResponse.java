// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class GetPolicyComplianceResponse {
  /**
   * Whether the job is compliant with its policies or not. Jobs could be out of compliance if a
   * policy they are using was updated after the job was last edited and some of its job clusters no
   * longer comply with their updated policies.
   */
  @JsonProperty("is_compliant")
  private Boolean isCompliant;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. An identifier for
   * the job cluster is prepended to the path. The values indicate an error message describing the
   * policy validation error.
   */
  @JsonProperty("violations")
  private Map<String, String> violations;

  public GetPolicyComplianceResponse setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public GetPolicyComplianceResponse setViolations(Map<String, String> violations) {
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
    GetPolicyComplianceResponse that = (GetPolicyComplianceResponse) o;
    return Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompliant, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPolicyComplianceResponse.class)
        .add("isCompliant", isCompliant)
        .add("violations", violations)
        .toString();
  }
}
