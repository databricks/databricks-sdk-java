// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * A persistent object tracking the full lifecycle of migrating one Classic compute asset to
 * Serverless. Each Migration has a well-defined state machine and is the unit of orchestration,
 * approval, and rollback.
 */
@Generated
public class Migration {
  /** Type of Classic compute asset being migrated. Cannot be changed after creation. */
  @JsonProperty("asset_type")
  private MigrationAssetType assetType;

  /** URI of the source asset (e.g., "jobs/12345"). Cannot be changed after creation. */
  @JsonProperty("asset_uri")
  private String assetUri;

  /**
   * When true, the server skips the translation review (TRANSLATION_READY) instead of waiting for
   * an explicit ApproveMigrationTranslation. MIGRATION_REVIEW is never skipped. Unset/false means
   * the translation review requires explicit user action. Set at creation; cannot be changed
   * afterward. Does not suppress cancellation or terminal failures.
   */
  @JsonProperty("auto_approve")
  private Boolean autoApprove;

  /** Baking window configuration. Mutable via UpdateMigration before baking starts. */
  @JsonProperty("baking_config")
  private BakingConfig bakingConfig;

  /** Summary of baking metrics after the baking window completes. */
  @JsonProperty("baking_report")
  private BakingReport bakingReport;

  /** Timestamp when the migration was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Resource version for optimistic concurrency control. Clients read this from GetMigration or
   * ListMigrations and pass it back as the request `etag` on update, delete, approve, reject, and
   * cancel methods.
   */
  @JsonProperty("etag")
  private String etag;

  /** The user who initiated this migration and their role. Set at creation. */
  @JsonProperty("initiator")
  private MigrationInitiator initiator;

  /** Server-generated unique identifier for this migration. */
  @JsonProperty("migration_id")
  private String migrationId;

  /** Agent-produced planning report, presented to the user at the review gates. */
  @JsonProperty("migration_report")
  private MigrationReport migrationReport;

  /**
   * When true, Databricks runs the working copy to validate it after the translation review.
   * Unset/false skips the run, so the migration goes from the translation review straight to
   * execution review. Whether the translation review waits for the user is controlled by
   * `auto_approve`, not this field. Set at creation; cannot be changed afterward.
   */
  @JsonProperty("run_validation")
  private Boolean runValidation;

  /** Current state of the migration in the state machine. Managed by the server. */
  @JsonProperty("state")
  private MigrationState state;

  /**
   * History of state transitions, ordered chronologically. Each entry records the state entered and
   * the timestamp of the transition.
   */
  @JsonProperty("state_history")
  private Collection<MigrationStateTransition> stateHistory;

  /** Agent-produced validation results from sandbox execution. */
  @JsonProperty("validation_report")
  private ValidationReport validationReport;

  public Migration setAssetType(MigrationAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public MigrationAssetType getAssetType() {
    return assetType;
  }

  public Migration setAssetUri(String assetUri) {
    this.assetUri = assetUri;
    return this;
  }

  public String getAssetUri() {
    return assetUri;
  }

  public Migration setAutoApprove(Boolean autoApprove) {
    this.autoApprove = autoApprove;
    return this;
  }

  public Boolean getAutoApprove() {
    return autoApprove;
  }

  public Migration setBakingConfig(BakingConfig bakingConfig) {
    this.bakingConfig = bakingConfig;
    return this;
  }

  public BakingConfig getBakingConfig() {
    return bakingConfig;
  }

  public Migration setBakingReport(BakingReport bakingReport) {
    this.bakingReport = bakingReport;
    return this;
  }

  public BakingReport getBakingReport() {
    return bakingReport;
  }

  public Migration setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Migration setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Migration setInitiator(MigrationInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

  public MigrationInitiator getInitiator() {
    return initiator;
  }

  public Migration setMigrationId(String migrationId) {
    this.migrationId = migrationId;
    return this;
  }

  public String getMigrationId() {
    return migrationId;
  }

  public Migration setMigrationReport(MigrationReport migrationReport) {
    this.migrationReport = migrationReport;
    return this;
  }

  public MigrationReport getMigrationReport() {
    return migrationReport;
  }

  public Migration setRunValidation(Boolean runValidation) {
    this.runValidation = runValidation;
    return this;
  }

  public Boolean getRunValidation() {
    return runValidation;
  }

  public Migration setState(MigrationState state) {
    this.state = state;
    return this;
  }

  public MigrationState getState() {
    return state;
  }

  public Migration setStateHistory(Collection<MigrationStateTransition> stateHistory) {
    this.stateHistory = stateHistory;
    return this;
  }

  public Collection<MigrationStateTransition> getStateHistory() {
    return stateHistory;
  }

  public Migration setValidationReport(ValidationReport validationReport) {
    this.validationReport = validationReport;
    return this;
  }

  public ValidationReport getValidationReport() {
    return validationReport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Migration that = (Migration) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(assetUri, that.assetUri)
        && Objects.equals(autoApprove, that.autoApprove)
        && Objects.equals(bakingConfig, that.bakingConfig)
        && Objects.equals(bakingReport, that.bakingReport)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(etag, that.etag)
        && Objects.equals(initiator, that.initiator)
        && Objects.equals(migrationId, that.migrationId)
        && Objects.equals(migrationReport, that.migrationReport)
        && Objects.equals(runValidation, that.runValidation)
        && Objects.equals(state, that.state)
        && Objects.equals(stateHistory, that.stateHistory)
        && Objects.equals(validationReport, that.validationReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetType,
        assetUri,
        autoApprove,
        bakingConfig,
        bakingReport,
        createTime,
        etag,
        initiator,
        migrationId,
        migrationReport,
        runValidation,
        state,
        stateHistory,
        validationReport);
  }

  @Override
  public String toString() {
    return new ToStringer(Migration.class)
        .add("assetType", assetType)
        .add("assetUri", assetUri)
        .add("autoApprove", autoApprove)
        .add("bakingConfig", bakingConfig)
        .add("bakingReport", bakingReport)
        .add("createTime", createTime)
        .add("etag", etag)
        .add("initiator", initiator)
        .add("migrationId", migrationId)
        .add("migrationReport", migrationReport)
        .add("runValidation", runValidation)
        .add("state", state)
        .add("stateHistory", stateHistory)
        .add("validationReport", validationReport)
        .toString();
  }
}
