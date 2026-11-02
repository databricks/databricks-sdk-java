// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMigrationRequest {
  /**
   * The migration to create. The server generates `migration_id` and sets `state` to
   * PLANNING_PENDING. Required fields: `asset_type`, `asset_uri`.
   */
  @JsonProperty("migration")
  private Migration migration;

  /**
   * Client-generated request ID for idempotent request deduplication. The server de-duplicates
   * requests with the same request_id for at least 24 hours, returning the existing migration
   * instead of creating a duplicate.
   */
  @JsonIgnore
  @QueryParam("request_id")
  private String requestId;

  public CreateMigrationRequest setMigration(Migration migration) {
    this.migration = migration;
    return this;
  }

  public Migration getMigration() {
    return migration;
  }

  public CreateMigrationRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMigrationRequest that = (CreateMigrationRequest) o;
    return Objects.equals(migration, that.migration) && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migration, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMigrationRequest.class)
        .add("migration", migration)
        .add("requestId", requestId)
        .toString();
  }
}
