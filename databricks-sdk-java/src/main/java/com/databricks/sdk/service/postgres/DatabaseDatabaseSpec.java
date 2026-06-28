// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DatabaseDatabaseSpec {
  /**
   * The name of the Postgres database.
   *
   * <p>This expects a valid Postgres identifier as specified in the link below.
   * https://www.postgresql.org/docs/current/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS Required
   * when creating the Database.
   *
   * <p>To rename, pass a valid postgres identifier when updating the Database.
   */
  @JsonProperty("postgres_database")
  private String postgresDatabase;

  /**
   * The name of the role that owns the database. Format:
   * projects/{project_id}/branches/{branch_id}/roles/{role_id}
   *
   * <p>To change the owner, pass valid existing Role name when updating the Database
   *
   * <p>A database always has an owner.
   */
  @JsonProperty("role")
  private String role;

  public DatabaseDatabaseSpec setPostgresDatabase(String postgresDatabase) {
    this.postgresDatabase = postgresDatabase;
    return this;
  }

  public String getPostgresDatabase() {
    return postgresDatabase;
  }

  public DatabaseDatabaseSpec setRole(String role) {
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
    DatabaseDatabaseSpec that = (DatabaseDatabaseSpec) o;
    return Objects.equals(postgresDatabase, that.postgresDatabase)
        && Objects.equals(role, that.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postgresDatabase, role);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseDatabaseSpec.class)
        .add("postgresDatabase", postgresDatabase)
        .add("role", role)
        .toString();
  }
}
