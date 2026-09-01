// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * Kinesis-specific configuration for a Stream. For the underlying connector and its source options,
 * see the Databricks documentation on connecting to Amazon Kinesis
 * (https://docs.databricks.com/aws/en/connect/streaming/kinesis).
 */
@Generated
public class KinesisStreamConfig {
  /**
   * Optional Kinesis source options, validated against a server-side allowlist at request time.
   * Allowed keys: - `consumerMode` - `consumerNamePrefix` - `maxFetchRate` - `minFetchPeriod` -
   * `maxFetchDuration` - `maxRecordsPerFetch` - `shardsPerTask` - `fetchBufferSize` -
   * `shardFetchInterval` `consumerMode` must be `efo` or `polling` (case-insensitive).
   * `maxRecordsPerFetch` applies only during ingestion and does not affect the materialization
   * pipeline. Auth and connection details belong on the parent Stream's `connection_config`, not
   * here.
   */
  @JsonProperty("extra_options")
  private Map<String, String> extraOptions;

  /** Kinesis stream ARNs to read from. */
  @JsonProperty("stream_arns")
  private StreamArnList streamArns;

  /** Kinesis stream names to read from. */
  @JsonProperty("stream_names")
  private StreamNameList streamNames;

  public KinesisStreamConfig setExtraOptions(Map<String, String> extraOptions) {
    this.extraOptions = extraOptions;
    return this;
  }

  public Map<String, String> getExtraOptions() {
    return extraOptions;
  }

  public KinesisStreamConfig setStreamArns(StreamArnList streamArns) {
    this.streamArns = streamArns;
    return this;
  }

  public StreamArnList getStreamArns() {
    return streamArns;
  }

  public KinesisStreamConfig setStreamNames(StreamNameList streamNames) {
    this.streamNames = streamNames;
    return this;
  }

  public StreamNameList getStreamNames() {
    return streamNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KinesisStreamConfig that = (KinesisStreamConfig) o;
    return Objects.equals(extraOptions, that.extraOptions)
        && Objects.equals(streamArns, that.streamArns)
        && Objects.equals(streamNames, that.streamNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraOptions, streamArns, streamNames);
  }

  @Override
  public String toString() {
    return new ToStringer(KinesisStreamConfig.class)
        .add("extraOptions", extraOptions)
        .add("streamArns", streamArns)
        .add("streamNames", streamNames)
        .toString();
  }
}
