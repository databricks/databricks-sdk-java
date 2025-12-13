// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class Project {
  /** The logical size limit for a branch. */
  @JsonProperty("branch_logical_size_limit_bytes")
  private Long branchLogicalSizeLimitBytes;

  /** The most recent time when any endpoint of this project was active. */
  @JsonProperty("compute_last_active_time")
  private Timestamp computeLastActiveTime;

  /** A timestamp indicating when the project was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** */
  @JsonProperty("default_endpoint_settings")
  private ProjectDefaultEndpointSettings defaultEndpointSettings;

  /** Human-readable project name. */
  @JsonProperty("display_name")
  private String displayName;

  /** */
  @JsonProperty("effective_default_endpoint_settings")
  private ProjectDefaultEndpointSettings effectiveDefaultEndpointSettings;

  /** */
  @JsonProperty("effective_display_name")
  private String effectiveDisplayName;

  /** */
  @JsonProperty("effective_history_retention_duration")
  private Duration effectiveHistoryRetentionDuration;

  /** */
  @JsonProperty("effective_pg_version")
  private Long effectivePgVersion;

  /** */
  @JsonProperty("effective_settings")
  private ProjectSettings effectiveSettings;

  /**
   * The number of seconds to retain the shared history for point in time recovery for all branches
   * in this project.
   */
  @JsonProperty("history_retention_duration")
  private Duration historyRetentionDuration;

  /** The resource name of the project. Format: projects/{project_id} */
  @JsonProperty("name")
  private String name;

  /** The major Postgres version number. */
  @JsonProperty("pg_version")
  private Long pgVersion;

  /** */
  @JsonProperty("settings")
  private ProjectSettings settings;

  /**
   * The current space occupied by the project in storage. Synthetic storage size combines the
   * logical data size and Write-Ahead Log (WAL) size for all branches in a project.
   */
  @JsonProperty("synthetic_storage_size_bytes")
  private Long syntheticStorageSizeBytes;

  /** System generated unique ID for the project. */
  @JsonProperty("uid")
  private String uid;

  /** A timestamp indicating when the project was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Project setBranchLogicalSizeLimitBytes(Long branchLogicalSizeLimitBytes) {
    this.branchLogicalSizeLimitBytes = branchLogicalSizeLimitBytes;
    return this;
  }

  public Long getBranchLogicalSizeLimitBytes() {
    return branchLogicalSizeLimitBytes;
  }

  public Project setComputeLastActiveTime(Timestamp computeLastActiveTime) {
    this.computeLastActiveTime = computeLastActiveTime;
    return this;
  }

  public Timestamp getComputeLastActiveTime() {
    return computeLastActiveTime;
  }

  public Project setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Project setDefaultEndpointSettings(
      ProjectDefaultEndpointSettings defaultEndpointSettings) {
    this.defaultEndpointSettings = defaultEndpointSettings;
    return this;
  }

  public ProjectDefaultEndpointSettings getDefaultEndpointSettings() {
    return defaultEndpointSettings;
  }

  public Project setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Project setEffectiveDefaultEndpointSettings(
      ProjectDefaultEndpointSettings effectiveDefaultEndpointSettings) {
    this.effectiveDefaultEndpointSettings = effectiveDefaultEndpointSettings;
    return this;
  }

  public ProjectDefaultEndpointSettings getEffectiveDefaultEndpointSettings() {
    return effectiveDefaultEndpointSettings;
  }

  public Project setEffectiveDisplayName(String effectiveDisplayName) {
    this.effectiveDisplayName = effectiveDisplayName;
    return this;
  }

  public String getEffectiveDisplayName() {
    return effectiveDisplayName;
  }

  public Project setEffectiveHistoryRetentionDuration(Duration effectiveHistoryRetentionDuration) {
    this.effectiveHistoryRetentionDuration = effectiveHistoryRetentionDuration;
    return this;
  }

  public Duration getEffectiveHistoryRetentionDuration() {
    return effectiveHistoryRetentionDuration;
  }

  public Project setEffectivePgVersion(Long effectivePgVersion) {
    this.effectivePgVersion = effectivePgVersion;
    return this;
  }

  public Long getEffectivePgVersion() {
    return effectivePgVersion;
  }

  public Project setEffectiveSettings(ProjectSettings effectiveSettings) {
    this.effectiveSettings = effectiveSettings;
    return this;
  }

  public ProjectSettings getEffectiveSettings() {
    return effectiveSettings;
  }

  public Project setHistoryRetentionDuration(Duration historyRetentionDuration) {
    this.historyRetentionDuration = historyRetentionDuration;
    return this;
  }

  public Duration getHistoryRetentionDuration() {
    return historyRetentionDuration;
  }

  public Project setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Project setPgVersion(Long pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public Long getPgVersion() {
    return pgVersion;
  }

  public Project setSettings(ProjectSettings settings) {
    this.settings = settings;
    return this;
  }

  public ProjectSettings getSettings() {
    return settings;
  }

  public Project setSyntheticStorageSizeBytes(Long syntheticStorageSizeBytes) {
    this.syntheticStorageSizeBytes = syntheticStorageSizeBytes;
    return this;
  }

  public Long getSyntheticStorageSizeBytes() {
    return syntheticStorageSizeBytes;
  }

  public Project setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public Project setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Project that = (Project) o;
    return Objects.equals(branchLogicalSizeLimitBytes, that.branchLogicalSizeLimitBytes)
        && Objects.equals(computeLastActiveTime, that.computeLastActiveTime)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(defaultEndpointSettings, that.defaultEndpointSettings)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(effectiveDefaultEndpointSettings, that.effectiveDefaultEndpointSettings)
        && Objects.equals(effectiveDisplayName, that.effectiveDisplayName)
        && Objects.equals(effectiveHistoryRetentionDuration, that.effectiveHistoryRetentionDuration)
        && Objects.equals(effectivePgVersion, that.effectivePgVersion)
        && Objects.equals(effectiveSettings, that.effectiveSettings)
        && Objects.equals(historyRetentionDuration, that.historyRetentionDuration)
        && Objects.equals(name, that.name)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(settings, that.settings)
        && Objects.equals(syntheticStorageSizeBytes, that.syntheticStorageSizeBytes)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branchLogicalSizeLimitBytes,
        computeLastActiveTime,
        createTime,
        defaultEndpointSettings,
        displayName,
        effectiveDefaultEndpointSettings,
        effectiveDisplayName,
        effectiveHistoryRetentionDuration,
        effectivePgVersion,
        effectiveSettings,
        historyRetentionDuration,
        name,
        pgVersion,
        settings,
        syntheticStorageSizeBytes,
        uid,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Project.class)
        .add("branchLogicalSizeLimitBytes", branchLogicalSizeLimitBytes)
        .add("computeLastActiveTime", computeLastActiveTime)
        .add("createTime", createTime)
        .add("defaultEndpointSettings", defaultEndpointSettings)
        .add("displayName", displayName)
        .add("effectiveDefaultEndpointSettings", effectiveDefaultEndpointSettings)
        .add("effectiveDisplayName", effectiveDisplayName)
        .add("effectiveHistoryRetentionDuration", effectiveHistoryRetentionDuration)
        .add("effectivePgVersion", effectivePgVersion)
        .add("effectiveSettings", effectiveSettings)
        .add("historyRetentionDuration", historyRetentionDuration)
        .add("name", name)
        .add("pgVersion", pgVersion)
        .add("settings", settings)
        .add("syntheticStorageSizeBytes", syntheticStorageSizeBytes)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
