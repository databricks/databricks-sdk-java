// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Server-observed state of a snapshot. */
@Generated
public class SnapshotStatus {
  /**
   * Incremental storage size in bytes since the previous snapshot. Unset when the snapshot is not
   * billed on incremental usage.
   */
  @JsonProperty("diff_size_bytes")
  private Long diffSizeBytes;

  /** Absolute time at which the snapshot is deleted. */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  /** Full logical size of the snapshot, in bytes. */
  @JsonProperty("full_size_bytes")
  private Long fullSizeBytes;

  /** True if the snapshot never expires. */
  @JsonProperty("no_expiry")
  private Boolean noExpiry;

  /**
   * The source branch the snapshot was taken from. Format:
   * projects/{project_id}/branches/{branch_id}
   */
  @JsonProperty("source_branch")
  private String sourceBranch;

  public SnapshotStatus setDiffSizeBytes(Long diffSizeBytes) {
    this.diffSizeBytes = diffSizeBytes;
    return this;
  }

  public Long getDiffSizeBytes() {
    return diffSizeBytes;
  }

  public SnapshotStatus setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
  }

  public SnapshotStatus setFullSizeBytes(Long fullSizeBytes) {
    this.fullSizeBytes = fullSizeBytes;
    return this;
  }

  public Long getFullSizeBytes() {
    return fullSizeBytes;
  }

  public SnapshotStatus setNoExpiry(Boolean noExpiry) {
    this.noExpiry = noExpiry;
    return this;
  }

  public Boolean getNoExpiry() {
    return noExpiry;
  }

  public SnapshotStatus setSourceBranch(String sourceBranch) {
    this.sourceBranch = sourceBranch;
    return this;
  }

  public String getSourceBranch() {
    return sourceBranch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SnapshotStatus that = (SnapshotStatus) o;
    return Objects.equals(diffSizeBytes, that.diffSizeBytes)
        && Objects.equals(expireTime, that.expireTime)
        && Objects.equals(fullSizeBytes, that.fullSizeBytes)
        && Objects.equals(noExpiry, that.noExpiry)
        && Objects.equals(sourceBranch, that.sourceBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diffSizeBytes, expireTime, fullSizeBytes, noExpiry, sourceBranch);
  }

  @Override
  public String toString() {
    return new ToStringer(SnapshotStatus.class)
        .add("diffSizeBytes", diffSizeBytes)
        .add("expireTime", expireTime)
        .add("fullSizeBytes", fullSizeBytes)
        .add("noExpiry", noExpiry)
        .add("sourceBranch", sourceBranch)
        .toString();
  }
}
