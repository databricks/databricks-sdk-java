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

  /**
   * The resource name of the branch. This field is output-only and constructed by the system.
   * Format: `projects/{project_id}/branches/{branch_id}`
   */
  @JsonProperty("name")
  private String name;

  /**
   * The project containing this branch (API resource hierarchy). Format: projects/{project_id}
   *
   * <p>Note: This field indicates where the branch exists in the resource hierarchy. For
   * point-in-time branching from another branch, see `spec.source_branch`.
   */
  @JsonProperty("parent")
  private String parent;

  /** The spec contains the branch configuration. */
  @JsonProperty("spec")
  private BranchSpec spec;

  /** The current status of a Branch. */
  @JsonProperty("status")
  private BranchStatus status;

  /** System-generated unique ID for the branch. */
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

  public Branch setSpec(BranchSpec spec) {
    this.spec = spec;
    return this;
  }

  public BranchSpec getSpec() {
    return spec;
  }

  public Branch setStatus(BranchStatus status) {
    this.status = status;
    return this;
  }

  public BranchStatus getStatus() {
    return status;
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
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, parent, spec, status, uid, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Branch.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("parent", parent)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
