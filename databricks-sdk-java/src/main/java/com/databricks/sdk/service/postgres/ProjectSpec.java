// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

@Generated
public class ProjectSpec {
  /** */
  @JsonProperty("default_endpoint_settings")
  private ProjectDefaultEndpointSettings defaultEndpointSettings;

  /** Human-readable project name. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The number of seconds to retain the shared history for point in time recovery for all branches
   * in this project.
   */
  @JsonProperty("history_retention_duration")
  private Duration historyRetentionDuration;

  /** The major Postgres version number. */
  @JsonProperty("pg_version")
  private Long pgVersion;

  /** */
  @JsonProperty("settings")
  private ProjectSettings settings;

  public ProjectSpec setDefaultEndpointSettings(
      ProjectDefaultEndpointSettings defaultEndpointSettings) {
    this.defaultEndpointSettings = defaultEndpointSettings;
    return this;
  }

  public ProjectDefaultEndpointSettings getDefaultEndpointSettings() {
    return defaultEndpointSettings;
  }

  public ProjectSpec setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ProjectSpec setHistoryRetentionDuration(Duration historyRetentionDuration) {
    this.historyRetentionDuration = historyRetentionDuration;
    return this;
  }

  public Duration getHistoryRetentionDuration() {
    return historyRetentionDuration;
  }

  public ProjectSpec setPgVersion(Long pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public Long getPgVersion() {
    return pgVersion;
  }

  public ProjectSpec setSettings(ProjectSettings settings) {
    this.settings = settings;
    return this;
  }

  public ProjectSettings getSettings() {
    return settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProjectSpec that = (ProjectSpec) o;
    return Objects.equals(defaultEndpointSettings, that.defaultEndpointSettings)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(historyRetentionDuration, that.historyRetentionDuration)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        defaultEndpointSettings, displayName, historyRetentionDuration, pgVersion, settings);
  }

  @Override
  public String toString() {
    return new ToStringer(ProjectSpec.class)
        .add("defaultEndpointSettings", defaultEndpointSettings)
        .add("displayName", displayName)
        .add("historyRetentionDuration", historyRetentionDuration)
        .add("pgVersion", pgVersion)
        .add("settings", settings)
        .toString();
  }
}
