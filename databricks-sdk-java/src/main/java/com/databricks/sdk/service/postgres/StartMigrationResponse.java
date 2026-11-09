// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response produced after migration preparation has started. */
@Generated
public class StartMigrationResponse {
  /** The migration after the start action is applied. */
  @JsonProperty("migration")
  private Migration migration;

  public StartMigrationResponse setMigration(Migration migration) {
    this.migration = migration;
    return this;
  }

  public Migration getMigration() {
    return migration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartMigrationResponse that = (StartMigrationResponse) o;
    return Objects.equals(migration, that.migration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migration);
  }

  @Override
  public String toString() {
    return new ToStringer(StartMigrationResponse.class).add("migration", migration).toString();
  }
}
