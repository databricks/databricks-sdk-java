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
   * By default, an instance cannot be deleted if it has descendant instances created via PITR.
   * Setting this flag to true is not supported and the request is rejected; delete the child
   * instances first.
   */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** Name of the instance to delete. */
  @JsonIgnore private String name;

  /**
   * Deprecated: omitting the field or setting it to true hard deletes the instance. Setting it to
   * false returns a bad request.
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
