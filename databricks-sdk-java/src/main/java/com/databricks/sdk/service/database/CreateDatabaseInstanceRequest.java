// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatabaseInstanceRequest {
  /**
   * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and
   * storage.
   */
  @JsonProperty("database_instance")
  private DatabaseInstance databaseInstance;

  public CreateDatabaseInstanceRequest setDatabaseInstance(DatabaseInstance databaseInstance) {
    this.databaseInstance = databaseInstance;
    return this;
  }

  public DatabaseInstance getDatabaseInstance() {
    return databaseInstance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseInstanceRequest that = (CreateDatabaseInstanceRequest) o;
    return Objects.equals(databaseInstance, that.databaseInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstance);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseInstanceRequest.class)
        .add("databaseInstance", databaseInstance)
        .toString();
  }
}
