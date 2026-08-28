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

  /**
   * Completeness timing for this Feature's use of the source. This configuration is part of the
   * Feature definition; it does not modify the underlying table or stream.
   */
  @JsonProperty("lateness")
  private SourceLateness lateness;

  /** A request-time data source. */
  @JsonProperty("request_source")
  private RequestSource requestSource;

  /** A Stream data source. */
  @JsonProperty("stream_source")
  private StreamSource streamSource;

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

  public DataSource setLateness(SourceLateness lateness) {
    this.lateness = lateness;
    return this;
  }

  public SourceLateness getLateness() {
    return lateness;
  }

  public DataSource setRequestSource(RequestSource requestSource) {
    this.requestSource = requestSource;
    return this;
  }

  public RequestSource getRequestSource() {
    return requestSource;
  }

  public DataSource setStreamSource(StreamSource streamSource) {
    this.streamSource = streamSource;
    return this;
  }

  public StreamSource getStreamSource() {
    return streamSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSource that = (DataSource) o;
    return Objects.equals(deltaTableSource, that.deltaTableSource)
        && Objects.equals(kafkaSource, that.kafkaSource)
        && Objects.equals(lateness, that.lateness)
        && Objects.equals(requestSource, that.requestSource)
        && Objects.equals(streamSource, that.streamSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableSource, kafkaSource, lateness, requestSource, streamSource);
  }

  @Override
  public String toString() {
    return new ToStringer(DataSource.class)
        .add("deltaTableSource", deltaTableSource)
        .add("kafkaSource", kafkaSource)
        .add("lateness", lateness)
        .add("requestSource", requestSource)
        .add("streamSource", streamSource)
        .toString();
  }
}
