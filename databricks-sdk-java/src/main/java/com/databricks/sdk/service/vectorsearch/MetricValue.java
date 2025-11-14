// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Single metric value at a specific timestamp */
@Generated
public class MetricValue {
  /** Timestamp of the metric value (milliseconds since epoch) */
  @JsonProperty("timestamp")
  private Long timestamp;

  /** Metric value */
  @JsonProperty("value")
  private Double value;

  public MetricValue setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public MetricValue setValue(Double value) {
    this.value = value;
    return this;
  }

  public Double getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetricValue that = (MetricValue) o;
    return Objects.equals(timestamp, that.timestamp) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, value);
  }

  @Override
  public String toString() {
    return new ToStringer(MetricValue.class)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}
