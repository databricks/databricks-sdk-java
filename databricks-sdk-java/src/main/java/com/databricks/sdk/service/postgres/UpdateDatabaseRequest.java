// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateDatabaseRequest {
  /**
   * The Database to update.
   *
   * <p>The database's `name` field is used to identify the database to update. Format:
   * projects/{project_id}/branches/{branch_id}/databases/{database_id}
   */
  @JsonProperty("database")
  private Database database;

  /**
   * The resource name of the database. Format:
   * projects/{project_id}/branches/{branch_id}/databases/{database_id}
   */
  @JsonIgnore private String name;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateDatabaseRequest setDatabase(Database database) {
    this.database = database;
    return this;
  }

  public Database getDatabase() {
    return database;
  }

  public UpdateDatabaseRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDatabaseRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDatabaseRequest that = (UpdateDatabaseRequest) o;
    return Objects.equals(database, that.database)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseRequest.class)
        .add("database", database)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
