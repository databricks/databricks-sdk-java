// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Next field marker: 13 */
@Generated
class DatabaseTablePb {
  @JsonProperty("database_instance_name")
  private String databaseInstanceName;

  @JsonProperty("logical_database_name")
  private String logicalDatabaseName;

  @JsonProperty("name")
  private String name;

  @JsonProperty("table_serving_url")
  private String tableServingUrl;

  public DatabaseTablePb setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public DatabaseTablePb setLogicalDatabaseName(String logicalDatabaseName) {
    this.logicalDatabaseName = logicalDatabaseName;
    return this;
  }

  public String getLogicalDatabaseName() {
    return logicalDatabaseName;
  }

  public DatabaseTablePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseTablePb setTableServingUrl(String tableServingUrl) {
    this.tableServingUrl = tableServingUrl;
    return this;
  }

  public String getTableServingUrl() {
    return tableServingUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseTablePb that = (DatabaseTablePb) o;
    return Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(logicalDatabaseName, that.logicalDatabaseName)
        && Objects.equals(name, that.name)
        && Objects.equals(tableServingUrl, that.tableServingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceName, logicalDatabaseName, name, tableServingUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseTablePb.class)
        .add("databaseInstanceName", databaseInstanceName)
        .add("logicalDatabaseName", logicalDatabaseName)
        .add("name", name)
        .add("tableServingUrl", tableServingUrl)
        .toString();
  }
}
