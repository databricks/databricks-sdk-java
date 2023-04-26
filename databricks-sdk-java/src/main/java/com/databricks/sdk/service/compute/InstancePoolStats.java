// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>InstancePoolStats class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class InstancePoolStats {
  /** Number of active instances in the pool that are NOT part of a cluster. */
  @JsonProperty("idle_count")
  private Long idleCount;

  /** Number of pending instances in the pool that are NOT part of a cluster. */
  @JsonProperty("pending_idle_count")
  private Long pendingIdleCount;

  /** Number of pending instances in the pool that are part of a cluster. */
  @JsonProperty("pending_used_count")
  private Long pendingUsedCount;

  /** Number of active instances in the pool that are part of a cluster. */
  @JsonProperty("used_count")
  private Long usedCount;

  /**
   * <p>Setter for the field <code>idleCount</code>.</p>
   *
   * @param idleCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolStats} object
   */
  public InstancePoolStats setIdleCount(Long idleCount) {
    this.idleCount = idleCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>idleCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getIdleCount() {
    return idleCount;
  }

  /**
   * <p>Setter for the field <code>pendingIdleCount</code>.</p>
   *
   * @param pendingIdleCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolStats} object
   */
  public InstancePoolStats setPendingIdleCount(Long pendingIdleCount) {
    this.pendingIdleCount = pendingIdleCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>pendingIdleCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPendingIdleCount() {
    return pendingIdleCount;
  }

  /**
   * <p>Setter for the field <code>pendingUsedCount</code>.</p>
   *
   * @param pendingUsedCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolStats} object
   */
  public InstancePoolStats setPendingUsedCount(Long pendingUsedCount) {
    this.pendingUsedCount = pendingUsedCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>pendingUsedCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPendingUsedCount() {
    return pendingUsedCount;
  }

  /**
   * <p>Setter for the field <code>usedCount</code>.</p>
   *
   * @param usedCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolStats} object
   */
  public InstancePoolStats setUsedCount(Long usedCount) {
    this.usedCount = usedCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>usedCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUsedCount() {
    return usedCount;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolStats that = (InstancePoolStats) o;
    return Objects.equals(idleCount, that.idleCount)
        && Objects.equals(pendingIdleCount, that.pendingIdleCount)
        && Objects.equals(pendingUsedCount, that.pendingUsedCount)
        && Objects.equals(usedCount, that.usedCount);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(idleCount, pendingIdleCount, pendingUsedCount, usedCount);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(InstancePoolStats.class)
        .add("idleCount", idleCount)
        .add("pendingIdleCount", pendingIdleCount)
        .add("pendingUsedCount", pendingUsedCount)
        .add("usedCount", usedCount)
        .toString();
  }
}
