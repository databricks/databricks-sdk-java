// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Source-specific configuration. Determines the streaming platform source. */
@Generated
public class StreamSourceConfig {
  /** Configuration for Apache Kafka streams. */
  @JsonProperty("kafka_stream_config")
  private KafkaStreamConfig kafkaStreamConfig;

  public StreamSourceConfig setKafkaStreamConfig(KafkaStreamConfig kafkaStreamConfig) {
    this.kafkaStreamConfig = kafkaStreamConfig;
    return this;
  }

  public KafkaStreamConfig getKafkaStreamConfig() {
    return kafkaStreamConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamSourceConfig that = (StreamSourceConfig) o;
    return Objects.equals(kafkaStreamConfig, that.kafkaStreamConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkaStreamConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamSourceConfig.class)
        .add("kafkaStreamConfig", kafkaStreamConfig)
        .toString();
  }
}
