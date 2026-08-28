// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSnapshotScheduleRequest {
  /**
   * The resource name of the branch's snapshot schedule. Format:
   * projects/{project_id}/branches/{branch_id}/snapshot-schedule
   */
  @JsonIgnore private String name;

  /**
   * The snapshot schedule to set. Its `name` identifies the branch. Format:
   * projects/{project_id}/branches/{branch_id}/snapshot-schedule
   */
  @JsonProperty("snapshot_schedule")
  private SnapshotSchedule snapshotSchedule;

  /**
   * Fields to update. The only updatable path is `schedule`, which replaces the entire set of
   * cadences.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSnapshotScheduleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSnapshotScheduleRequest setSnapshotSchedule(SnapshotSchedule snapshotSchedule) {
    this.snapshotSchedule = snapshotSchedule;
    return this;
  }

  public SnapshotSchedule getSnapshotSchedule() {
    return snapshotSchedule;
  }

  public UpdateSnapshotScheduleRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSnapshotScheduleRequest that = (UpdateSnapshotScheduleRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(snapshotSchedule, that.snapshotSchedule)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snapshotSchedule, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSnapshotScheduleRequest.class)
        .add("name", name)
        .add("snapshotSchedule", snapshotSchedule)
        .add("updateMask", updateMask)
        .toString();
  }
}
