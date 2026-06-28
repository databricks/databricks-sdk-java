// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatabaseInstanceRoleRequest {
  /** */
  @JsonIgnore
  @QueryParam("database_instance_name")
  private String databaseInstanceName;

  /** */
  @JsonProperty("database_instance_role")
  private DatabaseInstanceRole databaseInstanceRole;

  /** */
  @JsonIgnore private String instanceName;

  public CreateDatabaseInstanceRoleRequest setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public CreateDatabaseInstanceRoleRequest setDatabaseInstanceRole(
      DatabaseInstanceRole databaseInstanceRole) {
    this.databaseInstanceRole = databaseInstanceRole;
    return this;
  }

  public DatabaseInstanceRole getDatabaseInstanceRole() {
    return databaseInstanceRole;
  }

  public CreateDatabaseInstanceRoleRequest setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseInstanceRoleRequest that = (CreateDatabaseInstanceRoleRequest) o;
    return Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(databaseInstanceRole, that.databaseInstanceRole)
        && Objects.equals(instanceName, that.instanceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceName, databaseInstanceRole, instanceName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseInstanceRoleRequest.class)
        .add("databaseInstanceName", databaseInstanceName)
        .add("databaseInstanceRole", databaseInstanceRole)
        .add("instanceName", instanceName)
        .toString();
  }
}
