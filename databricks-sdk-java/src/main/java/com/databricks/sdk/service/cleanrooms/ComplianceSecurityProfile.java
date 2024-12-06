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
public class ComplianceSecurityProfile {
  /**
   * The list of compliance standards that the compliance security profile is configured to enforce.
   */
  @JsonProperty("compliance_standards")
  private Collection<com.databricks.sdk.service.settings.ComplianceStandard> complianceStandards;

  /** Whether the compliance security profile is enabled. */
  @JsonProperty("is_enabled")
  private Boolean isEnabled;

  public ComplianceSecurityProfile setComplianceStandards(
      Collection<com.databricks.sdk.service.settings.ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Collection<com.databricks.sdk.service.settings.ComplianceStandard>
      getComplianceStandards() {
    return complianceStandards;
  }

  public ComplianceSecurityProfile setIsEnabled(Boolean isEnabled) {
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
    ComplianceSecurityProfile that = (ComplianceSecurityProfile) o;
    return Objects.equals(complianceStandards, that.complianceStandards)
        && Objects.equals(isEnabled, that.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceStandards, isEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(ComplianceSecurityProfile.class)
        .add("complianceStandards", complianceStandards)
        .add("isEnabled", isEnabled)
        .toString();
  }
}
