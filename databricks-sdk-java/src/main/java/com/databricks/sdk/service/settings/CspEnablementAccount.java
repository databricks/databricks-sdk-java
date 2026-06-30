// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Account level policy for CSP */
@Generated
public class CspEnablementAccount {
  /**
   * Set by customers when they request Compliance Security Profile (CSP) Invariants are enforced in
   * Settings policy.
   */
  @JsonProperty("compliance_standards")
  private Collection<ComplianceStandard> complianceStandards;

  /** Enforced = it cannot be overriden at workspace level. */
  @JsonProperty("is_enforced")
  private Boolean isEnforced;

  public CspEnablementAccount setComplianceStandards(
      Collection<ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Collection<ComplianceStandard> getComplianceStandards() {
    return complianceStandards;
  }

  public CspEnablementAccount setIsEnforced(Boolean isEnforced) {
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
    CspEnablementAccount that = (CspEnablementAccount) o;
    return Objects.equals(complianceStandards, that.complianceStandards)
        && Objects.equals(isEnforced, that.isEnforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceStandards, isEnforced);
  }

  @Override
  public String toString() {
    return new ToStringer(CspEnablementAccount.class)
        .add("complianceStandards", complianceStandards)
        .add("isEnforced", isEnforced)
        .toString();
  }
}
