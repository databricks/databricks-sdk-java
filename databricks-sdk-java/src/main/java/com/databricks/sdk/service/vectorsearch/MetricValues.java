// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Collection of metric values for a specific metric */
@Generated
public class MetricValues {
  /** Metric specification */
  @JsonProperty("metric")
  private Metric metric;

  /** Time series of metric values */
  @JsonProperty("values")
  private Collection<MetricValue> values;

  public MetricValues setMetric(Metric metric) {
    this.metric = metric;
    return this;
  }

  public Metric getMetric() {
    return metric;
  }

  public MetricValues setValues(Collection<MetricValue> values) {
    this.values = values;
    return this;
  }

  public Collection<MetricValue> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetricValues that = (MetricValues) o;
    return Objects.equals(metric, that.metric) && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, values);
  }

  @Override
  public String toString() {
    return new ToStringer(MetricValues.class)
        .add("metric", metric)
        .add("values", values)
        .toString();
  }
}
