// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Client-provided configuration of the snapshot. */
@Generated
public class SnapshotSpec {
  /**
   * Absolute time at which the snapshot is deleted. Mutually exclusive with `ttl` and `no_expiry`.
   */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  /** If true, the snapshot never expires. Mutually exclusive with `ttl` and `expire_time`. */
  @JsonProperty("no_expiry")
  private Boolean noExpiry;

  /** The source branch to snapshot. Format: projects/{project_id}/branches/{branch_id} */
  @JsonProperty("source_branch")
  private String sourceBranch;

  /** LSN to snapshot from, e.g. `16/B374D848`. Mutually exclusive with `source_branch_time`. */
  @JsonProperty("source_branch_lsn")
  private String sourceBranchLsn;

  /** Timestamp to snapshot from. Mutually exclusive with `source_branch_lsn`. */
  @JsonProperty("source_branch_time")
  private Timestamp sourceBranchTime;

  /**
   * Time-to-live. The snapshot expires this long after it is created. Mutually exclusive with
   * `expire_time` and `no_expiry`. Reads report the resolved absolute `expire_time` instead.
   */
  @JsonProperty("ttl")
  private Duration ttl;

  public SnapshotSpec setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
  }

  public SnapshotSpec setNoExpiry(Boolean noExpiry) {
    this.noExpiry = noExpiry;
    return this;
  }

  public Boolean getNoExpiry() {
    return noExpiry;
  }

  public SnapshotSpec setSourceBranch(String sourceBranch) {
    this.sourceBranch = sourceBranch;
    return this;
  }

  public String getSourceBranch() {
    return sourceBranch;
  }

  public SnapshotSpec setSourceBranchLsn(String sourceBranchLsn) {
    this.sourceBranchLsn = sourceBranchLsn;
    return this;
  }

  public String getSourceBranchLsn() {
    return sourceBranchLsn;
  }

  public SnapshotSpec setSourceBranchTime(Timestamp sourceBranchTime) {
    this.sourceBranchTime = sourceBranchTime;
    return this;
  }

  public Timestamp getSourceBranchTime() {
    return sourceBranchTime;
  }

  public SnapshotSpec setTtl(Duration ttl) {
    this.ttl = ttl;
    return this;
  }

  public Duration getTtl() {
    return ttl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SnapshotSpec that = (SnapshotSpec) o;
    return Objects.equals(expireTime, that.expireTime)
        && Objects.equals(noExpiry, that.noExpiry)
        && Objects.equals(sourceBranch, that.sourceBranch)
        && Objects.equals(sourceBranchLsn, that.sourceBranchLsn)
        && Objects.equals(sourceBranchTime, that.sourceBranchTime)
        && Objects.equals(ttl, that.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireTime, noExpiry, sourceBranch, sourceBranchLsn, sourceBranchTime, ttl);
  }

  @Override
  public String toString() {
    return new ToStringer(SnapshotSpec.class)
        .add("expireTime", expireTime)
        .add("noExpiry", noExpiry)
        .add("sourceBranch", sourceBranch)
        .add("sourceBranchLsn", sourceBranchLsn)
        .add("sourceBranchTime", sourceBranchTime)
        .add("ttl", ttl)
        .toString();
  }
}
