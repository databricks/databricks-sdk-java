// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DatabaseCatalog {
  /** */
  @JsonProperty("create_database_if_not_exists")
  private Boolean createDatabaseIfNotExists;

  /** The name of the DatabaseInstance housing the database. */
  @JsonProperty("database_instance_name")
  private String databaseInstanceName;

  /** The name of the database (in a instance) associated with the catalog. */
  @JsonProperty("database_name")
  private String databaseName;

  /** The name of the catalog in UC. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("uid")
  private String uid;

  public DatabaseCatalog setCreateDatabaseIfNotExists(Boolean createDatabaseIfNotExists) {
    this.createDatabaseIfNotExists = createDatabaseIfNotExists;
    return this;
  }

  public Boolean getCreateDatabaseIfNotExists() {
    return createDatabaseIfNotExists;
  }

  public DatabaseCatalog setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public DatabaseCatalog setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public DatabaseCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseCatalog setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseCatalog that = (DatabaseCatalog) o;
    return Objects.equals(createDatabaseIfNotExists, that.createDatabaseIfNotExists)
        && Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(databaseName, that.databaseName)
        && Objects.equals(name, that.name)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDatabaseIfNotExists, databaseInstanceName, databaseName, name, uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseCatalog.class)
        .add("createDatabaseIfNotExists", createDatabaseIfNotExists)
        .add("databaseInstanceName", databaseInstanceName)
        .add("databaseName", databaseName)
        .add("name", name)
        .add("uid", uid)
        .toString();
  }
}
