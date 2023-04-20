// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Metric {
  /** Key identifying this metric. */
  @JsonProperty("key")
  private String key;

  /** Step at which to log the metric. */
  @JsonProperty("step")
  private Long step;

  /** The timestamp at which this metric was recorded. */
  @JsonProperty("timestamp")
  private Long timestamp;

  /** Value associated with this metric. */
  @JsonProperty("value")
  private Float value;

  public Metric setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public Metric setStep(Long step) {
    this.step = step;
    return this;
  }

  public Long getStep() {
    return step;
  }

  public Metric setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public Metric setValue(Float value) {
    this.value = value;
    return this;
  }

  public Float getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metric that = (Metric) o;
    return Objects.equals(key, that.key)
        && Objects.equals(step, that.step)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, step, timestamp, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Metric.class)
        .add("key", key)
        .add("step", step)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}
