// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response produced after a soft-deleted migration is restored. */
@Generated
public class UndeleteMigrationResponse {
  /** The restored migration. */
  @JsonProperty("migration")
  private Migration migration;

  public UndeleteMigrationResponse setMigration(Migration migration) {
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
    UndeleteMigrationResponse that = (UndeleteMigrationResponse) o;
    return Objects.equals(migration, that.migration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migration);
  }

  @Override
  public String toString() {
    return new ToStringer(UndeleteMigrationResponse.class).add("migration", migration).toString();
  }
}
