// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SchemaRegistryConfig {
  /** Required: Confluent-compatible schema registry options. */
  @JsonProperty("confluent_options")
  private ConfluentSchemaRegistryOptions confluentOptions;

  /**
   * (Optional) UC connection for registry authentication. Specify if different from the top-level
   * source connection.
   */
  @JsonProperty("connection_name")
  private String connectionName;

  /**
   * (Optional, Protobuf only) Selects a specific message from a schema that defines multiple
   * Protobuf messages. Simple ("Location") or fully-qualified ("com.example.protos.Location").
   * Defaults to the first message.
   */
  @JsonProperty("protobuf_message_name")
  private String protobufMessageName;

  public SchemaRegistryConfig setConfluentOptions(ConfluentSchemaRegistryOptions confluentOptions) {
    this.confluentOptions = confluentOptions;
    return this;
  }

  public ConfluentSchemaRegistryOptions getConfluentOptions() {
    return confluentOptions;
  }

  public SchemaRegistryConfig setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public SchemaRegistryConfig setProtobufMessageName(String protobufMessageName) {
    this.protobufMessageName = protobufMessageName;
    return this;
  }

  public String getProtobufMessageName() {
    return protobufMessageName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SchemaRegistryConfig that = (SchemaRegistryConfig) o;
    return Objects.equals(confluentOptions, that.confluentOptions)
        && Objects.equals(connectionName, that.connectionName)
        && Objects.equals(protobufMessageName, that.protobufMessageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confluentOptions, connectionName, protobufMessageName);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaRegistryConfig.class)
        .add("confluentOptions", confluentOptions)
        .add("connectionName", connectionName)
        .add("protobufMessageName", protobufMessageName)
        .toString();
  }
}
