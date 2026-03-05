// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourcePostgres {
  /** */
  @JsonProperty("branch")
  private String branch;

  /** */
  @JsonProperty("database")
  private String database;

  /** */
  @JsonProperty("permission")
  private AppResourcePostgresPostgresPermission permission;

  public AppResourcePostgres setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public AppResourcePostgres setDatabase(String database) {
    this.database = database;
    return this;
  }

  public String getDatabase() {
    return database;
  }

  public AppResourcePostgres setPermission(AppResourcePostgresPostgresPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourcePostgresPostgresPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourcePostgres that = (AppResourcePostgres) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(database, that.database)
        && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, database, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourcePostgres.class)
        .add("branch", branch)
        .add("database", database)
        .add("permission", permission)
        .toString();
  }
}
