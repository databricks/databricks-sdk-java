// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A software artifact in a Unity Catalog schema. */
@Generated
public class SoftwareArtifact {
  /** Time at which this software artifact was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Principal name of the software artifact creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * Resource name of the artifact, of the form `software-artifacts/{catalog}.{schema}.{artifact}`.
   */
  @JsonProperty("name")
  private String name;

  /** Principal name (a user, service principal, or group) that owns this artifact. */
  @JsonProperty("owner")
  private String owner;

  /** Time at which this software artifact was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Principal name that last updated this software artifact. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public SoftwareArtifact setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public SoftwareArtifact setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public SoftwareArtifact setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SoftwareArtifact setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public SoftwareArtifact setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public SoftwareArtifact setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SoftwareArtifact that = (SoftwareArtifact) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, createdBy, name, owner, updateTime, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(SoftwareArtifact.class)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("name", name)
        .add("owner", owner)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
