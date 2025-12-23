// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class BranchSpec {
  /** Whether the branch is the project's default branch. */
  @JsonProperty("default")
  private Boolean defaultValue;

  /** Whether the branch is protected. */
  @JsonProperty("is_protected")
  private Boolean isProtected;

  /**
   * The name of the source branch from which this branch was created. Format:
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

  public BranchSpec setDefault(Boolean defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public Boolean getDefault() {
    return defaultValue;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BranchSpec that = (BranchSpec) o;
    return Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(isProtected, that.isProtected)
        && Objects.equals(sourceBranch, that.sourceBranch)
        && Objects.equals(sourceBranchLsn, that.sourceBranchLsn)
        && Objects.equals(sourceBranchTime, that.sourceBranchTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, isProtected, sourceBranch, sourceBranchLsn, sourceBranchTime);
  }

  @Override
  public String toString() {
    return new ToStringer(BranchSpec.class)
        .add("defaultValue", defaultValue)
        .add("isProtected", isProtected)
        .add("sourceBranch", sourceBranch)
        .add("sourceBranchLsn", sourceBranchLsn)
        .add("sourceBranchTime", sourceBranchTime)
        .toString();
  }
}
