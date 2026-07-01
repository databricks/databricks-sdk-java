// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Inference table payload logging configuration */
@Generated
public class TelemetryInferenceTableConfig {
  /** The full name of the inference table created for this endpoint. */
  @JsonProperty("name")
  private String name;

  /**
   * Fraction of requests sampled for payload logging, in the range [0.0, 1.0], where 1.0 logs all
   * requests.
   */
  @JsonProperty("sampling_fraction")
  private Double samplingFraction;

  public TelemetryInferenceTableConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TelemetryInferenceTableConfig setSamplingFraction(Double samplingFraction) {
    this.samplingFraction = samplingFraction;
    return this;
  }

  public Double getSamplingFraction() {
    return samplingFraction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TelemetryInferenceTableConfig that = (TelemetryInferenceTableConfig) o;
    return Objects.equals(name, that.name)
        && Objects.equals(samplingFraction, that.samplingFraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, samplingFraction);
  }

  @Override
  public String toString() {
    return new ToStringer(TelemetryInferenceTableConfig.class)
        .add("name", name)
        .add("samplingFraction", samplingFraction)
        .toString();
  }
}
