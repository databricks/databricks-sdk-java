// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class InstancePoolStatsPb {
  @JsonProperty("idle_count")
  private Long idleCount;

  @JsonProperty("pending_idle_count")
  private Long pendingIdleCount;

  @JsonProperty("pending_used_count")
  private Long pendingUsedCount;

  @JsonProperty("used_count")
  private Long usedCount;

  public InstancePoolStatsPb setIdleCount(Long idleCount) {
    this.idleCount = idleCount;
    return this;
  }

  public Long getIdleCount() {
    return idleCount;
  }

  public InstancePoolStatsPb setPendingIdleCount(Long pendingIdleCount) {
    this.pendingIdleCount = pendingIdleCount;
    return this;
  }

  public Long getPendingIdleCount() {
    return pendingIdleCount;
  }

  public InstancePoolStatsPb setPendingUsedCount(Long pendingUsedCount) {
    this.pendingUsedCount = pendingUsedCount;
    return this;
  }

  public Long getPendingUsedCount() {
    return pendingUsedCount;
  }

  public InstancePoolStatsPb setUsedCount(Long usedCount) {
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
    InstancePoolStatsPb that = (InstancePoolStatsPb) o;
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
    return new ToStringer(InstancePoolStatsPb.class)
        .add("idleCount", idleCount)
        .add("pendingIdleCount", pendingIdleCount)
        .add("pendingUsedCount", pendingUsedCount)
        .add("usedCount", usedCount)
        .toString();
  }
}
