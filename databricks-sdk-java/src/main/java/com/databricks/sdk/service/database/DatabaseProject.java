// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DatabaseProject {
  /** The logical size limit for a branch. */
  @JsonProperty("branch_logical_size_limit_bytes")
  private Long branchLogicalSizeLimitBytes;

  /**
   * The desired budget policy to associate with the instance. This field is only returned on
   * create/update responses, and represents the customer provided budget policy. See
   * effective_budget_policy_id for the policy that is actually applied to the instance.
   */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** The most recent time when any endpoint of this project was active. */
  @JsonProperty("compute_last_active_time")
  private String computeLastActiveTime;

  /** A timestamp indicating when the project was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** Custom tags associated with the instance. */
  @JsonProperty("custom_tags")
  private Collection<DatabaseProjectCustomTag> customTags;

  /** */
  @JsonProperty("default_endpoint_settings")
  private DatabaseProjectDefaultEndpointSettings defaultEndpointSettings;

  /** Human-readable project name. */
  @JsonProperty("display_name")
  private String displayName;

  /** The policy that is applied to the instance. */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  /** */
  @JsonProperty("effective_default_endpoint_settings")
  private DatabaseProjectDefaultEndpointSettings effectiveDefaultEndpointSettings;

  /** */
  @JsonProperty("effective_display_name")
  private String effectiveDisplayName;

  /** */
  @JsonProperty("effective_history_retention_duration")
  private String effectiveHistoryRetentionDuration;

  /** */
  @JsonProperty("effective_pg_version")
  private Long effectivePgVersion;

  /** */
  @JsonProperty("effective_settings")
  private DatabaseProjectSettings effectiveSettings;

  /**
   * The number of seconds to retain the shared history for point in time recovery for all branches
   * in this project.
   */
  @JsonProperty("history_retention_duration")
  private String historyRetentionDuration;

  /** The major Postgres version number. */
  @JsonProperty("pg_version")
  private Long pgVersion;

  /** */
  @JsonProperty("project_id")
  private String projectId;

  /** */
  @JsonProperty("settings")
  private DatabaseProjectSettings settings;

  /**
   * The current space occupied by the project in storage. Synthetic storage size combines the
   * logical data size and Write-Ahead Log (WAL) size for all branches in a project.
   */
  @JsonProperty("synthetic_storage_size_bytes")
  private Long syntheticStorageSizeBytes;

  /** A timestamp indicating when the project was last updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public DatabaseProject setBranchLogicalSizeLimitBytes(Long branchLogicalSizeLimitBytes) {
    this.branchLogicalSizeLimitBytes = branchLogicalSizeLimitBytes;
    return this;
  }

  public Long getBranchLogicalSizeLimitBytes() {
    return branchLogicalSizeLimitBytes;
  }

  public DatabaseProject setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public DatabaseProject setComputeLastActiveTime(String computeLastActiveTime) {
    this.computeLastActiveTime = computeLastActiveTime;
    return this;
  }

  public String getComputeLastActiveTime() {
    return computeLastActiveTime;
  }

  public DatabaseProject setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public DatabaseProject setCustomTags(Collection<DatabaseProjectCustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<DatabaseProjectCustomTag> getCustomTags() {
    return customTags;
  }

  public DatabaseProject setDefaultEndpointSettings(
      DatabaseProjectDefaultEndpointSettings defaultEndpointSettings) {
    this.defaultEndpointSettings = defaultEndpointSettings;
    return this;
  }

  public DatabaseProjectDefaultEndpointSettings getDefaultEndpointSettings() {
    return defaultEndpointSettings;
  }

  public DatabaseProject setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public DatabaseProject setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public DatabaseProject setEffectiveDefaultEndpointSettings(
      DatabaseProjectDefaultEndpointSettings effectiveDefaultEndpointSettings) {
    this.effectiveDefaultEndpointSettings = effectiveDefaultEndpointSettings;
    return this;
  }

  public DatabaseProjectDefaultEndpointSettings getEffectiveDefaultEndpointSettings() {
    return effectiveDefaultEndpointSettings;
  }

  public DatabaseProject setEffectiveDisplayName(String effectiveDisplayName) {
    this.effectiveDisplayName = effectiveDisplayName;
    return this;
  }

  public String getEffectiveDisplayName() {
    return effectiveDisplayName;
  }

  public DatabaseProject setEffectiveHistoryRetentionDuration(
      String effectiveHistoryRetentionDuration) {
    this.effectiveHistoryRetentionDuration = effectiveHistoryRetentionDuration;
    return this;
  }

  public String getEffectiveHistoryRetentionDuration() {
    return effectiveHistoryRetentionDuration;
  }

  public DatabaseProject setEffectivePgVersion(Long effectivePgVersion) {
    this.effectivePgVersion = effectivePgVersion;
    return this;
  }

  public Long getEffectivePgVersion() {
    return effectivePgVersion;
  }

  public DatabaseProject setEffectiveSettings(DatabaseProjectSettings effectiveSettings) {
    this.effectiveSettings = effectiveSettings;
    return this;
  }

  public DatabaseProjectSettings getEffectiveSettings() {
    return effectiveSettings;
  }

  public DatabaseProject setHistoryRetentionDuration(String historyRetentionDuration) {
    this.historyRetentionDuration = historyRetentionDuration;
    return this;
  }

  public String getHistoryRetentionDuration() {
    return historyRetentionDuration;
  }

  public DatabaseProject setPgVersion(Long pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public Long getPgVersion() {
    return pgVersion;
  }

  public DatabaseProject setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public DatabaseProject setSettings(DatabaseProjectSettings settings) {
    this.settings = settings;
    return this;
  }

  public DatabaseProjectSettings getSettings() {
    return settings;
  }

  public DatabaseProject setSyntheticStorageSizeBytes(Long syntheticStorageSizeBytes) {
    this.syntheticStorageSizeBytes = syntheticStorageSizeBytes;
    return this;
  }

  public Long getSyntheticStorageSizeBytes() {
    return syntheticStorageSizeBytes;
  }

  public DatabaseProject setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseProject that = (DatabaseProject) o;
    return Objects.equals(branchLogicalSizeLimitBytes, that.branchLogicalSizeLimitBytes)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(computeLastActiveTime, that.computeLastActiveTime)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(defaultEndpointSettings, that.defaultEndpointSettings)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(effectiveDefaultEndpointSettings, that.effectiveDefaultEndpointSettings)
        && Objects.equals(effectiveDisplayName, that.effectiveDisplayName)
        && Objects.equals(effectiveHistoryRetentionDuration, that.effectiveHistoryRetentionDuration)
        && Objects.equals(effectivePgVersion, that.effectivePgVersion)
        && Objects.equals(effectiveSettings, that.effectiveSettings)
        && Objects.equals(historyRetentionDuration, that.historyRetentionDuration)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(settings, that.settings)
        && Objects.equals(syntheticStorageSizeBytes, that.syntheticStorageSizeBytes)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branchLogicalSizeLimitBytes,
        budgetPolicyId,
        computeLastActiveTime,
        createTime,
        customTags,
        defaultEndpointSettings,
        displayName,
        effectiveBudgetPolicyId,
        effectiveDefaultEndpointSettings,
        effectiveDisplayName,
        effectiveHistoryRetentionDuration,
        effectivePgVersion,
        effectiveSettings,
        historyRetentionDuration,
        pgVersion,
        projectId,
        settings,
        syntheticStorageSizeBytes,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseProject.class)
        .add("branchLogicalSizeLimitBytes", branchLogicalSizeLimitBytes)
        .add("budgetPolicyId", budgetPolicyId)
        .add("computeLastActiveTime", computeLastActiveTime)
        .add("createTime", createTime)
        .add("customTags", customTags)
        .add("defaultEndpointSettings", defaultEndpointSettings)
        .add("displayName", displayName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("effectiveDefaultEndpointSettings", effectiveDefaultEndpointSettings)
        .add("effectiveDisplayName", effectiveDisplayName)
        .add("effectiveHistoryRetentionDuration", effectiveHistoryRetentionDuration)
        .add("effectivePgVersion", effectivePgVersion)
        .add("effectiveSettings", effectiveSettings)
        .add("historyRetentionDuration", historyRetentionDuration)
        .add("pgVersion", pgVersion)
        .add("projectId", projectId)
        .add("settings", settings)
        .add("syntheticStorageSizeBytes", syntheticStorageSizeBytes)
        .add("updateTime", updateTime)
        .toString();
  }
}
