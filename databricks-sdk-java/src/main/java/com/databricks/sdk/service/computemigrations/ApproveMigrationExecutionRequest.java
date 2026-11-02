// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A request to approve migration execution at the MIGRATION_REVIEW gate. */
@Generated
public class ApproveMigrationExecutionRequest {
  /**
   * Optional free-text feedback or instructions the user provides along with the approval, carried
   * into the next stage of the migration.
   */
  @JsonProperty("additional_feedback")
  private String additionalFeedback;

  /**
   * Optional resource version for optimistic concurrency control. If supplied, it must match the
   * current server value.
   */
  @JsonProperty("etag")
  private String etag;

  /** The ID of the migration to approve for execution. */
  @JsonIgnore private String migrationId;

  public ApproveMigrationExecutionRequest setAdditionalFeedback(String additionalFeedback) {
    this.additionalFeedback = additionalFeedback;
    return this;
  }

  public String getAdditionalFeedback() {
    return additionalFeedback;
  }

  public ApproveMigrationExecutionRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public ApproveMigrationExecutionRequest setMigrationId(String migrationId) {
    this.migrationId = migrationId;
    return this;
  }

  public String getMigrationId() {
    return migrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApproveMigrationExecutionRequest that = (ApproveMigrationExecutionRequest) o;
    return Objects.equals(additionalFeedback, that.additionalFeedback)
        && Objects.equals(etag, that.etag)
        && Objects.equals(migrationId, that.migrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalFeedback, etag, migrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproveMigrationExecutionRequest.class)
        .add("additionalFeedback", additionalFeedback)
        .add("etag", etag)
        .add("migrationId", migrationId)
        .toString();
  }
}
