// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Schema definitions provided directly on the Stream, as opposed to referencing a schema registry.
 * To resolve schemas from a registry instead, use SchemaRegistryConfig.
 */
@Generated
public class DirectSchemas {
  /**
   * Schema for the message key. This is only used for Kafka streams. For Kafka, at least one of
   * payload_schema or key_schema must be specified.
   */
  @JsonProperty("key_schema")
  private SchemaConfig keySchema;

  /**
   * Schema for the message payload. For Kafka, this is the value schema. Unless the platform
   * supports another schema (e.g. keys for Kafka), this must be specified.
   */
  @JsonProperty("payload_schema")
  private SchemaConfig payloadSchema;

  public DirectSchemas setKeySchema(SchemaConfig keySchema) {
    this.keySchema = keySchema;
    return this;
  }

  public SchemaConfig getKeySchema() {
    return keySchema;
  }

  public DirectSchemas setPayloadSchema(SchemaConfig payloadSchema) {
    this.payloadSchema = payloadSchema;
    return this;
  }

  public SchemaConfig getPayloadSchema() {
    return payloadSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DirectSchemas that = (DirectSchemas) o;
    return Objects.equals(keySchema, that.keySchema)
        && Objects.equals(payloadSchema, that.payloadSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keySchema, payloadSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectSchemas.class)
        .add("keySchema", keySchema)
        .add("payloadSchema", payloadSchema)
        .toString();
  }
}
