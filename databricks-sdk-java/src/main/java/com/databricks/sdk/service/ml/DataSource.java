// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Specifies the data source backing a feature. Exactly one source type must be set. */
@Generated
public class DataSource {
  /** A Delta table data source. */
  @JsonProperty("delta_table_source")
  private DeltaTableSource deltaTableSource;

  /** A Kafka stream data source. */
  @JsonProperty("kafka_source")
  private KafkaSource kafkaSource;

  /** A request-time data source. */
  @JsonProperty("request_source")
  private RequestSource requestSource;

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

  public DataSource setRequestSource(RequestSource requestSource) {
    this.requestSource = requestSource;
    return this;
  }

  public RequestSource getRequestSource() {
    return requestSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSource that = (DataSource) o;
    return Objects.equals(deltaTableSource, that.deltaTableSource)
        && Objects.equals(kafkaSource, that.kafkaSource)
        && Objects.equals(requestSource, that.requestSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableSource, kafkaSource, requestSource);
  }

  @Override
  public String toString() {
    return new ToStringer(DataSource.class)
        .add("deltaTableSource", deltaTableSource)
        .add("kafkaSource", kafkaSource)
        .add("requestSource", requestSource)
        .toString();
  }
}
