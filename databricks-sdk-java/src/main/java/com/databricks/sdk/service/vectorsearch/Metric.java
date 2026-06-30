// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Metric specification */
@Generated
public class Metric {
  /** Metric labels */
  @JsonProperty("labels")
  private Collection<MetricLabel> labels;

  /** Metric name */
  @JsonProperty("name")
  private String name;

  /** Percentile for the metric */
  @JsonProperty("percentile")
  private Double percentile;

  public Metric setLabels(Collection<MetricLabel> labels) {
    this.labels = labels;
    return this;
  }

  public Collection<MetricLabel> getLabels() {
    return labels;
  }

  public Metric setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Metric setPercentile(Double percentile) {
    this.percentile = percentile;
    return this;
  }

  public Double getPercentile() {
    return percentile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metric that = (Metric) o;
    return Objects.equals(labels, that.labels)
        && Objects.equals(name, that.name)
        && Objects.equals(percentile, that.percentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, name, percentile);
  }

  @Override
  public String toString() {
    return new ToStringer(Metric.class)
        .add("labels", labels)
        .add("name", name)
        .add("percentile", percentile)
        .toString();
  }
}
