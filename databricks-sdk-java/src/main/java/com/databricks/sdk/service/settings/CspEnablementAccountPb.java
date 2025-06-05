// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Account level policy for CSP */
@Generated
class CspEnablementAccountPb {
  @JsonProperty("compliance_standards")
  private Collection<ComplianceStandard> complianceStandards;

  @JsonProperty("is_enforced")
  private Boolean isEnforced;

  public CspEnablementAccountPb setComplianceStandards(
      Collection<ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Collection<ComplianceStandard> getComplianceStandards() {
    return complianceStandards;
  }

  public CspEnablementAccountPb setIsEnforced(Boolean isEnforced) {
    this.isEnforced = isEnforced;
    return this;
  }

  public Boolean getIsEnforced() {
    return isEnforced;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CspEnablementAccountPb that = (CspEnablementAccountPb) o;
    return Objects.equals(complianceStandards, that.complianceStandards)
        && Objects.equals(isEnforced, that.isEnforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceStandards, isEnforced);
  }

  @Override
  public String toString() {
    return new ToStringer(CspEnablementAccountPb.class)
        .add("complianceStandards", complianceStandards)
        .add("isEnforced", isEnforced)
        .toString();
  }
}
