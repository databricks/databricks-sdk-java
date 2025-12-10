// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DataSource {
  /** */
  @JsonProperty("delta_table_source")
  private DeltaTableSource deltaTableSource;

  /** */
  @JsonProperty("kafka_source")
  private KafkaSource kafkaSource;

  public DataSource setDeltaTableSource(DeltaTableSource deltaTableSource) {
    this.deltaTableSource = deltaTableSource;
    return this;
  }

  public DeltaTableSource getDeltaTableSource() {
    return deltaTableSource;
  }

  public DataSource setKafkaSource(KafkaSource kafkaSource) {
    this.kafkaSource = kafkaSource;
    return this;
  }

  public KafkaSource getKafkaSource() {
    return kafkaSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSource that = (DataSource) o;
    return Objects.equals(deltaTableSource, that.deltaTableSource)
        && Objects.equals(kafkaSource, that.kafkaSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableSource, kafkaSource);
  }

  @Override
  public String toString() {
    return new ToStringer(DataSource.class)
        .add("deltaTableSource", deltaTableSource)
        .add("kafkaSource", kafkaSource)
        .toString();
  }
}
