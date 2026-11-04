// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Reference to a parser that the datasource uses. Each parser defines the schema of the parsed
 * table that it writes.
 */
@Generated
public class ParserRef {
  /**
   * The table this parser's data is written to: `target_table` when supplied, otherwise the table
   * derived from the datasource's catalog and schema and the parser name. Fixed once resolved, so a
   * later parser rename does not move it. Populated on get, create, and update responses with the
   * resolved table.
   */
  @JsonProperty("effective_target_table")
  private TableName effectiveTargetTable;

  /** Identifier of the parser. Stable across renames, unlike a parser name. */
  @JsonProperty("id")
  private String id;

  /**
   * Table that this parser's data is written to. The table must be in the datasource's catalog and
   * schema. If unset, the table name is derived from the parser name. Reads return the value as
   * supplied; the table the data is written to is reported in `effective_target_table`.
   */
  @JsonProperty("target_table")
  private TableName targetTable;

  /** Version of the parser to use, given as an explicit version number. */
  @JsonProperty("version")
  private String version;

  public ParserRef setEffectiveTargetTable(TableName effectiveTargetTable) {
    this.effectiveTargetTable = effectiveTargetTable;
    return this;
  }

  public TableName getEffectiveTargetTable() {
    return effectiveTargetTable;
  }

  public ParserRef setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ParserRef setTargetTable(TableName targetTable) {
    this.targetTable = targetTable;
    return this;
  }

  public TableName getTargetTable() {
    return targetTable;
  }

  public ParserRef setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ParserRef that = (ParserRef) o;
    return Objects.equals(effectiveTargetTable, that.effectiveTargetTable)
        && Objects.equals(id, that.id)
        && Objects.equals(targetTable, that.targetTable)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveTargetTable, id, targetTable, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ParserRef.class)
        .add("effectiveTargetTable", effectiveTargetTable)
        .add("id", id)
        .add("targetTable", targetTable)
        .add("version", version)
        .toString();
  }
}
