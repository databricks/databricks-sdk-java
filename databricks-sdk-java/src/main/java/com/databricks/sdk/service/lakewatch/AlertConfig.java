// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Per-catalog alert-related config. Singleton. Name format: `catalogs/{catalog}/alertConfig`. */
@Generated
public class AlertConfig {
  /**
   * Window for collating Signals into security alerts. Duration string — compact
   * day/hour/minute/second components, e.g. `1d`, `12h` (see `Schedule.at_least_every` in
   * common.proto for the grammar). Reads return the value as supplied. When unset or empty, the
   * window is `1h`; the window in effect is reported in
   * `effective_default_security_alert_collation_window`.
   */
  @JsonProperty("default_security_alert_collation_window")
  private String defaultSecurityAlertCollationWindow;

  /**
   * Window for collating SystemEvents into system alerts. Duration string — compact
   * day/hour/minute/second components, e.g. `1d`, `12h` (see `Schedule.at_least_every` in
   * common.proto for the grammar). Reads return the value as supplied. When unset or empty, the
   * window is `1d`; the window in effect is reported in
   * `effective_default_system_alert_collation_window`.
   */
  @JsonProperty("default_system_alert_collation_window")
  private String defaultSystemAlertCollationWindow;

  /**
   * The security alert collation window in effect: `default_security_alert_collation_window` when
   * set, otherwise `1h`.
   */
  @JsonProperty("effective_default_security_alert_collation_window")
  private String effectiveDefaultSecurityAlertCollationWindow;

  /**
   * The system alert collation window in effect: `default_system_alert_collation_window` when set,
   * otherwise `1d`.
   */
  @JsonProperty("effective_default_system_alert_collation_window")
  private String effectiveDefaultSystemAlertCollationWindow;

  /**
   * Opaque entity tag for optimistic concurrency. Returned on every read; pass it back as the
   * Update request's `etag` to make the update conditional on the resource being unchanged.
   */
  @JsonProperty("etag")
  private String etag;

  /** */
  @JsonProperty("name")
  private String name;

  /**
   * Export destination for security alerts. When unset, export is off and reads return `{"enabled":
   * false}`.
   */
  @JsonProperty("security_alert_export_config")
  private ExportConfig securityAlertExportConfig;

  /**
   * Export destination for system alerts. When unset, export is off and reads return `{"enabled":
   * false}`.
   */
  @JsonProperty("system_alert_export_config")
  private ExportConfig systemAlertExportConfig;

  /** */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** */
  @JsonProperty("updated_by")
  private Principal updatedBy;

  /**
   * Monotonic version, bumped on each update. Informational; use `etag` for optimistic concurrency.
   */
  @JsonProperty("version")
  private Long version;

  public AlertConfig setDefaultSecurityAlertCollationWindow(
      String defaultSecurityAlertCollationWindow) {
    this.defaultSecurityAlertCollationWindow = defaultSecurityAlertCollationWindow;
    return this;
  }

  public String getDefaultSecurityAlertCollationWindow() {
    return defaultSecurityAlertCollationWindow;
  }

  public AlertConfig setDefaultSystemAlertCollationWindow(
      String defaultSystemAlertCollationWindow) {
    this.defaultSystemAlertCollationWindow = defaultSystemAlertCollationWindow;
    return this;
  }

  public String getDefaultSystemAlertCollationWindow() {
    return defaultSystemAlertCollationWindow;
  }

  public AlertConfig setEffectiveDefaultSecurityAlertCollationWindow(
      String effectiveDefaultSecurityAlertCollationWindow) {
    this.effectiveDefaultSecurityAlertCollationWindow =
        effectiveDefaultSecurityAlertCollationWindow;
    return this;
  }

  public String getEffectiveDefaultSecurityAlertCollationWindow() {
    return effectiveDefaultSecurityAlertCollationWindow;
  }

  public AlertConfig setEffectiveDefaultSystemAlertCollationWindow(
      String effectiveDefaultSystemAlertCollationWindow) {
    this.effectiveDefaultSystemAlertCollationWindow = effectiveDefaultSystemAlertCollationWindow;
    return this;
  }

  public String getEffectiveDefaultSystemAlertCollationWindow() {
    return effectiveDefaultSystemAlertCollationWindow;
  }

  public AlertConfig setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public AlertConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AlertConfig setSecurityAlertExportConfig(ExportConfig securityAlertExportConfig) {
    this.securityAlertExportConfig = securityAlertExportConfig;
    return this;
  }

  public ExportConfig getSecurityAlertExportConfig() {
    return securityAlertExportConfig;
  }

  public AlertConfig setSystemAlertExportConfig(ExportConfig systemAlertExportConfig) {
    this.systemAlertExportConfig = systemAlertExportConfig;
    return this;
  }

  public ExportConfig getSystemAlertExportConfig() {
    return systemAlertExportConfig;
  }

  public AlertConfig setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public AlertConfig setUpdatedBy(Principal updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Principal getUpdatedBy() {
    return updatedBy;
  }

  public AlertConfig setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertConfig that = (AlertConfig) o;
    return Objects.equals(
            defaultSecurityAlertCollationWindow, that.defaultSecurityAlertCollationWindow)
        && Objects.equals(defaultSystemAlertCollationWindow, that.defaultSystemAlertCollationWindow)
        && Objects.equals(
            effectiveDefaultSecurityAlertCollationWindow,
            that.effectiveDefaultSecurityAlertCollationWindow)
        && Objects.equals(
            effectiveDefaultSystemAlertCollationWindow,
            that.effectiveDefaultSystemAlertCollationWindow)
        && Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(securityAlertExportConfig, that.securityAlertExportConfig)
        && Objects.equals(systemAlertExportConfig, that.systemAlertExportConfig)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        defaultSecurityAlertCollationWindow,
        defaultSystemAlertCollationWindow,
        effectiveDefaultSecurityAlertCollationWindow,
        effectiveDefaultSystemAlertCollationWindow,
        etag,
        name,
        securityAlertExportConfig,
        systemAlertExportConfig,
        updateTime,
        updatedBy,
        version);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertConfig.class)
        .add("defaultSecurityAlertCollationWindow", defaultSecurityAlertCollationWindow)
        .add("defaultSystemAlertCollationWindow", defaultSystemAlertCollationWindow)
        .add(
            "effectiveDefaultSecurityAlertCollationWindow",
            effectiveDefaultSecurityAlertCollationWindow)
        .add(
            "effectiveDefaultSystemAlertCollationWindow",
            effectiveDefaultSystemAlertCollationWindow)
        .add("etag", etag)
        .add("name", name)
        .add("securityAlertExportConfig", securityAlertExportConfig)
        .add("systemAlertExportConfig", systemAlertExportConfig)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("version", version)
        .toString();
  }
}
