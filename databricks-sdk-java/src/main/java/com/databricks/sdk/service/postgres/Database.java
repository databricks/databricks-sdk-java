// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Database represents a Postgres database within a Branch. */
@Generated
public class Database {
  /** A timestamp indicating when the database was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * The resource name of the database. Format:
   * projects/{project_id}/branches/{branch_id}/databases/{database_id}
   */
  @JsonProperty("name")
  private String name;

  /** The branch containing this database. Format: projects/{project_id}/branches/{branch_id} */
  @JsonProperty("parent")
  private String parent;

  /** The desired state of the Database. */
  @JsonProperty("spec")
  private DatabaseDatabaseSpec spec;

  /** The observed state of the Database. */
  @JsonProperty("status")
  private DatabaseDatabaseStatus status;

  /** A timestamp indicating when the database was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Database setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Database setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Database setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public Database setSpec(DatabaseDatabaseSpec spec) {
    this.spec = spec;
    return this;
  }

  public DatabaseDatabaseSpec getSpec() {
    return spec;
  }

  public Database setStatus(DatabaseDatabaseStatus status) {
    this.status = status;
    return this;
  }

  public DatabaseDatabaseStatus getStatus() {
    return status;
  }

  public Database setUpdateTime(Timestamp updateTime) {
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
    Database that = (Database) o;
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
    return new ToStringer(Database.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("parent", parent)
        .add("spec", spec)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
