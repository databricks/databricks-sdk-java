// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AutoScalePb {
  @JsonProperty("max_workers")
  private Long maxWorkers;

  @JsonProperty("min_workers")
  private Long minWorkers;

  public AutoScalePb setMaxWorkers(Long maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  public Long getMaxWorkers() {
    return maxWorkers;
  }

  public AutoScalePb setMinWorkers(Long minWorkers) {
    this.minWorkers = minWorkers;
    return this;
  }

  public Long getMinWorkers() {
    return minWorkers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoScalePb that = (AutoScalePb) o;
    return Objects.equals(maxWorkers, that.maxWorkers)
        && Objects.equals(minWorkers, that.minWorkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWorkers, minWorkers);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoScalePb.class)
        .add("maxWorkers", maxWorkers)
        .add("minWorkers", minWorkers)
        .toString();
  }
}
