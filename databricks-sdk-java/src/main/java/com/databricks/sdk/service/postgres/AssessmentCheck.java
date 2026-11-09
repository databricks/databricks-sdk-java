// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The result of one assessment check. */
@Generated
public class AssessmentCheck {
  /** Output-only. Whether this result blocks migration from starting. */
  @JsonProperty("blocks_migration")
  private Boolean blocksMigration;

  /** Output-only. Stable identifier of the check. */
  @JsonProperty("check_id")
  private String checkId;

  /**
   * Output-only. The source database the check evaluated. Unset for checks that assess the whole
   * source server rather than a single database.
   */
  @JsonProperty("database")
  private String database;

  /** Output-only. Measurements observed by this check. Absent when unavailable. */
  @JsonProperty("details")
  private AssessmentCheckDetails details;

  /** Output-only. Explanation of the result. */
  @JsonProperty("reason")
  private String reason;

  /** Output-only. The check verdict. */
  @JsonProperty("verdict")
  private AssessmentCheckVerdict verdict;

  public AssessmentCheck setBlocksMigration(Boolean blocksMigration) {
    this.blocksMigration = blocksMigration;
    return this;
  }

  public Boolean getBlocksMigration() {
    return blocksMigration;
  }

  public AssessmentCheck setCheckId(String checkId) {
    this.checkId = checkId;
    return this;
  }

  public String getCheckId() {
    return checkId;
  }

  public AssessmentCheck setDatabase(String database) {
    this.database = database;
    return this;
  }

  public String getDatabase() {
    return database;
  }

  public AssessmentCheck setDetails(AssessmentCheckDetails details) {
    this.details = details;
    return this;
  }

  public AssessmentCheckDetails getDetails() {
    return details;
  }

  public AssessmentCheck setReason(String reason) {
    this.reason = reason;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public AssessmentCheck setVerdict(AssessmentCheckVerdict verdict) {
    this.verdict = verdict;
    return this;
  }

  public AssessmentCheckVerdict getVerdict() {
    return verdict;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssessmentCheck that = (AssessmentCheck) o;
    return Objects.equals(blocksMigration, that.blocksMigration)
        && Objects.equals(checkId, that.checkId)
        && Objects.equals(database, that.database)
        && Objects.equals(details, that.details)
        && Objects.equals(reason, that.reason)
        && Objects.equals(verdict, that.verdict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blocksMigration, checkId, database, details, reason, verdict);
  }

  @Override
  public String toString() {
    return new ToStringer(AssessmentCheck.class)
        .add("blocksMigration", blocksMigration)
        .add("checkId", checkId)
        .add("database", database)
        .add("details", details)
        .add("reason", reason)
        .add("verdict", verdict)
        .toString();
  }
}
