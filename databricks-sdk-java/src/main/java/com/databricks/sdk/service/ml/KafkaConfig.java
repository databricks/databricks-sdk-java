// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class KafkaConfig {
  /** Authentication configuration for connection to topics. */
  @JsonProperty("auth_config")
  private AuthConfig authConfig;

  /**
   * A user-provided and managed source for backfilling data. Historical data is used when creating
   * a training set from streaming features linked to this Kafka config. In the future, a separate
   * table will be maintained by Databricks for forward filling data. The schema for this source
   * must match exactly that of the key and value schemas specified for this Kafka config.
   */
  @JsonProperty("backfill_source")
  private BackfillSource backfillSource;

  /** A comma-separated list of host/port pairs pointing to Kafka cluster. */
  @JsonProperty("bootstrap_servers")
  private String bootstrapServers;

  /**
   * Catch-all for miscellaneous options. Keys should be source options or Kafka consumer options
   * (kafka.*)
   */
  @JsonProperty("extra_options")
  private Map<String, String> extraOptions;

  /**
   * Schema configuration for extracting message keys from topics. At least one of key_schema and
   * value_schema must be provided.
   */
  @JsonProperty("key_schema")
  private SchemaConfig keySchema;

  /**
   * Name that uniquely identifies this Kafka config within the metastore. This will be the
   * identifier used from the Feature object to reference these configs for a feature. Can be
   * distinct from topic name.
   */
  @JsonProperty("name")
  private String name;

  /** Options to configure which Kafka topics to pull data from. */
  @JsonProperty("subscription_mode")
  private SubscriptionMode subscriptionMode;

  /**
   * Schema configuration for extracting message values from topics. At least one of key_schema and
   * value_schema must be provided.
   */
  @JsonProperty("value_schema")
  private SchemaConfig valueSchema;

  public KafkaConfig setAuthConfig(AuthConfig authConfig) {
    this.authConfig = authConfig;
    return this;
  }

  public AuthConfig getAuthConfig() {
    return authConfig;
  }

  public KafkaConfig setBackfillSource(BackfillSource backfillSource) {
    this.backfillSource = backfillSource;
    return this;
  }

  public BackfillSource getBackfillSource() {
    return backfillSource;
  }

  public KafkaConfig setBootstrapServers(String bootstrapServers) {
    this.bootstrapServers = bootstrapServers;
    return this;
  }

  public String getBootstrapServers() {
    return bootstrapServers;
  }

  public KafkaConfig setExtraOptions(Map<String, String> extraOptions) {
    this.extraOptions = extraOptions;
    return this;
  }

  public Map<String, String> getExtraOptions() {
    return extraOptions;
  }

  public KafkaConfig setKeySchema(SchemaConfig keySchema) {
    this.keySchema = keySchema;
    return this;
  }

  public SchemaConfig getKeySchema() {
    return keySchema;
  }

  public KafkaConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public KafkaConfig setSubscriptionMode(SubscriptionMode subscriptionMode) {
    this.subscriptionMode = subscriptionMode;
    return this;
  }

  public SubscriptionMode getSubscriptionMode() {
    return subscriptionMode;
  }

  public KafkaConfig setValueSchema(SchemaConfig valueSchema) {
    this.valueSchema = valueSchema;
    return this;
  }

  public SchemaConfig getValueSchema() {
    return valueSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KafkaConfig that = (KafkaConfig) o;
    return Objects.equals(authConfig, that.authConfig)
        && Objects.equals(backfillSource, that.backfillSource)
        && Objects.equals(bootstrapServers, that.bootstrapServers)
        && Objects.equals(extraOptions, that.extraOptions)
        && Objects.equals(keySchema, that.keySchema)
        && Objects.equals(name, that.name)
        && Objects.equals(subscriptionMode, that.subscriptionMode)
        && Objects.equals(valueSchema, that.valueSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authConfig,
        backfillSource,
        bootstrapServers,
        extraOptions,
        keySchema,
        name,
        subscriptionMode,
        valueSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(KafkaConfig.class)
        .add("authConfig", authConfig)
        .add("backfillSource", backfillSource)
        .add("bootstrapServers", bootstrapServers)
        .add("extraOptions", extraOptions)
        .add("keySchema", keySchema)
        .add("name", name)
        .add("subscriptionMode", subscriptionMode)
        .add("valueSchema", valueSchema)
        .toString();
  }
}
