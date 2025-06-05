// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DatabaseCatalogPb {
  @JsonProperty("create_database_if_not_exists")
  private Boolean createDatabaseIfNotExists;

  @JsonProperty("database_instance_name")
  private String databaseInstanceName;

  @JsonProperty("database_name")
  private String databaseName;

  @JsonProperty("name")
  private String name;

  @JsonProperty("uid")
  private String uid;

  public DatabaseCatalogPb setCreateDatabaseIfNotExists(Boolean createDatabaseIfNotExists) {
    this.createDatabaseIfNotExists = createDatabaseIfNotExists;
    return this;
  }

  public Boolean getCreateDatabaseIfNotExists() {
    return createDatabaseIfNotExists;
  }

  public DatabaseCatalogPb setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public DatabaseCatalogPb setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public DatabaseCatalogPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseCatalogPb setUid(String uid) {
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
    DatabaseCatalogPb that = (DatabaseCatalogPb) o;
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
    return new ToStringer(DatabaseCatalogPb.class)
        .add("createDatabaseIfNotExists", createDatabaseIfNotExists)
        .add("databaseInstanceName", databaseInstanceName)
        .add("databaseName", databaseName)
        .add("name", name)
        .add("uid", uid)
        .toString();
  }
}
