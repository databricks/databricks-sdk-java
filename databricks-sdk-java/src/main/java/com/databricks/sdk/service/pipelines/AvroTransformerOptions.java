// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AvroTransformerOptions {
  /**
   * (Optional) Parse mode for Avro data. Valid values: FAILFAST, PERMISSIVE. Defaults to FAILFAST.
   */
  @JsonProperty("parse_mode")
  private ParseMode parseMode;

  /** Inline Avro JSON schema string. */
  @JsonProperty("schema")
  private String schema;

  /** Path to a schema file (.avsc). */
  @JsonProperty("schema_file_path")
  private String schemaFilePath;

  /**
   * (Optional) Schema registry to resolve the Avro schema at runtime instead of providing it inline
   * or via a file path.
   */
  @JsonProperty("schema_registry")
  private SchemaRegistryConfig schemaRegistry;

  public AvroTransformerOptions setParseMode(ParseMode parseMode) {
    this.parseMode = parseMode;
    return this;
  }

  public ParseMode getParseMode() {
    return parseMode;
  }

  public AvroTransformerOptions setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public AvroTransformerOptions setSchemaFilePath(String schemaFilePath) {
    this.schemaFilePath = schemaFilePath;
    return this;
  }

  public String getSchemaFilePath() {
    return schemaFilePath;
  }

  public AvroTransformerOptions setSchemaRegistry(SchemaRegistryConfig schemaRegistry) {
    this.schemaRegistry = schemaRegistry;
    return this;
  }

  public SchemaRegistryConfig getSchemaRegistry() {
    return schemaRegistry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AvroTransformerOptions that = (AvroTransformerOptions) o;
    return Objects.equals(parseMode, that.parseMode)
        && Objects.equals(schema, that.schema)
        && Objects.equals(schemaFilePath, that.schemaFilePath)
        && Objects.equals(schemaRegistry, that.schemaRegistry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parseMode, schema, schemaFilePath, schemaRegistry);
  }

  @Override
  public String toString() {
    return new ToStringer(AvroTransformerOptions.class)
        .add("parseMode", parseMode)
        .add("schema", schema)
        .add("schemaFilePath", schemaFilePath)
        .add("schemaRegistry", schemaRegistry)
        .toString();
  }
}
