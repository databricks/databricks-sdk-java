// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class IngestionConfig {
  /** Select tables from a specific source schema. */
  @JsonProperty("schema")
  private SchemaSpec schema;

  /** Select tables from a specific source table. */
  @JsonProperty("table")
  private TableSpec table;

  public IngestionConfig setSchema(SchemaSpec schema) {
    this.schema = schema;
    return this;
  }

  public SchemaSpec getSchema() {
    return schema;
  }

  public IngestionConfig setTable(TableSpec table) {
    this.table = table;
    return this;
  }

  public TableSpec getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionConfig that = (IngestionConfig) o;
    return Objects.equals(schema, that.schema) && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, table);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionConfig.class)
        .add("schema", schema)
        .add("table", table)
        .toString();
  }
}
