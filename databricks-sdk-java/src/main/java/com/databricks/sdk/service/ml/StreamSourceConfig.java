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

  /** Configuration for AWS Kinesis Data Streams. */
  @JsonProperty("kinesis_stream_config")
  private KinesisStreamConfig kinesisStreamConfig;

  public StreamSourceConfig setKafkaStreamConfig(KafkaStreamConfig kafkaStreamConfig) {
    this.kafkaStreamConfig = kafkaStreamConfig;
    return this;
  }

  public KafkaStreamConfig getKafkaStreamConfig() {
    return kafkaStreamConfig;
  }

  public StreamSourceConfig setKinesisStreamConfig(KinesisStreamConfig kinesisStreamConfig) {
    this.kinesisStreamConfig = kinesisStreamConfig;
    return this;
  }

  public KinesisStreamConfig getKinesisStreamConfig() {
    return kinesisStreamConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamSourceConfig that = (StreamSourceConfig) o;
    return Objects.equals(kafkaStreamConfig, that.kafkaStreamConfig)
        && Objects.equals(kinesisStreamConfig, that.kinesisStreamConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkaStreamConfig, kinesisStreamConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamSourceConfig.class)
        .add("kafkaStreamConfig", kafkaStreamConfig)
        .add("kinesisStreamConfig", kinesisStreamConfig)
        .toString();
  }
}
