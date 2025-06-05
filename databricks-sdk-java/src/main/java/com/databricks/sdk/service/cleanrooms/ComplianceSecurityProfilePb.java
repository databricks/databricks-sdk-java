// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The compliance security profile used to process regulated data following compliance standards.
 */
@Generated
class ComplianceSecurityProfilePb {
  @JsonProperty("compliance_standards")
  private Collection<com.databricks.sdk.service.settings.ComplianceStandard> complianceStandards;

  @JsonProperty("is_enabled")
  private Boolean isEnabled;

  public ComplianceSecurityProfilePb setComplianceStandards(
      Collection<com.databricks.sdk.service.settings.ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Collection<com.databricks.sdk.service.settings.ComplianceStandard>
      getComplianceStandards() {
    return complianceStandards;
  }

  public ComplianceSecurityProfilePb setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  public Boolean getIsEnabled() {
    return isEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComplianceSecurityProfilePb that = (ComplianceSecurityProfilePb) o;
    return Objects.equals(complianceStandards, that.complianceStandards)
        && Objects.equals(isEnabled, that.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceStandards, isEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(ComplianceSecurityProfilePb.class)
        .add("complianceStandards", complianceStandards)
        .add("isEnabled", isEnabled)
        .toString();
  }
}
