// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Constraints applied to serverless automated workloads by a compute policy. */
@Generated
public class AutomatedConstraints {
  /** Maximum per-workload Spark executor allocation. Absence imposes no limit. */
  @JsonProperty("per_workload_max")
  private RateLimitConfig perWorkloadMax;

  public AutomatedConstraints setPerWorkloadMax(RateLimitConfig perWorkloadMax) {
    this.perWorkloadMax = perWorkloadMax;
    return this;
  }

  public RateLimitConfig getPerWorkloadMax() {
    return perWorkloadMax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutomatedConstraints that = (AutomatedConstraints) o;
    return Objects.equals(perWorkloadMax, that.perWorkloadMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perWorkloadMax);
  }

  @Override
  public String toString() {
    return new ToStringer(AutomatedConstraints.class)
        .add("perWorkloadMax", perWorkloadMax)
        .toString();
  }
}
