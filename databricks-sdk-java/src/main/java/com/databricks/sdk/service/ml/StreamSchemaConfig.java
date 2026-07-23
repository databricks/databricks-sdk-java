// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Schema definitions for the stream. Feature store supports both direct schemas and schema
 * registries.
 */
@Generated
public class StreamSchemaConfig {
  /** Schema definitions provided directly on the Stream. */
  @JsonProperty("direct_schemas")
  private DirectSchemas directSchemas;

  /** Resolve schemas from an external schema registry. */
  @JsonProperty("schema_registry_config")
  private SchemaRegistryConfig schemaRegistryConfig;

  public StreamSchemaConfig setDirectSchemas(DirectSchemas directSchemas) {
    this.directSchemas = directSchemas;
    return this;
  }

  public DirectSchemas getDirectSchemas() {
    return directSchemas;
  }

  public StreamSchemaConfig setSchemaRegistryConfig(SchemaRegistryConfig schemaRegistryConfig) {
    this.schemaRegistryConfig = schemaRegistryConfig;
    return this;
  }

  public SchemaRegistryConfig getSchemaRegistryConfig() {
    return schemaRegistryConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamSchemaConfig that = (StreamSchemaConfig) o;
    return Objects.equals(directSchemas, that.directSchemas)
        && Objects.equals(schemaRegistryConfig, that.schemaRegistryConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directSchemas, schemaRegistryConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamSchemaConfig.class)
        .add("directSchemas", directSchemas)
        .add("schemaRegistryConfig", schemaRegistryConfig)
        .toString();
  }
}
