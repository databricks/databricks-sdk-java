// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Run repair was initiated. */
@Generated
class RepairRunResponsePb {
  @JsonProperty("repair_id")
  private Long repairId;

  public RepairRunResponsePb setRepairId(Long repairId) {
    this.repairId = repairId;
    return this;
  }

  public Long getRepairId() {
    return repairId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepairRunResponsePb that = (RepairRunResponsePb) o;
    return Objects.equals(repairId, that.repairId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repairId);
  }

  @Override
  public String toString() {
    return new ToStringer(RepairRunResponsePb.class).add("repairId", repairId).toString();
  }
}
