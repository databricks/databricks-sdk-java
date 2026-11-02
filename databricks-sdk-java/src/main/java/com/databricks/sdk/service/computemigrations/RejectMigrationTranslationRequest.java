// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A request to reject the working copy at the TRANSLATION_READY gate, looping back to
 * REVISION_PENDING.
 */
@Generated
public class RejectMigrationTranslationRequest {
  /**
   * Optional resource version for optimistic concurrency control. If supplied, it must match the
   * current server value.
   */
  @JsonProperty("etag")
  private String etag;

  /** The ID of the migration to reject. */
  @JsonIgnore private String migrationId;

  /**
   * Required free-text reason for the rejection, fed back into re-planning so the next plan can
   * address the user's concerns.
   */
  @JsonProperty("rejection_reason")
  private String rejectionReason;

  public RejectMigrationTranslationRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public RejectMigrationTranslationRequest setMigrationId(String migrationId) {
    this.migrationId = migrationId;
    return this;
  }

  public String getMigrationId() {
    return migrationId;
  }

  public RejectMigrationTranslationRequest setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

  public String getRejectionReason() {
    return rejectionReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RejectMigrationTranslationRequest that = (RejectMigrationTranslationRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(migrationId, that.migrationId)
        && Objects.equals(rejectionReason, that.rejectionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, migrationId, rejectionReason);
  }

  @Override
  public String toString() {
    return new ToStringer(RejectMigrationTranslationRequest.class)
        .add("etag", etag)
        .add("migrationId", migrationId)
        .add("rejectionReason", rejectionReason)
        .toString();
  }
}
