// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RepairRunResponse {
  /** The ID of the repair. */
  @JsonProperty("repair_id")
  private Long repairId;

  public RepairRunResponse setRepairId(Long repairId) {
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
    RepairRunResponse that = (RepairRunResponse) o;
    return Objects.equals(repairId, that.repairId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repairId);
  }

  @Override
  public String toString() {
    return new ToStringer(RepairRunResponse.class).add("repairId", repairId).toString();
  }
}
