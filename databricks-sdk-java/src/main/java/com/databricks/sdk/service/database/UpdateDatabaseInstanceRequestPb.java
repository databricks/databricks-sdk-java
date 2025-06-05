// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update a Database Instance */
@Generated
class UpdateDatabaseInstanceRequestPb {
  @JsonProperty("database_instance")
  private DatabaseInstance databaseInstance;

  @JsonIgnore private String name;

  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateDatabaseInstanceRequestPb setDatabaseInstance(DatabaseInstance databaseInstance) {
    this.databaseInstance = databaseInstance;
    return this;
  }

  public DatabaseInstance getDatabaseInstance() {
    return databaseInstance;
  }

  public UpdateDatabaseInstanceRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDatabaseInstanceRequestPb setUpdateMask(String updateMask) {
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
    UpdateDatabaseInstanceRequestPb that = (UpdateDatabaseInstanceRequestPb) o;
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
    return new ToStringer(UpdateDatabaseInstanceRequestPb.class)
        .add("databaseInstance", databaseInstance)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
