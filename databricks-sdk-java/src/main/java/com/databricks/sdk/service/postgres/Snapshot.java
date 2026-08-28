// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * An immutable, point-in-time copy of a branch's data within a project. It remains available after
 * the source branch is deleted.
 */
@Generated
public class Snapshot {
  /** When the snapshot was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The resource name of the snapshot. Format: projects/{project_id}/snapshots/{snapshot_id} */
  @JsonProperty("name")
  private String name;

  /** The user-chosen ID; the final segment of `name`. */
  @JsonProperty("snapshot_id")
  private String snapshotId;

  /** Client-provided configuration of the snapshot. */
  @JsonProperty("spec")
  private SnapshotSpec spec;

  /** Server-observed state of the snapshot. */
  @JsonProperty("status")
  private SnapshotStatus status;

  /** Unique system-generated ID for the snapshot. */
  @JsonProperty("uid")
  private String uid;

  public Snapshot setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Snapshot setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Snapshot setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  public String getSnapshotId() {
    return snapshotId;
  }

  public Snapshot setSpec(SnapshotSpec spec) {
    this.spec = spec;
    return this;
  }

  public SnapshotSpec getSpec() {
    return spec;
  }

  public Snapshot setStatus(SnapshotStatus status) {
    this.status = status;
    return this;
  }

  public SnapshotStatus getStatus() {
    return status;
  }

  public Snapshot setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Snapshot that = (Snapshot) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(snapshotId, that.snapshotId)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, snapshotId, spec, status, uid);
  }

  @Override
  public String toString() {
    return new ToStringer(Snapshot.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("snapshotId", snapshotId)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .toString();
  }
}
