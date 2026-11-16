// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A database table is a table that already exists in a Postgres database of a Lakebase database
 * instance and is registered in Unity Catalog, so that it is governed and discoverable there while
 * the Postgres table remains the source of truth. Unlike a synced table, no data is copied from a
 * Unity Catalog source table into Postgres.
 */
@Generated
public class DatabaseTable {
  /**
   * The name of the database instance that hosts the Postgres table. It must be set when creating a
   * database table.
   */
  @JsonProperty("database_instance_name")
  private String databaseInstanceName;

  /**
   * The name of the Postgres database in the instance that contains the table. It must be set when
   * creating a database table. Tables in the system databases postgres, databricks_system,
   * template0 and template1, and tables in the schemas pg_catalog and information_schema, cannot be
   * registered.
   */
  @JsonProperty("logical_database_name")
  private String logicalDatabaseName;

  /**
   * Full three-part (catalog, schema, table) name of the table in Unity Catalog. The catalog must
   * be a standard or default storage catalog; database tables cannot be registered in a database
   * catalog. The schema and table parts must match the schema and table names of the Postgres table
   * that is registered.
   */
  @JsonProperty("name")
  private String name;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseTable that = (DatabaseTable) o;
    return Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(logicalDatabaseName, that.logicalDatabaseName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceName, logicalDatabaseName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseTable.class)
        .add("databaseInstanceName", databaseInstanceName)
        .add("logicalDatabaseName", logicalDatabaseName)
        .add("name", name)
        .toString();
  }
}
