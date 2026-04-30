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

  /**
   * A timestamp indicating when the project was soft-deleted. Empty if the project is not deleted,
   * otherwise set to a timestamp in the past.
   */
  @JsonProperty("delete_time")
  private Timestamp deleteTime;

  /**
   * Configuration settings for the initial Read/Write endpoint created inside the initial branch
   * for a newly created project. If omitted, the initial endpoint created will have default
   * settings, without high availability configured. This field does not apply to any endpoints
   * created after project creation. Use spec.default_endpoint_settings to configure default
   * settings for endpoints created after project creation.
   */
  @JsonProperty("initial_endpoint_spec")
  private InitialEndpointSpec initialEndpointSpec;

  /** Output only. The full resource path of the project. Format: projects/{project_id} */
  @JsonProperty("name")
  private String name;

  /**
   * A timestamp indicating when the project is scheduled for permanent deletion. Empty if the
   * project is not deleted, otherwise set to a timestamp in the future.
   */
  @JsonProperty("purge_time")
  private Timestamp purgeTime;

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

  public Project setDeleteTime(Timestamp deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  public Timestamp getDeleteTime() {
    return deleteTime;
  }

  public Project setInitialEndpointSpec(InitialEndpointSpec initialEndpointSpec) {
    this.initialEndpointSpec = initialEndpointSpec;
    return this;
  }

  public InitialEndpointSpec getInitialEndpointSpec() {
    return initialEndpointSpec;
  }

  public Project setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Project setPurgeTime(Timestamp purgeTime) {
    this.purgeTime = purgeTime;
    return this;
  }

  public Timestamp getPurgeTime() {
    return purgeTime;
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
        && Objects.equals(deleteTime, that.deleteTime)
        && Objects.equals(initialEndpointSpec, that.initialEndpointSpec)
        && Objects.equals(name, that.name)
        && Objects.equals(purgeTime, that.purgeTime)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        deleteTime,
        initialEndpointSpec,
        name,
        purgeTime,
        spec,
        status,
        uid,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Project.class)
        .add("createTime", createTime)
        .add("deleteTime", deleteTime)
        .add("initialEndpointSpec", initialEndpointSpec)
        .add("name", name)
        .add("purgeTime", purgeTime)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
