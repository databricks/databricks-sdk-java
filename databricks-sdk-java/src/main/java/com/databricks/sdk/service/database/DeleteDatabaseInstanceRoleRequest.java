// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteDatabaseInstanceRoleRequest {
  /** This is the AIP standard name for the equivalent of Postgres' `IF EXISTS` option */
  @JsonIgnore
  @QueryParam("allow_missing")
  private Boolean allowMissing;

  /** */
  @JsonIgnore private String instanceName;

  /** */
  @JsonIgnore private String name;

  /** */
  @JsonIgnore
  @QueryParam("reassign_owned_to")
  private String reassignOwnedTo;

  public DeleteDatabaseInstanceRoleRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public DeleteDatabaseInstanceRoleRequest setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public DeleteDatabaseInstanceRoleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteDatabaseInstanceRoleRequest setReassignOwnedTo(String reassignOwnedTo) {
    this.reassignOwnedTo = reassignOwnedTo;
    return this;
  }

  public String getReassignOwnedTo() {
    return reassignOwnedTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDatabaseInstanceRoleRequest that = (DeleteDatabaseInstanceRoleRequest) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(instanceName, that.instanceName)
        && Objects.equals(name, that.name)
        && Objects.equals(reassignOwnedTo, that.reassignOwnedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, instanceName, name, reassignOwnedTo);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDatabaseInstanceRoleRequest.class)
        .add("allowMissing", allowMissing)
        .add("instanceName", instanceName)
        .add("name", name)
        .add("reassignOwnedTo", reassignOwnedTo)
        .toString();
  }
}
