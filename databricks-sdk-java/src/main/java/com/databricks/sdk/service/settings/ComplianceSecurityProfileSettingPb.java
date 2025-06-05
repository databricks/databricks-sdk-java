// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ComplianceSecurityProfileSettingPb {
  @JsonProperty("compliance_security_profile_workspace")
  private ComplianceSecurityProfile complianceSecurityProfileWorkspace;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public ComplianceSecurityProfileSettingPb setComplianceSecurityProfileWorkspace(
      ComplianceSecurityProfile complianceSecurityProfileWorkspace) {
    this.complianceSecurityProfileWorkspace = complianceSecurityProfileWorkspace;
    return this;
  }

  public ComplianceSecurityProfile getComplianceSecurityProfileWorkspace() {
    return complianceSecurityProfileWorkspace;
  }

  public ComplianceSecurityProfileSettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public ComplianceSecurityProfileSettingPb setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComplianceSecurityProfileSettingPb that = (ComplianceSecurityProfileSettingPb) o;
    return Objects.equals(
            complianceSecurityProfileWorkspace, that.complianceSecurityProfileWorkspace)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceSecurityProfileWorkspace, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(ComplianceSecurityProfileSettingPb.class)
        .add("complianceSecurityProfileWorkspace", complianceSecurityProfileWorkspace)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
