// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateKafkaConfigRequest {
  /** The Kafka config to update. */
  @JsonProperty("kafka_config")
  private KafkaConfig kafkaConfig;

  /**
   * Name that uniquely identifies this Kafka config within the metastore. This will be the
   * identifier used from the Feature object to reference these configs for a feature. Can be
   * distinct from topic name.
   */
  @JsonIgnore private String name;

  /** The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateKafkaConfigRequest setKafkaConfig(KafkaConfig kafkaConfig) {
    this.kafkaConfig = kafkaConfig;
    return this;
  }

  public KafkaConfig getKafkaConfig() {
    return kafkaConfig;
  }

  public UpdateKafkaConfigRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateKafkaConfigRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateKafkaConfigRequest that = (UpdateKafkaConfigRequest) o;
    return Objects.equals(kafkaConfig, that.kafkaConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkaConfig, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateKafkaConfigRequest.class)
        .add("kafkaConfig", kafkaConfig)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
