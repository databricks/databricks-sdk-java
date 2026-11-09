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
public class UpdateMigrationRequest {
  /** Required. The migration containing the user-owned fields to update. */
  @JsonProperty("migration")
  private Migration migration;

  /** The migration resource name, in the format `migrations/{migration}`. */
  @JsonIgnore private String name;

  /** Required. The fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateMigrationRequest setMigration(Migration migration) {
    this.migration = migration;
    return this;
  }

  public Migration getMigration() {
    return migration;
  }

  public UpdateMigrationRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateMigrationRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateMigrationRequest that = (UpdateMigrationRequest) o;
    return Objects.equals(migration, that.migration)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migration, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMigrationRequest.class)
        .add("migration", migration)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
