// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public InstancePoolStats setIdleCount(Long idleCount) {
    this.idleCount = idleCount;
    return this;
  }

  public Long getIdleCount() {
    return idleCount;
  }

  public InstancePoolStats setPendingIdleCount(Long pendingIdleCount) {
    this.pendingIdleCount = pendingIdleCount;
    return this;
  }

  public Long getPendingIdleCount() {
    return pendingIdleCount;
  }

  public InstancePoolStats setPendingUsedCount(Long pendingUsedCount) {
    this.pendingUsedCount = pendingUsedCount;
    return this;
  }

  public Long getPendingUsedCount() {
    return pendingUsedCount;
  }

  public InstancePoolStats setUsedCount(Long usedCount) {
    this.usedCount = usedCount;
    return this;
  }

  public Long getUsedCount() {
    return usedCount;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(idleCount, pendingIdleCount, pendingUsedCount, usedCount);
  }

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
