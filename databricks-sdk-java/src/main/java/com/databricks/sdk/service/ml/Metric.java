// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Metric class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Metric} object
   */
  public Metric setKey(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Getter for the field <code>key</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * <p>Setter for the field <code>step</code>.</p>
   *
   * @param step a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Metric} object
   */
  public Metric setStep(Long step) {
    this.step = step;
    return this;
  }

  /**
   * <p>Getter for the field <code>step</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStep() {
    return step;
  }

  /**
   * <p>Setter for the field <code>timestamp</code>.</p>
   *
   * @param timestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Metric} object
   */
  public Metric setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>timestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.ml.Metric} object
   */
  public Metric setValue(Float value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.Float} object
   */
  public Float getValue() {
    return value;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, step, timestamp, value);
  }

  /** {@inheritDoc} */
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
