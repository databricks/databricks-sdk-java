// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A request to cancel a migration from any non-terminal state. */
@Generated
public class CancelMigrationRequest {
  /** Optional free-text reason for the cancellation. */
  @JsonProperty("cancellation_reason")
  private String cancellationReason;

  /**
   * Optional resource version for optimistic concurrency control. If supplied, it must match the
   * current server value.
   */
  @JsonProperty("etag")
  private String etag;

  /** The ID of the migration to cancel. */
  @JsonIgnore private String migrationId;

  public CancelMigrationRequest setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  public String getCancellationReason() {
    return cancellationReason;
  }

  public CancelMigrationRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CancelMigrationRequest setMigrationId(String migrationId) {
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
    CancelMigrationRequest that = (CancelMigrationRequest) o;
    return Objects.equals(cancellationReason, that.cancellationReason)
        && Objects.equals(etag, that.etag)
        && Objects.equals(migrationId, that.migrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReason, etag, migrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelMigrationRequest.class)
        .add("cancellationReason", cancellationReason)
        .add("etag", etag)
        .add("migrationId", migrationId)
        .toString();
  }
}
