// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * DataApi represents the Data API (PostgREST) configuration for a Database. At most one DataApi per
 * database. Create enables Data API, Delete disables it.
 */
@Generated
public class DataApi {
  /** A timestamp indicating when the Data API was first enabled. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Resource name: projects/{project_id}/branches/{branch_id}/databases/{database_id}/data-api */
  @JsonProperty("name")
  private String name;

  /**
   * The database containing this Data API configuration. Format:
   * projects/{project_id}/branches/{branch_id}/databases/{database_id}
   */
  @JsonProperty("parent")
  private String parent;

  /** The desired Data API configuration. */
  @JsonProperty("spec")
  private DataApiDataApiSpec spec;

  /** The observed Data API state (read-only). */
  @JsonProperty("status")
  private DataApiDataApiStatus status;

  /** A timestamp indicating when the Data API configuration was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public DataApi setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public DataApi setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DataApi setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public DataApi setSpec(DataApiDataApiSpec spec) {
    this.spec = spec;
    return this;
  }

  public DataApiDataApiSpec getSpec() {
    return spec;
  }

  public DataApi setStatus(DataApiDataApiStatus status) {
    this.status = status;
    return this;
  }

  public DataApiDataApiStatus getStatus() {
    return status;
  }

  public DataApi setUpdateTime(Timestamp updateTime) {
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
    DataApi that = (DataApi) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, parent, spec, status, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(DataApi.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("parent", parent)
        .add("spec", spec)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
