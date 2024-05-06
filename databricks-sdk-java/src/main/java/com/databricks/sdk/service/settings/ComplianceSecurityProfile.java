// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** SHIELD feature: CSP */
@Generated
public class ComplianceSecurityProfile {
  /** Set by customers when they request Compliance Security Profile (CSP) */
  @JsonProperty("compliance_standards")
  private Collection<ComplianceStandard> complianceStandards;

  /** */
  @JsonProperty("is_enabled")
  private Boolean isEnabled;

  public ComplianceSecurityProfile setComplianceStandards(
      Collection<ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Collection<ComplianceStandard> getComplianceStandards() {
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
