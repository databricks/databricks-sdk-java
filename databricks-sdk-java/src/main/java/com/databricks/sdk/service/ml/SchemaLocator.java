// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Schema locator for one side (payload or key) of a message. Identifies which schema to use in the
 * schema registry and the serialization format.
 */
@Generated
public class SchemaLocator {
  /** Confluent Schema Registry schema locator. */
  @JsonProperty("confluent_schema")
  private SchemaLocatorConfluentSchema confluentSchema;

  /** Serialization format for this schema. */
  @JsonProperty("format")
  private SchemaLocatorFormat format;

  public SchemaLocator setConfluentSchema(SchemaLocatorConfluentSchema confluentSchema) {
    this.confluentSchema = confluentSchema;
    return this;
  }

  public SchemaLocatorConfluentSchema getConfluentSchema() {
    return confluentSchema;
  }

  public SchemaLocator setFormat(SchemaLocatorFormat format) {
    this.format = format;
    return this;
  }

  public SchemaLocatorFormat getFormat() {
    return format;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SchemaLocator that = (SchemaLocator) o;
    return Objects.equals(confluentSchema, that.confluentSchema)
        && Objects.equals(format, that.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confluentSchema, format);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaLocator.class)
        .add("confluentSchema", confluentSchema)
        .add("format", format)
        .toString();
  }
}
