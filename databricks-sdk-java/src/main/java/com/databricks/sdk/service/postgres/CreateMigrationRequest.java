// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMigrationRequest {
  /** Required. The migration to create. */
  @JsonProperty("migration")
  private Migration migration;

  /**
   * Required. The ID to use for the migration. It becomes the final component of the resource name
   * (`migrations/{migration_id}`). It must be 1-63 characters long, start with a lowercase letter,
   * and contain only lowercase letters, numbers, and hyphens.
   */
  @JsonIgnore
  @QueryParam("migration_id")
  private String migrationId;

  public CreateMigrationRequest setMigration(Migration migration) {
    this.migration = migration;
    return this;
  }

  public Migration getMigration() {
    return migration;
  }

  public CreateMigrationRequest setMigrationId(String migrationId) {
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
    CreateMigrationRequest that = (CreateMigrationRequest) o;
    return Objects.equals(migration, that.migration)
        && Objects.equals(migrationId, that.migrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migration, migrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMigrationRequest.class)
        .add("migration", migration)
        .add("migrationId", migrationId)
        .toString();
  }
}
