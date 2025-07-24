// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDatabaseInstanceRequest {
  /** */
  @JsonProperty("database_instance")
  private DatabaseInstance databaseInstance;

  /** The name of the instance. This is the unique identifier for the instance. */
  @JsonIgnore private String name;

  /**
   * The list of fields to update. This field is not yet supported, and is ignored by the server.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateDatabaseInstanceRequest setDatabaseInstance(DatabaseInstance databaseInstance) {
    this.databaseInstance = databaseInstance;
    return this;
  }

  public DatabaseInstance getDatabaseInstance() {
    return databaseInstance;
  }

  public UpdateDatabaseInstanceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDatabaseInstanceRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDatabaseInstanceRequest that = (UpdateDatabaseInstanceRequest) o;
    return Objects.equals(databaseInstance, that.databaseInstance)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstance, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseInstanceRequest.class)
        .add("databaseInstance", databaseInstance)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
