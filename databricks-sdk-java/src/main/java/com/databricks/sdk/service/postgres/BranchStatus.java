// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class BranchStatus {
  /** The branch's state, indicating if it is initializing, ready for use, or archived. */
  @JsonProperty("current_state")
  private BranchStatusState currentState;

  /** Whether the branch is the project's default branch. */
  @JsonProperty("default")
  private Boolean defaultValue;

  /** Whether the branch is protected. */
  @JsonProperty("is_protected")
  private Boolean isProtected;

  /** The logical size of the branch. */
  @JsonProperty("logical_size_bytes")
  private Long logicalSizeBytes;

  /** The pending state of the branch, if a state transition is in progress. */
  @JsonProperty("pending_state")
  private BranchStatusState pendingState;

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

  /** A timestamp indicating when the `current_state` began. */
  @JsonProperty("state_change_time")
  private Timestamp stateChangeTime;

  public BranchStatus setCurrentState(BranchStatusState currentState) {
    this.currentState = currentState;
    return this;
  }

  public BranchStatusState getCurrentState() {
    return currentState;
  }

  public BranchStatus setDefault(Boolean defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public Boolean getDefault() {
    return defaultValue;
  }

  public BranchStatus setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

  public Boolean getIsProtected() {
    return isProtected;
  }

  public BranchStatus setLogicalSizeBytes(Long logicalSizeBytes) {
    this.logicalSizeBytes = logicalSizeBytes;
    return this;
  }

  public Long getLogicalSizeBytes() {
    return logicalSizeBytes;
  }

  public BranchStatus setPendingState(BranchStatusState pendingState) {
    this.pendingState = pendingState;
    return this;
  }

  public BranchStatusState getPendingState() {
    return pendingState;
  }

  public BranchStatus setSourceBranch(String sourceBranch) {
    this.sourceBranch = sourceBranch;
    return this;
  }

  public String getSourceBranch() {
    return sourceBranch;
  }

  public BranchStatus setSourceBranchLsn(String sourceBranchLsn) {
    this.sourceBranchLsn = sourceBranchLsn;
    return this;
  }

  public String getSourceBranchLsn() {
    return sourceBranchLsn;
  }

  public BranchStatus setSourceBranchTime(Timestamp sourceBranchTime) {
    this.sourceBranchTime = sourceBranchTime;
    return this;
  }

  public Timestamp getSourceBranchTime() {
    return sourceBranchTime;
  }

  public BranchStatus setStateChangeTime(Timestamp stateChangeTime) {
    this.stateChangeTime = stateChangeTime;
    return this;
  }

  public Timestamp getStateChangeTime() {
    return stateChangeTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BranchStatus that = (BranchStatus) o;
    return Objects.equals(currentState, that.currentState)
        && Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(isProtected, that.isProtected)
        && Objects.equals(logicalSizeBytes, that.logicalSizeBytes)
        && Objects.equals(pendingState, that.pendingState)
        && Objects.equals(sourceBranch, that.sourceBranch)
        && Objects.equals(sourceBranchLsn, that.sourceBranchLsn)
        && Objects.equals(sourceBranchTime, that.sourceBranchTime)
        && Objects.equals(stateChangeTime, that.stateChangeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        currentState,
        defaultValue,
        isProtected,
        logicalSizeBytes,
        pendingState,
        sourceBranch,
        sourceBranchLsn,
        sourceBranchTime,
        stateChangeTime);
  }

  @Override
  public String toString() {
    return new ToStringer(BranchStatus.class)
        .add("currentState", currentState)
        .add("defaultValue", defaultValue)
        .add("isProtected", isProtected)
        .add("logicalSizeBytes", logicalSizeBytes)
        .add("pendingState", pendingState)
        .add("sourceBranch", sourceBranch)
        .add("sourceBranchLsn", sourceBranchLsn)
        .add("sourceBranchTime", sourceBranchTime)
        .add("stateChangeTime", stateChangeTime)
        .toString();
  }
}
