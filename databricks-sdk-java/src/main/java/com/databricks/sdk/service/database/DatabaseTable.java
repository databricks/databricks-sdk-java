// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Next field marker: 13 */
@Generated
public class DatabaseTable {
  /**
   * Name of the target database instance. This is required when creating database tables in
   * standard catalogs. This is optional when creating database tables in registered catalogs. If
   * this field is specified when creating database tables in registered catalogs, the database
   * instance name MUST match that of the registered catalog (or the request will be rejected).
   */
  @JsonProperty("database_instance_name")
  private String databaseInstanceName;

  /**
   * Target Postgres database object (logical database) name for this table.
   *
   * <p>When creating a table in a registered Postgres catalog, the target Postgres database name is
   * inferred to be that of the registered catalog. If this field is specified in this scenario, the
   * Postgres database name MUST match that of the registered catalog (or the request will be
   * rejected).
   *
   * <p>When creating a table in a standard catalog, this field is required. In this scenario,
   * specifying this field will allow targeting an arbitrary postgres database.
   */
  @JsonProperty("logical_database_name")
  private String logicalDatabaseName;

  /** Full three-part (catalog, schema, table) name of the table. */
  @JsonProperty("name")
  private String name;

  /** Data serving REST API URL for this table */
  @JsonProperty("table_serving_url")
  private String tableServingUrl;

  public DatabaseTable setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public DatabaseTable setLogicalDatabaseName(String logicalDatabaseName) {
    this.logicalDatabaseName = logicalDatabaseName;
    return this;
  }

  public String getLogicalDatabaseName() {
    return logicalDatabaseName;
  }

  public DatabaseTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseTable setTableServingUrl(String tableServingUrl) {
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
    DatabaseTable that = (DatabaseTable) o;
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
    return new ToStringer(DatabaseTable.class)
        .add("databaseInstanceName", databaseInstanceName)
        .add("logicalDatabaseName", logicalDatabaseName)
        .add("name", name)
        .add("tableServingUrl", tableServingUrl)
        .toString();
  }
}
