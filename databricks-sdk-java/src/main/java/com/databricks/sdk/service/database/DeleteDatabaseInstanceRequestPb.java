// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a Database Instance */
@Generated
class DeleteDatabaseInstanceRequestPb {
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  @JsonIgnore private String name;

  @JsonIgnore
  @QueryParam("purge")
  private Boolean purge;

  public DeleteDatabaseInstanceRequestPb setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteDatabaseInstanceRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteDatabaseInstanceRequestPb setPurge(Boolean purge) {
    this.purge = purge;
    return this;
  }

  public Boolean getPurge() {
    return purge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDatabaseInstanceRequestPb that = (DeleteDatabaseInstanceRequestPb) o;
    return Objects.equals(force, that.force)
        && Objects.equals(name, that.name)
        && Objects.equals(purge, that.purge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name, purge);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDatabaseInstanceRequestPb.class)
        .add("force", force)
        .add("name", name)
        .add("purge", purge)
        .toString();
  }
}
