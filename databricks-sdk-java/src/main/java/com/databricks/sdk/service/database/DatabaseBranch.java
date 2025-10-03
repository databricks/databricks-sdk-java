// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DatabaseBranch {
  /** */
  @JsonProperty("branch_id")
  private String branchId;

  /** A timestamp indicating when the branch was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** The branch’s state, indicating if it is initializing, ready for use, or archived. */
  @JsonProperty("current_state")
  private String currentState;

  /**
   * Whether the branch is the project's default branch. This field is only returned on
   * create/update responses. See effective_default for the value that is actually applied to the
   * database branch.
   */
  @JsonProperty("default")
  private Boolean defaultValue;

  /** Whether the branch is the project's default branch. */
  @JsonProperty("effective_default")
  private Boolean effectiveDefault;

  /** Whether the branch is protected. */
  @JsonProperty("is_protected")
  private Boolean isProtected;

  /** The logical size of the branch. */
  @JsonProperty("logical_size_bytes")
  private Long logicalSizeBytes;

  /** The id of the parent branch */
  @JsonProperty("parent_id")
  private String parentId;

  /**
   * The Log Sequence Number (LSN) on the parent branch from which this branch was created. When
   * restoring a branch using the Restore Database Branch endpoint, this value isn’t finalized until
   * all operations related to the restore have completed successfully.
   */
  @JsonProperty("parent_lsn")
  private String parentLsn;

  /** The point in time on the parent branch from which this branch was created. */
  @JsonProperty("parent_time")
  private String parentTime;

  /** */
  @JsonProperty("pending_state")
  private String pendingState;

  /** */
  @JsonProperty("project_id")
  private String projectId;

  /** A timestamp indicating when the `current_state` began. */
  @JsonProperty("state_change_time")
  private String stateChangeTime;

  /** A timestamp indicating when the branch was last updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public DatabaseBranch setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public DatabaseBranch setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public DatabaseBranch setCurrentState(String currentState) {
    this.currentState = currentState;
    return this;
  }

  public String getCurrentState() {
    return currentState;
  }

  public DatabaseBranch setDefault(Boolean defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public Boolean getDefault() {
    return defaultValue;
  }

  public DatabaseBranch setEffectiveDefault(Boolean effectiveDefault) {
    this.effectiveDefault = effectiveDefault;
    return this;
  }

  public Boolean getEffectiveDefault() {
    return effectiveDefault;
  }

  public DatabaseBranch setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

  public Boolean getIsProtected() {
    return isProtected;
  }

  public DatabaseBranch setLogicalSizeBytes(Long logicalSizeBytes) {
    this.logicalSizeBytes = logicalSizeBytes;
    return this;
  }

  public Long getLogicalSizeBytes() {
    return logicalSizeBytes;
  }

  public DatabaseBranch setParentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  public String getParentId() {
    return parentId;
  }

  public DatabaseBranch setParentLsn(String parentLsn) {
    this.parentLsn = parentLsn;
    return this;
  }

  public String getParentLsn() {
    return parentLsn;
  }

  public DatabaseBranch setParentTime(String parentTime) {
    this.parentTime = parentTime;
    return this;
  }

  public String getParentTime() {
    return parentTime;
  }

  public DatabaseBranch setPendingState(String pendingState) {
    this.pendingState = pendingState;
    return this;
  }

  public String getPendingState() {
    return pendingState;
  }

  public DatabaseBranch setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public DatabaseBranch setStateChangeTime(String stateChangeTime) {
    this.stateChangeTime = stateChangeTime;
    return this;
  }

  public String getStateChangeTime() {
    return stateChangeTime;
  }

  public DatabaseBranch setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseBranch that = (DatabaseBranch) o;
    return Objects.equals(branchId, that.branchId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(currentState, that.currentState)
        && Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(effectiveDefault, that.effectiveDefault)
        && Objects.equals(isProtected, that.isProtected)
        && Objects.equals(logicalSizeBytes, that.logicalSizeBytes)
        && Objects.equals(parentId, that.parentId)
        && Objects.equals(parentLsn, that.parentLsn)
        && Objects.equals(parentTime, that.parentTime)
        && Objects.equals(pendingState, that.pendingState)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(stateChangeTime, that.stateChangeTime)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branchId,
        createTime,
        currentState,
        defaultValue,
        effectiveDefault,
        isProtected,
        logicalSizeBytes,
        parentId,
        parentLsn,
        parentTime,
        pendingState,
        projectId,
        stateChangeTime,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseBranch.class)
        .add("branchId", branchId)
        .add("createTime", createTime)
        .add("currentState", currentState)
        .add("defaultValue", defaultValue)
        .add("effectiveDefault", effectiveDefault)
        .add("isProtected", isProtected)
        .add("logicalSizeBytes", logicalSizeBytes)
        .add("parentId", parentId)
        .add("parentLsn", parentLsn)
        .add("parentTime", parentTime)
        .add("pendingState", pendingState)
        .add("projectId", projectId)
        .add("stateChangeTime", stateChangeTime)
        .add("updateTime", updateTime)
        .toString();
  }
}
