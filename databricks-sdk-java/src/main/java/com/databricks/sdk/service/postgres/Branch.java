// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class Branch {
  /** A timestamp indicating when the branch was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The branch's state, indicating if it is initializing, ready for use, or archived. */
  @JsonProperty("current_state")
  private String currentState;

  /**
   * Whether the branch is the project's default branch. This field is only returned on
   * create/update responses. See effective_default for the value that is actually applied to the
   * branch.
   */
  @JsonProperty("default")
  private Boolean defaultValue;

  /** Whether the branch is the project's default branch. */
  @JsonProperty("effective_default")
  private Boolean effectiveDefault;

  /** Whether the branch is protected. */
  @JsonProperty("effective_is_protected")
  private Boolean effectiveIsProtected;

  /**
   * The name of the source branch from which this branch was created. Format:
   * projects/{project_id}/branches/{branch_id}
   */
  @JsonProperty("effective_source_branch")
  private String effectiveSourceBranch;

  /** The Log Sequence Number (LSN) on the source branch from which this branch was created. */
  @JsonProperty("effective_source_branch_lsn")
  private String effectiveSourceBranchLsn;

  /** The point in time on the source branch from which this branch was created. */
  @JsonProperty("effective_source_branch_time")
  private Timestamp effectiveSourceBranchTime;

  /** Whether the branch is protected. */
  @JsonProperty("is_protected")
  private Boolean isProtected;

  /** The logical size of the branch. */
  @JsonProperty("logical_size_bytes")
  private Long logicalSizeBytes;

  /** The resource name of the branch. Format: projects/{project_id}/branches/{branch_id} */
  @JsonProperty("name")
  private String name;

  /** The project containing this branch. Format: projects/{project_id} */
  @JsonProperty("parent")
  private String parent;

  /** */
  @JsonProperty("pending_state")
  private String pendingState;

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

  /** System generated unique ID for the branch. */
  @JsonProperty("uid")
  private String uid;

  /** A timestamp indicating when the branch was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Branch setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Branch setCurrentState(String currentState) {
    this.currentState = currentState;
    return this;
  }

  public String getCurrentState() {
    return currentState;
  }

  public Branch setDefault(Boolean defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public Boolean getDefault() {
    return defaultValue;
  }

  public Branch setEffectiveDefault(Boolean effectiveDefault) {
    this.effectiveDefault = effectiveDefault;
    return this;
  }

  public Boolean getEffectiveDefault() {
    return effectiveDefault;
  }

  public Branch setEffectiveIsProtected(Boolean effectiveIsProtected) {
    this.effectiveIsProtected = effectiveIsProtected;
    return this;
  }

  public Boolean getEffectiveIsProtected() {
    return effectiveIsProtected;
  }

  public Branch setEffectiveSourceBranch(String effectiveSourceBranch) {
    this.effectiveSourceBranch = effectiveSourceBranch;
    return this;
  }

  public String getEffectiveSourceBranch() {
    return effectiveSourceBranch;
  }

  public Branch setEffectiveSourceBranchLsn(String effectiveSourceBranchLsn) {
    this.effectiveSourceBranchLsn = effectiveSourceBranchLsn;
    return this;
  }

  public String getEffectiveSourceBranchLsn() {
    return effectiveSourceBranchLsn;
  }

  public Branch setEffectiveSourceBranchTime(Timestamp effectiveSourceBranchTime) {
    this.effectiveSourceBranchTime = effectiveSourceBranchTime;
    return this;
  }

  public Timestamp getEffectiveSourceBranchTime() {
    return effectiveSourceBranchTime;
  }

  public Branch setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

  public Boolean getIsProtected() {
    return isProtected;
  }

  public Branch setLogicalSizeBytes(Long logicalSizeBytes) {
    this.logicalSizeBytes = logicalSizeBytes;
    return this;
  }

  public Long getLogicalSizeBytes() {
    return logicalSizeBytes;
  }

  public Branch setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Branch setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public Branch setPendingState(String pendingState) {
    this.pendingState = pendingState;
    return this;
  }

  public String getPendingState() {
    return pendingState;
  }

  public Branch setSourceBranch(String sourceBranch) {
    this.sourceBranch = sourceBranch;
    return this;
  }

  public String getSourceBranch() {
    return sourceBranch;
  }

  public Branch setSourceBranchLsn(String sourceBranchLsn) {
    this.sourceBranchLsn = sourceBranchLsn;
    return this;
  }

  public String getSourceBranchLsn() {
    return sourceBranchLsn;
  }

  public Branch setSourceBranchTime(Timestamp sourceBranchTime) {
    this.sourceBranchTime = sourceBranchTime;
    return this;
  }

  public Timestamp getSourceBranchTime() {
    return sourceBranchTime;
  }

  public Branch setStateChangeTime(Timestamp stateChangeTime) {
    this.stateChangeTime = stateChangeTime;
    return this;
  }

  public Timestamp getStateChangeTime() {
    return stateChangeTime;
  }

  public Branch setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public Branch setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Branch that = (Branch) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(currentState, that.currentState)
        && Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(effectiveDefault, that.effectiveDefault)
        && Objects.equals(effectiveIsProtected, that.effectiveIsProtected)
        && Objects.equals(effectiveSourceBranch, that.effectiveSourceBranch)
        && Objects.equals(effectiveSourceBranchLsn, that.effectiveSourceBranchLsn)
        && Objects.equals(effectiveSourceBranchTime, that.effectiveSourceBranchTime)
        && Objects.equals(isProtected, that.isProtected)
        && Objects.equals(logicalSizeBytes, that.logicalSizeBytes)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(pendingState, that.pendingState)
        && Objects.equals(sourceBranch, that.sourceBranch)
        && Objects.equals(sourceBranchLsn, that.sourceBranchLsn)
        && Objects.equals(sourceBranchTime, that.sourceBranchTime)
        && Objects.equals(stateChangeTime, that.stateChangeTime)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        currentState,
        defaultValue,
        effectiveDefault,
        effectiveIsProtected,
        effectiveSourceBranch,
        effectiveSourceBranchLsn,
        effectiveSourceBranchTime,
        isProtected,
        logicalSizeBytes,
        name,
        parent,
        pendingState,
        sourceBranch,
        sourceBranchLsn,
        sourceBranchTime,
        stateChangeTime,
        uid,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Branch.class)
        .add("createTime", createTime)
        .add("currentState", currentState)
        .add("defaultValue", defaultValue)
        .add("effectiveDefault", effectiveDefault)
        .add("effectiveIsProtected", effectiveIsProtected)
        .add("effectiveSourceBranch", effectiveSourceBranch)
        .add("effectiveSourceBranchLsn", effectiveSourceBranchLsn)
        .add("effectiveSourceBranchTime", effectiveSourceBranchTime)
        .add("isProtected", isProtected)
        .add("logicalSizeBytes", logicalSizeBytes)
        .add("name", name)
        .add("parent", parent)
        .add("pendingState", pendingState)
        .add("sourceBranch", sourceBranch)
        .add("sourceBranchLsn", sourceBranchLsn)
        .add("sourceBranchTime", sourceBranchTime)
        .add("stateChangeTime", stateChangeTime)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
