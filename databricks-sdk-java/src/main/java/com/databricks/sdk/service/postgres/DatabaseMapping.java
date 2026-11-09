// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A mapping between one source and target database. */
@Generated
public class DatabaseMapping {
  /**
   * Output-only. The resolved target PostgreSQL database name. Equal to `target_database` when
   * provided; otherwise equal to `source_database`.
   */
  @JsonProperty("effective_target_database")
  private String effectiveTargetDatabase;

  /** Required. The exact PostgreSQL database name on the source server. */
  @JsonProperty("source_database")
  private String sourceDatabase;

  /**
   * The PostgreSQL database name to create on the target branch. When omitted, the source database
   * name is preserved.
   */
  @JsonProperty("target_database")
  private String targetDatabase;

  public DatabaseMapping setEffectiveTargetDatabase(String effectiveTargetDatabase) {
    this.effectiveTargetDatabase = effectiveTargetDatabase;
    return this;
  }

  public String getEffectiveTargetDatabase() {
    return effectiveTargetDatabase;
  }

  public DatabaseMapping setSourceDatabase(String sourceDatabase) {
    this.sourceDatabase = sourceDatabase;
    return this;
  }

  public String getSourceDatabase() {
    return sourceDatabase;
  }

  public DatabaseMapping setTargetDatabase(String targetDatabase) {
    this.targetDatabase = targetDatabase;
    return this;
  }

  public String getTargetDatabase() {
    return targetDatabase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseMapping that = (DatabaseMapping) o;
    return Objects.equals(effectiveTargetDatabase, that.effectiveTargetDatabase)
        && Objects.equals(sourceDatabase, that.sourceDatabase)
        && Objects.equals(targetDatabase, that.targetDatabase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveTargetDatabase, sourceDatabase, targetDatabase);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseMapping.class)
        .add("effectiveTargetDatabase", effectiveTargetDatabase)
        .add("sourceDatabase", sourceDatabase)
        .add("targetDatabase", targetDatabase)
        .toString();
  }
}
