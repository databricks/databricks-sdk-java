// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobsHealthRule {
  /** */
  @JsonProperty("metric")
  private JobsHealthMetric metric;

  /** */
  @JsonProperty("op")
  private JobsHealthOperator op;

  /**
   * Specifies the threshold value that the health metric should obey to satisfy the health rule.
   */
  @JsonProperty("value")
  private Long value;

  public JobsHealthRule setMetric(JobsHealthMetric metric) {
    this.metric = metric;
    return this;
  }

  public JobsHealthMetric getMetric() {
    return metric;
  }

  public JobsHealthRule setOp(JobsHealthOperator op) {
    this.op = op;
    return this;
  }

  public JobsHealthOperator getOp() {
    return op;
  }

  public JobsHealthRule setValue(Long value) {
    this.value = value;
    return this;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobsHealthRule that = (JobsHealthRule) o;
    return Objects.equals(metric, that.metric)
        && Objects.equals(op, that.op)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, op, value);
  }

  @Override
  public String toString() {
    return new ToStringer(JobsHealthRule.class)
        .add("metric", metric)
        .add("op", op)
        .add("value", value)
        .toString();
  }
}
