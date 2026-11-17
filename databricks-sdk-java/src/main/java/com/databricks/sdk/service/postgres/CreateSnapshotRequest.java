// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSnapshotRequest {
  /** The project in which to create the snapshot. Format: projects/{project_id} */
  @JsonIgnore private String parent;

  /**
   * The snapshot to create. Only `spec` is read from this message; the system sets the other
   * fields.
   */
  @JsonProperty("snapshot")
  private Snapshot snapshot;

  /**
   * Client-chosen ID for the snapshot. It becomes the final segment of the snapshot resource name
   * and cannot be changed after creation. The ID must be 3 to 63 characters long, start with a
   * lowercase letter, end with a lowercase letter or digit, and contain only lowercase letters,
   * digits, and hyphens.
   */
  @JsonIgnore
  @QueryParam("snapshot_id")
  private String snapshotId;

  public CreateSnapshotRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateSnapshotRequest setSnapshot(Snapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public Snapshot getSnapshot() {
    return snapshot;
  }

  public CreateSnapshotRequest setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  public String getSnapshotId() {
    return snapshotId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSnapshotRequest that = (CreateSnapshotRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(snapshot, that.snapshot)
        && Objects.equals(snapshotId, that.snapshotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, snapshot, snapshotId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSnapshotRequest.class)
        .add("parent", parent)
        .add("snapshot", snapshot)
        .add("snapshotId", snapshotId)
        .toString();
  }
}
