// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EnhancedSecurityMonitoringSettingPb {
  @JsonProperty("enhanced_security_monitoring_workspace")
  private EnhancedSecurityMonitoring enhancedSecurityMonitoringWorkspace;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public EnhancedSecurityMonitoringSettingPb setEnhancedSecurityMonitoringWorkspace(
      EnhancedSecurityMonitoring enhancedSecurityMonitoringWorkspace) {
    this.enhancedSecurityMonitoringWorkspace = enhancedSecurityMonitoringWorkspace;
    return this;
  }

  public EnhancedSecurityMonitoring getEnhancedSecurityMonitoringWorkspace() {
    return enhancedSecurityMonitoringWorkspace;
  }

  public EnhancedSecurityMonitoringSettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public EnhancedSecurityMonitoringSettingPb setSettingName(String settingName) {
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
    EnhancedSecurityMonitoringSettingPb that = (EnhancedSecurityMonitoringSettingPb) o;
    return Objects.equals(
            enhancedSecurityMonitoringWorkspace, that.enhancedSecurityMonitoringWorkspace)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedSecurityMonitoringWorkspace, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnhancedSecurityMonitoringSettingPb.class)
        .add("enhancedSecurityMonitoringWorkspace", enhancedSecurityMonitoringWorkspace)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
