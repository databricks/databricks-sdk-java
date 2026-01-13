// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class ProjectStatus {
  /** The logical size limit for a branch. */
  @JsonProperty("branch_logical_size_limit_bytes")
  private Long branchLogicalSizeLimitBytes;

  /** The most recent time when any endpoint of this project was active. */
  @JsonProperty("compute_last_active_time")
  private Timestamp computeLastActiveTime;

  /** The effective default endpoint settings. */
  @JsonProperty("default_endpoint_settings")
  private ProjectDefaultEndpointSettings defaultEndpointSettings;

  /** The effective human-readable project name. */
  @JsonProperty("display_name")
  private String displayName;

  /** The effective number of seconds to retain the shared history for point in time recovery. */
  @JsonProperty("history_retention_duration")
  private Duration historyRetentionDuration;

  /** The email of the project owner. */
  @JsonProperty("owner")
  private String owner;

  /** The effective major Postgres version number. */
  @JsonProperty("pg_version")
  private Long pgVersion;

  /** The effective project settings. */
  @JsonProperty("settings")
  private ProjectSettings settings;

  /** The current space occupied by the project in storage. */
  @JsonProperty("synthetic_storage_size_bytes")
  private Long syntheticStorageSizeBytes;

  public ProjectStatus setBranchLogicalSizeLimitBytes(Long branchLogicalSizeLimitBytes) {
    this.branchLogicalSizeLimitBytes = branchLogicalSizeLimitBytes;
    return this;
  }

  public Long getBranchLogicalSizeLimitBytes() {
    return branchLogicalSizeLimitBytes;
  }

  public ProjectStatus setComputeLastActiveTime(Timestamp computeLastActiveTime) {
    this.computeLastActiveTime = computeLastActiveTime;
    return this;
  }

  public Timestamp getComputeLastActiveTime() {
    return computeLastActiveTime;
  }

  public ProjectStatus setDefaultEndpointSettings(
      ProjectDefaultEndpointSettings defaultEndpointSettings) {
    this.defaultEndpointSettings = defaultEndpointSettings;
    return this;
  }

  public ProjectDefaultEndpointSettings getDefaultEndpointSettings() {
    return defaultEndpointSettings;
  }

  public ProjectStatus setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ProjectStatus setHistoryRetentionDuration(Duration historyRetentionDuration) {
    this.historyRetentionDuration = historyRetentionDuration;
    return this;
  }

  public Duration getHistoryRetentionDuration() {
    return historyRetentionDuration;
  }

  public ProjectStatus setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ProjectStatus setPgVersion(Long pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public Long getPgVersion() {
    return pgVersion;
  }

  public ProjectStatus setSettings(ProjectSettings settings) {
    this.settings = settings;
    return this;
  }

  public ProjectSettings getSettings() {
    return settings;
  }

  public ProjectStatus setSyntheticStorageSizeBytes(Long syntheticStorageSizeBytes) {
    this.syntheticStorageSizeBytes = syntheticStorageSizeBytes;
    return this;
  }

  public Long getSyntheticStorageSizeBytes() {
    return syntheticStorageSizeBytes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProjectStatus that = (ProjectStatus) o;
    return Objects.equals(branchLogicalSizeLimitBytes, that.branchLogicalSizeLimitBytes)
        && Objects.equals(computeLastActiveTime, that.computeLastActiveTime)
        && Objects.equals(defaultEndpointSettings, that.defaultEndpointSettings)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(historyRetentionDuration, that.historyRetentionDuration)
        && Objects.equals(owner, that.owner)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(settings, that.settings)
        && Objects.equals(syntheticStorageSizeBytes, that.syntheticStorageSizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branchLogicalSizeLimitBytes,
        computeLastActiveTime,
        defaultEndpointSettings,
        displayName,
        historyRetentionDuration,
        owner,
        pgVersion,
        settings,
        syntheticStorageSizeBytes);
  }

  @Override
  public String toString() {
    return new ToStringer(ProjectStatus.class)
        .add("branchLogicalSizeLimitBytes", branchLogicalSizeLimitBytes)
        .add("computeLastActiveTime", computeLastActiveTime)
        .add("defaultEndpointSettings", defaultEndpointSettings)
        .add("displayName", displayName)
        .add("historyRetentionDuration", historyRetentionDuration)
        .add("owner", owner)
        .add("pgVersion", pgVersion)
        .add("settings", settings)
        .add("syntheticStorageSizeBytes", syntheticStorageSizeBytes)
        .toString();
  }
}
