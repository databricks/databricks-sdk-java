// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SchemaConfig {
  /** Avro schema in JSON format (https://avro.apache.org/docs/current/specification/). */
  @JsonProperty("avro_schema")
  private String avroSchema;

  /** Schema of the JSON object in standard IETF JSON schema format (https://json-schema.org/). */
  @JsonProperty("json_schema")
  private String jsonSchema;

  /** Protocol Buffer schema with its payload message name. */
  @JsonProperty("proto_schema")
  private ProtoSchemaSpec protoSchema;

  public SchemaConfig setAvroSchema(String avroSchema) {
    this.avroSchema = avroSchema;
    return this;
  }

  public String getAvroSchema() {
    return avroSchema;
  }

  public SchemaConfig setJsonSchema(String jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }

  public String getJsonSchema() {
    return jsonSchema;
  }

  public SchemaConfig setProtoSchema(ProtoSchemaSpec protoSchema) {
    this.protoSchema = protoSchema;
    return this;
  }

  public ProtoSchemaSpec getProtoSchema() {
    return protoSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SchemaConfig that = (SchemaConfig) o;
    return Objects.equals(avroSchema, that.avroSchema)
        && Objects.equals(jsonSchema, that.jsonSchema)
        && Objects.equals(protoSchema, that.protoSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avroSchema, jsonSchema, protoSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaConfig.class)
        .add("avroSchema", avroSchema)
        .add("jsonSchema", jsonSchema)
        .add("protoSchema", protoSchema)
        .toString();
  }
}
