// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDatabaseInstanceRoleRequest {
  /** */
  @JsonIgnore
  @QueryParam("database_instance_name")
  private String databaseInstanceName;

  /** */
  @JsonProperty("database_instance_role")
  private DatabaseInstanceRole databaseInstanceRole;

  /** */
  @JsonIgnore private String instanceName;

  /** The name of the role. This is the unique identifier for the role in an instance. */
  @JsonIgnore private String name;

  public UpdateDatabaseInstanceRoleRequest setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public UpdateDatabaseInstanceRoleRequest setDatabaseInstanceRole(
      DatabaseInstanceRole databaseInstanceRole) {
    this.databaseInstanceRole = databaseInstanceRole;
    return this;
  }

  public DatabaseInstanceRole getDatabaseInstanceRole() {
    return databaseInstanceRole;
  }

  public UpdateDatabaseInstanceRoleRequest setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public UpdateDatabaseInstanceRoleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDatabaseInstanceRoleRequest that = (UpdateDatabaseInstanceRoleRequest) o;
    return Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(databaseInstanceRole, that.databaseInstanceRole)
        && Objects.equals(instanceName, that.instanceName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceName, databaseInstanceRole, instanceName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseInstanceRoleRequest.class)
        .add("databaseInstanceName", databaseInstanceName)
        .add("databaseInstanceRole", databaseInstanceRole)
        .add("instanceName", instanceName)
        .add("name", name)
        .toString();
  }
}
