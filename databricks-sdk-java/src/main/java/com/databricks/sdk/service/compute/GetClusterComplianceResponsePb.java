// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class GetClusterComplianceResponsePb {
  @JsonProperty("is_compliant")
  private Boolean isCompliant;

  @JsonProperty("violations")
  private Map<String, String> violations;

  public GetClusterComplianceResponsePb setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public GetClusterComplianceResponsePb setViolations(Map<String, String> violations) {
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
    GetClusterComplianceResponsePb that = (GetClusterComplianceResponsePb) o;
    return Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompliant, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterComplianceResponsePb.class)
        .add("isCompliant", isCompliant)
        .add("violations", violations)
        .toString();
  }
}
