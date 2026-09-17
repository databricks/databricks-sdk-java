// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ProtobufTransformerOptions {
  /** Required: path to the .desc file (dbfs:/... or /Volumes/...). */
  @JsonProperty("desc_file_path")
  private String descFilePath;

  /** Required: fully-qualified message type name. */
  @JsonProperty("message_name")
  private String messageName;

  /**
   * (Optional) Parse mode for Protobuf data. Valid values: FAILFAST, PERMISSIVE. Defaults to
   * FAILFAST.
   */
  @JsonProperty("parse_mode")
  private ParseMode parseMode;

  /**
   * (Optional) Maximum expansion depth for recursive protobuf fields. Spark SQL does not natively
   * support recursive types, so recursive fields are expanded up to this depth and truncated beyond
   * it. Valid values: -1 (disallow recursive fields), 0 (drop), 1-10.
   */
  @JsonProperty("recursive_fields_max_depth")
  private Long recursiveFieldsMaxDepth;

  /**
   * (Optional) Schema registry to resolve the Protobuf schema at runtime instead of providing it
   * via desc_file_path.
   */
  @JsonProperty("schema_registry")
  private SchemaRegistryConfig schemaRegistry;

  public ProtobufTransformerOptions setDescFilePath(String descFilePath) {
    this.descFilePath = descFilePath;
    return this;
  }

  public String getDescFilePath() {
    return descFilePath;
  }

  public ProtobufTransformerOptions setMessageName(String messageName) {
    this.messageName = messageName;
    return this;
  }

  public String getMessageName() {
    return messageName;
  }

  public ProtobufTransformerOptions setParseMode(ParseMode parseMode) {
    this.parseMode = parseMode;
    return this;
  }

  public ParseMode getParseMode() {
    return parseMode;
  }

  public ProtobufTransformerOptions setRecursiveFieldsMaxDepth(Long recursiveFieldsMaxDepth) {
    this.recursiveFieldsMaxDepth = recursiveFieldsMaxDepth;
    return this;
  }

  public Long getRecursiveFieldsMaxDepth() {
    return recursiveFieldsMaxDepth;
  }

  public ProtobufTransformerOptions setSchemaRegistry(SchemaRegistryConfig schemaRegistry) {
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
    ProtobufTransformerOptions that = (ProtobufTransformerOptions) o;
    return Objects.equals(descFilePath, that.descFilePath)
        && Objects.equals(messageName, that.messageName)
        && Objects.equals(parseMode, that.parseMode)
        && Objects.equals(recursiveFieldsMaxDepth, that.recursiveFieldsMaxDepth)
        && Objects.equals(schemaRegistry, that.schemaRegistry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        descFilePath, messageName, parseMode, recursiveFieldsMaxDepth, schemaRegistry);
  }

  @Override
  public String toString() {
    return new ToStringer(ProtobufTransformerOptions.class)
        .add("descFilePath", descFilePath)
        .add("messageName", messageName)
        .add("parseMode", parseMode)
        .add("recursiveFieldsMaxDepth", recursiveFieldsMaxDepth)
        .add("schemaRegistry", schemaRegistry)
        .toString();
  }
}
