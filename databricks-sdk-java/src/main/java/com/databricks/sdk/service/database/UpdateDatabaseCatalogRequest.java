// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDatabaseCatalogRequest {
  /** Note that updating a database catalog is not yet supported. */
  @JsonProperty("database_catalog")
  private DatabaseCatalog databaseCatalog;

  /** The name of the catalog in UC. */
  @JsonIgnore private String name;

  /** The list of fields to update. Setting this field is not yet supported. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateDatabaseCatalogRequest setDatabaseCatalog(DatabaseCatalog databaseCatalog) {
    this.databaseCatalog = databaseCatalog;
    return this;
  }

  public DatabaseCatalog getDatabaseCatalog() {
    return databaseCatalog;
  }

  public UpdateDatabaseCatalogRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDatabaseCatalogRequest setUpdateMask(String updateMask) {
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
    UpdateDatabaseCatalogRequest that = (UpdateDatabaseCatalogRequest) o;
    return Objects.equals(databaseCatalog, that.databaseCatalog)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseCatalog, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseCatalogRequest.class)
        .add("databaseCatalog", databaseCatalog)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
