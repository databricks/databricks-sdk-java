// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JsonTransformerOptions {
  /** Parse the entire value as a single Variant column. */
  @JsonProperty("as_variant")
  private Boolean asVariant;

  /** Inline schema string for JSON parsing (Spark DDL format). */
  @JsonProperty("schema")
  private String schema;

  /** (Optional) Schema evolution mode for schema inference. */
  @JsonProperty("schema_evolution_mode")
  private FileIngestionOptionsSchemaEvolutionMode schemaEvolutionMode;

  /** Path to a schema file (.ddl). */
  @JsonProperty("schema_file_path")
  private String schemaFilePath;

  /** (Optional) Schema hints as a comma-separated string of "column_name type" pairs. */
  @JsonProperty("schema_hints")
  private String schemaHints;

  public JsonTransformerOptions setAsVariant(Boolean asVariant) {
    this.asVariant = asVariant;
    return this;
  }

  public Boolean getAsVariant() {
    return asVariant;
  }

  public JsonTransformerOptions setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public JsonTransformerOptions setSchemaEvolutionMode(
      FileIngestionOptionsSchemaEvolutionMode schemaEvolutionMode) {
    this.schemaEvolutionMode = schemaEvolutionMode;
    return this;
  }

  public FileIngestionOptionsSchemaEvolutionMode getSchemaEvolutionMode() {
    return schemaEvolutionMode;
  }

  public JsonTransformerOptions setSchemaFilePath(String schemaFilePath) {
    this.schemaFilePath = schemaFilePath;
    return this;
  }

  public String getSchemaFilePath() {
    return schemaFilePath;
  }

  public JsonTransformerOptions setSchemaHints(String schemaHints) {
    this.schemaHints = schemaHints;
    return this;
  }

  public String getSchemaHints() {
    return schemaHints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JsonTransformerOptions that = (JsonTransformerOptions) o;
    return Objects.equals(asVariant, that.asVariant)
        && Objects.equals(schema, that.schema)
        && Objects.equals(schemaEvolutionMode, that.schemaEvolutionMode)
        && Objects.equals(schemaFilePath, that.schemaFilePath)
        && Objects.equals(schemaHints, that.schemaHints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asVariant, schema, schemaEvolutionMode, schemaFilePath, schemaHints);
  }

  @Override
  public String toString() {
    return new ToStringer(JsonTransformerOptions.class)
        .add("asVariant", asVariant)
        .add("schema", schema)
        .add("schemaEvolutionMode", schemaEvolutionMode)
        .add("schemaFilePath", schemaFilePath)
        .add("schemaHints", schemaHints)
        .toString();
  }
}
