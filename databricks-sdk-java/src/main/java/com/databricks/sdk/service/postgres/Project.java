// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class Project {
  /** A timestamp indicating when the project was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Output only. The full resource path of the project. Format: projects/{project_id} */
  @JsonProperty("name")
  private String name;

  /**
   * The spec contains the project configuration, including display_name, pg_version (Postgres
   * version), history_retention_duration, and default_endpoint_settings.
   */
  @JsonProperty("spec")
  private ProjectSpec spec;

  /** The current status of a Project. */
  @JsonProperty("status")
  private ProjectStatus status;

  /** System-generated unique ID for the project. */
  @JsonProperty("uid")
  private String uid;

  /** A timestamp indicating when the project was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Project setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Project setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Project setSpec(ProjectSpec spec) {
    this.spec = spec;
    return this;
  }

  public ProjectSpec getSpec() {
    return spec;
  }

  public Project setStatus(ProjectStatus status) {
    this.status = status;
    return this;
  }

  public ProjectStatus getStatus() {
    return status;
  }

  public Project setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public Project setUpdateTime(Timestamp updateTime) {
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
    Project that = (Project) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, spec, status, uid, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Project.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
