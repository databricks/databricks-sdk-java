// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceDatabase {
  /** */
  @JsonProperty("database_name")
  private String databaseName;

  /** */
  @JsonProperty("instance_name")
  private String instanceName;

  /** */
  @JsonProperty("permission")
  private AppResourceDatabaseDatabasePermission permission;

  public AppResourceDatabase setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public AppResourceDatabase setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public AppResourceDatabase setPermission(AppResourceDatabaseDatabasePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceDatabaseDatabasePermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceDatabase that = (AppResourceDatabase) o;
    return Objects.equals(databaseName, that.databaseName)
        && Objects.equals(instanceName, that.instanceName)
        && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, instanceName, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceDatabase.class)
        .add("databaseName", databaseName)
        .add("instanceName", instanceName)
        .add("permission", permission)
        .toString();
  }
}
