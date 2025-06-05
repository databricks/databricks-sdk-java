// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create a role for a Database Instance */
@Generated
class CreateDatabaseInstanceRoleRequestPb {
  @JsonProperty("database_instance_role")
  private DatabaseInstanceRole databaseInstanceRole;

  @JsonIgnore private String instanceName;

  public CreateDatabaseInstanceRoleRequestPb setDatabaseInstanceRole(
      DatabaseInstanceRole databaseInstanceRole) {
    this.databaseInstanceRole = databaseInstanceRole;
    return this;
  }

  public DatabaseInstanceRole getDatabaseInstanceRole() {
    return databaseInstanceRole;
  }

  public CreateDatabaseInstanceRoleRequestPb setInstanceName(String instanceName) {
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
    CreateDatabaseInstanceRoleRequestPb that = (CreateDatabaseInstanceRoleRequestPb) o;
    return Objects.equals(databaseInstanceRole, that.databaseInstanceRole)
        && Objects.equals(instanceName, that.instanceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceRole, instanceName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseInstanceRoleRequestPb.class)
        .add("databaseInstanceRole", databaseInstanceRole)
        .add("instanceName", instanceName)
        .toString();
  }
}
