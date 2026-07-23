// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for resolving a Stream's schema from an external schema registry (e.g. Confluent).
 */
@Generated
public class SchemaRegistryConfig {
  /** Reference to the schema registry API secret in a Databricks secret scope. */
  @JsonProperty("api_secret_ref")
  private SecretScopeReference apiSecretRef;

  /**
   * Schema locator for the message key. Only used for Kafka streams. At least one of
   * payload_schema_locator or key_schema_locator must be set.
   */
  @JsonProperty("key_schema_locator")
  private SchemaLocator keySchemaLocator;

  /**
   * Schema locator for the message payload. For Kafka this is the value. At least one of
   * payload_schema_locator or key_schema_locator must be set.
   */
  @JsonProperty("payload_schema_locator")
  private SchemaLocator payloadSchemaLocator;

  /** A Schema Registry UC Connection object. */
  @JsonProperty("uc_connection")
  private String ucConnection;

  public SchemaRegistryConfig setApiSecretRef(SecretScopeReference apiSecretRef) {
    this.apiSecretRef = apiSecretRef;
    return this;
  }

  public SecretScopeReference getApiSecretRef() {
    return apiSecretRef;
  }

  public SchemaRegistryConfig setKeySchemaLocator(SchemaLocator keySchemaLocator) {
    this.keySchemaLocator = keySchemaLocator;
    return this;
  }

  public SchemaLocator getKeySchemaLocator() {
    return keySchemaLocator;
  }

  public SchemaRegistryConfig setPayloadSchemaLocator(SchemaLocator payloadSchemaLocator) {
    this.payloadSchemaLocator = payloadSchemaLocator;
    return this;
  }

  public SchemaLocator getPayloadSchemaLocator() {
    return payloadSchemaLocator;
  }

  public SchemaRegistryConfig setUcConnection(String ucConnection) {
    this.ucConnection = ucConnection;
    return this;
  }

  public String getUcConnection() {
    return ucConnection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SchemaRegistryConfig that = (SchemaRegistryConfig) o;
    return Objects.equals(apiSecretRef, that.apiSecretRef)
        && Objects.equals(keySchemaLocator, that.keySchemaLocator)
        && Objects.equals(payloadSchemaLocator, that.payloadSchemaLocator)
        && Objects.equals(ucConnection, that.ucConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiSecretRef, keySchemaLocator, payloadSchemaLocator, ucConnection);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaRegistryConfig.class)
        .add("apiSecretRef", apiSecretRef)
        .add("keySchemaLocator", keySchemaLocator)
        .add("payloadSchemaLocator", payloadSchemaLocator)
        .add("ucConnection", ucConnection)
        .toString();
  }
}
