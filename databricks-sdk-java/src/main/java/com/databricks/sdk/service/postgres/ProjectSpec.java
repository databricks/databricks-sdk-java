// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ProjectSpec {
  /**
   * The desired budget policy to associate with the project. See status.budget_policy_id for the
   * policy that is actually applied to the project.
   */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /**
   * Custom tags to associate with the project. Forwarded to LBM for billing and cost tracking. To
   * update tags, provide the new tag list and include "spec.custom_tags" in the update_mask. To
   * clear all tags, provide an empty list and include "spec.custom_tags" in the update_mask. To
   * preserve existing tags, omit this field from the update_mask (or use wildcard "*" which
   * auto-excludes empty tags).
   */
  @JsonProperty("custom_tags")
  private Collection<ProjectCustomTag> customTags;

  /** */
  @JsonProperty("default_endpoint_settings")
  private ProjectDefaultEndpointSettings defaultEndpointSettings;

  /** Human-readable project name. Length should be between 1 and 256 characters. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * Whether to enable PG native password login on all endpoints in this project. Defaults to true.
   */
  @JsonProperty("enable_pg_native_login")
  private Boolean enablePgNativeLogin;

  /**
   * The number of seconds to retain the shared history for point in time recovery for all branches
   * in this project. Value should be between 0s and 2592000s (up to 30 days).
   */
  @JsonProperty("history_retention_duration")
  private Duration historyRetentionDuration;

  /** The major Postgres version number. Supported versions are 16 and 17. */
  @JsonProperty("pg_version")
  private Long pgVersion;

  public ProjectSpec setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public ProjectSpec setCustomTags(Collection<ProjectCustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<ProjectCustomTag> getCustomTags() {
    return customTags;
  }

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

  public ProjectSpec setEnablePgNativeLogin(Boolean enablePgNativeLogin) {
    this.enablePgNativeLogin = enablePgNativeLogin;
    return this;
  }

  public Boolean getEnablePgNativeLogin() {
    return enablePgNativeLogin;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProjectSpec that = (ProjectSpec) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(defaultEndpointSettings, that.defaultEndpointSettings)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(enablePgNativeLogin, that.enablePgNativeLogin)
        && Objects.equals(historyRetentionDuration, that.historyRetentionDuration)
        && Objects.equals(pgVersion, that.pgVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetPolicyId,
        customTags,
        defaultEndpointSettings,
        displayName,
        enablePgNativeLogin,
        historyRetentionDuration,
        pgVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(ProjectSpec.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("customTags", customTags)
        .add("defaultEndpointSettings", defaultEndpointSettings)
        .add("displayName", displayName)
        .add("enablePgNativeLogin", enablePgNativeLogin)
        .add("historyRetentionDuration", historyRetentionDuration)
        .add("pgVersion", pgVersion)
        .toString();
  }
}
