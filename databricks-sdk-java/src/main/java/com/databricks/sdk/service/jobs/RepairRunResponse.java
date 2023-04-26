// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RepairRunResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RepairRunResponse {
  /**
   * The ID of the repair. Must be provided in subsequent repairs using the `latest_repair_id` field
   * to ensure sequential repairs.
   */
  @JsonProperty("repair_id")
  private Long repairId;

  /**
   * <p>Setter for the field <code>repairId</code>.</p>
   *
   * @param repairId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRunResponse} object
   */
  public RepairRunResponse setRepairId(Long repairId) {
    this.repairId = repairId;
    return this;
  }

  /**
   * <p>Getter for the field <code>repairId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRepairId() {
    return repairId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepairRunResponse that = (RepairRunResponse) o;
    return Objects.equals(repairId, that.repairId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(repairId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RepairRunResponse.class).add("repairId", repairId).toString();
  }
}
