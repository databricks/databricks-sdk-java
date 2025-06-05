// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Run data (metrics, params, and tags). */
@Generated
class RunDataPb {
  @JsonProperty("metrics")
  private Collection<Metric> metrics;

  @JsonProperty("params")
  private Collection<Param> params;

  @JsonProperty("tags")
  private Collection<RunTag> tags;

  public RunDataPb setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public RunDataPb setParams(Collection<Param> params) {
    this.params = params;
    return this;
  }

  public Collection<Param> getParams() {
    return params;
  }

  public RunDataPb setTags(Collection<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<RunTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunDataPb that = (RunDataPb) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(params, that.params)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, params, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(RunDataPb.class)
        .add("metrics", metrics)
        .add("params", params)
        .add("tags", tags)
        .toString();
  }
}
