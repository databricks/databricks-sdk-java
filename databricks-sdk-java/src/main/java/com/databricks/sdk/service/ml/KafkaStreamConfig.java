// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** Kafka-specific configuration for a Stream. */
@Generated
public class KafkaStreamConfig {
  /**
   * Miscellaneous source options. Accepted keys are source options or Kafka consumer options
   * (kafka.*), validated against an allow-list at request time. All auth configuration goes through
   * the underlying UC Connection(s) or configs and should not be stored here.
   */
  @JsonProperty("extra_options")
  private Map<String, String> extraOptions;

  /** Options to configure which Kafka topics to pull data from. */
  @JsonProperty("subscription_mode")
  private KafkaSubscriptionMode subscriptionMode;

  public KafkaStreamConfig setExtraOptions(Map<String, String> extraOptions) {
    this.extraOptions = extraOptions;
    return this;
  }

  public Map<String, String> getExtraOptions() {
    return extraOptions;
  }

  public KafkaStreamConfig setSubscriptionMode(KafkaSubscriptionMode subscriptionMode) {
    this.subscriptionMode = subscriptionMode;
    return this;
  }

  public KafkaSubscriptionMode getSubscriptionMode() {
    return subscriptionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KafkaStreamConfig that = (KafkaStreamConfig) o;
    return Objects.equals(extraOptions, that.extraOptions)
        && Objects.equals(subscriptionMode, that.subscriptionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraOptions, subscriptionMode);
  }

  @Override
  public String toString() {
    return new ToStringer(KafkaStreamConfig.class)
        .add("extraOptions", extraOptions)
        .add("subscriptionMode", subscriptionMode)
        .toString();
  }
}
