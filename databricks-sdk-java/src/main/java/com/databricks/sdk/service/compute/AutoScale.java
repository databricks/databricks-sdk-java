// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AutoScale class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AutoScale {
  /**
   * The maximum number of workers to which the cluster can scale up when overloaded. Note that
   * `max_workers` must be strictly greater than `min_workers`.
   */
  @JsonProperty("max_workers")
  private Long maxWorkers;

  /**
   * The minimum number of workers to which the cluster can scale down when underutilized. It is
   * also the initial number of workers the cluster will have after creation.
   */
  @JsonProperty("min_workers")
  private Long minWorkers;

  /**
   * <p>Setter for the field <code>maxWorkers</code>.</p>
   *
   * @param maxWorkers a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AutoScale} object
   */
  public AutoScale setMaxWorkers(Long maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxWorkers</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxWorkers() {
    return maxWorkers;
  }

  /**
   * <p>Setter for the field <code>minWorkers</code>.</p>
   *
   * @param minWorkers a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AutoScale} object
   */
  public AutoScale setMinWorkers(Long minWorkers) {
    this.minWorkers = minWorkers;
    return this;
  }

  /**
   * <p>Getter for the field <code>minWorkers</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMinWorkers() {
    return minWorkers;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoScale that = (AutoScale) o;
    return Objects.equals(maxWorkers, that.maxWorkers)
        && Objects.equals(minWorkers, that.minWorkers);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(maxWorkers, minWorkers);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AutoScale.class)
        .add("maxWorkers", maxWorkers)
        .add("minWorkers", minWorkers)
        .toString();
  }
}
