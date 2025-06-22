// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteDatabaseInstanceRequest {
  /**
   * By default, a instance cannot be deleted if it has descendant instances created via PITR. If
   * this flag is specified as true, all descendent instances will be deleted as well.
   */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** Name of the instance to delete. */
  @JsonIgnore private String name;

  /**
   * If false, the database instance is soft deleted. Soft deleted instances behave as if they are
   * deleted, and cannot be used for CRUD operations nor connected to. However they can be undeleted
   * by calling the undelete API for a limited time. If true, the database instance is hard deleted
   * and cannot be undeleted.
   */
  @JsonIgnore
  @QueryParam("purge")
  private Boolean purge;

  public DeleteDatabaseInstanceRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteDatabaseInstanceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteDatabaseInstanceRequest setPurge(Boolean purge) {
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
    DeleteDatabaseInstanceRequest that = (DeleteDatabaseInstanceRequest) o;
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
    return new ToStringer(DeleteDatabaseInstanceRequest.class)
        .add("force", force)
        .add("name", name)
        .add("purge", purge)
        .toString();
  }
}
