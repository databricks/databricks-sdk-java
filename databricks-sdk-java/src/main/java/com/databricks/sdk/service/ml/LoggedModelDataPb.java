// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A LoggedModelData message includes logged model params and linked metrics. */
@Generated
class LoggedModelDataPb {
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  @JsonProperty("params")
  private Collection<LoggedModelParameter> params;

  public LoggedModelDataPb setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public LoggedModelDataPb setParams(Collection<LoggedModelParameter> params) {
    this.params = params;
    return this;
  }

  public Collection<LoggedModelParameter> getParams() {
    return params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LoggedModelDataPb that = (LoggedModelDataPb) o;
    return Objects.equals(metrics, that.metrics) && Objects.equals(params, that.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, params);
  }

  @Override
  public String toString() {
    return new ToStringer(LoggedModelDataPb.class)
        .add("metrics", metrics)
        .add("params", params)
        .toString();
  }
}
