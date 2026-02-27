// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DatabaseDatabaseStatus {
  /** The name of the Postgres database. */
  @JsonProperty("postgres_database")
  private String postgresDatabase;

  /**
   * The name of the role that owns the database. Format:
   * projects/{project_id}/branches/{branch_id}/roles/{role_id}
   */
  @JsonProperty("role")
  private String role;

  public DatabaseDatabaseStatus setPostgresDatabase(String postgresDatabase) {
    this.postgresDatabase = postgresDatabase;
    return this;
  }

  public String getPostgresDatabase() {
    return postgresDatabase;
  }

  public DatabaseDatabaseStatus setRole(String role) {
    this.role = role;
    return this;
  }

  public String getRole() {
    return role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseDatabaseStatus that = (DatabaseDatabaseStatus) o;
    return Objects.equals(postgresDatabase, that.postgresDatabase)
        && Objects.equals(role, that.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postgresDatabase, role);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseDatabaseStatus.class)
        .add("postgresDatabase", postgresDatabase)
        .add("role", role)
        .toString();
  }
}
