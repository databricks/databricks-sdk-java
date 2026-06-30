// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateKafkaConfigRequest {
  /** */
  @JsonProperty("kafka_config")
  private KafkaConfig kafkaConfig;

  public CreateKafkaConfigRequest setKafkaConfig(KafkaConfig kafkaConfig) {
    this.kafkaConfig = kafkaConfig;
    return this;
  }

  public KafkaConfig getKafkaConfig() {
    return kafkaConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateKafkaConfigRequest that = (CreateKafkaConfigRequest) o;
    return Objects.equals(kafkaConfig, that.kafkaConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkaConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateKafkaConfigRequest.class)
        .add("kafkaConfig", kafkaConfig)
        .toString();
  }
}
