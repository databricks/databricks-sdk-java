// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class BranchSpec {
  /** Absolute expiration timestamp. When set, the branch will expire at this time. */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  /**
   * When set to true, protects the branch from deletion and reset. Associated compute endpoints and
   * the project cannot be deleted while the branch is protected.
   */
  @JsonProperty("is_protected")
  private Boolean isProtected;

  /**
   * The name of the source branch from which this branch was created (data lineage for
   * point-in-time recovery). If not specified, defaults to the project's default branch. Format:
   * projects/{project_id}/branches/{branch_id}
   */
  @JsonProperty("source_branch")
  private String sourceBranch;

  /** The Log Sequence Number (LSN) on the source branch from which this branch was created. */
  @JsonProperty("source_branch_lsn")
  private String sourceBranchLsn;

  /** The point in time on the source branch from which this branch was created. */
  @JsonProperty("source_branch_time")
  private Timestamp sourceBranchTime;

  /**
   * Relative time-to-live duration. When set, the branch will expire at creation_time + ttl. Set to
   * -1 second to explicitly disable expiration.
   */
  @JsonProperty("ttl")
  private Duration ttl;

  public BranchSpec setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
  }

  public BranchSpec setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

  public Boolean getIsProtected() {
    return isProtected;
  }

  public BranchSpec setSourceBranch(String sourceBranch) {
    this.sourceBranch = sourceBranch;
    return this;
  }

  public String getSourceBranch() {
    return sourceBranch;
  }

  public BranchSpec setSourceBranchLsn(String sourceBranchLsn) {
    this.sourceBranchLsn = sourceBranchLsn;
    return this;
  }

  public String getSourceBranchLsn() {
    return sourceBranchLsn;
  }

  public BranchSpec setSourceBranchTime(Timestamp sourceBranchTime) {
    this.sourceBranchTime = sourceBranchTime;
    return this;
  }

  public Timestamp getSourceBranchTime() {
    return sourceBranchTime;
  }

  public BranchSpec setTtl(Duration ttl) {
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
    BranchSpec that = (BranchSpec) o;
    return Objects.equals(expireTime, that.expireTime)
        && Objects.equals(isProtected, that.isProtected)
        && Objects.equals(sourceBranch, that.sourceBranch)
        && Objects.equals(sourceBranchLsn, that.sourceBranchLsn)
        && Objects.equals(sourceBranchTime, that.sourceBranchTime)
        && Objects.equals(ttl, that.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        expireTime, isProtected, sourceBranch, sourceBranchLsn, sourceBranchTime, ttl);
  }

  @Override
  public String toString() {
    return new ToStringer(BranchSpec.class)
        .add("expireTime", expireTime)
        .add("isProtected", isProtected)
        .add("sourceBranch", sourceBranch)
        .add("sourceBranchLsn", sourceBranchLsn)
        .add("sourceBranchTime", sourceBranchTime)
        .add("ttl", ttl)
        .toString();
  }
}
