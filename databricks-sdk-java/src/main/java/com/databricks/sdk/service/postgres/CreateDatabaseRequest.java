// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatabaseRequest {
  /** The desired specification of a Database. */
  @JsonProperty("database")
  private Database database;

  /**
   * The ID to use for the Database, which will become the final component of the database's
   * resource name. This ID becomes the database name in postgres.
   *
   * <p>This value should be 4-63 characters, and only use characters available in DNS names, as
   * defined by RFC-1123
   *
   * <p>If database_id is not specified in the request, it is generated automatically.
   */
  @JsonIgnore
  @QueryParam("database_id")
  private String databaseId;

  /**
   * The Branch where this Database will be created. Format:
   * projects/{project_id}/branches/{branch_id}
   */
  @JsonIgnore private String parent;

  /** If true, update the database if it already exists instead of returning an error. */
  @JsonIgnore
  @QueryParam("replace_existing")
  private Boolean replaceExisting;

  public CreateDatabaseRequest setDatabase(Database database) {
    this.database = database;
    return this;
  }

  public Database getDatabase() {
    return database;
  }

  public CreateDatabaseRequest setDatabaseId(String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  public String getDatabaseId() {
    return databaseId;
  }

  public CreateDatabaseRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateDatabaseRequest setReplaceExisting(Boolean replaceExisting) {
    this.replaceExisting = replaceExisting;
    return this;
  }

  public Boolean getReplaceExisting() {
    return replaceExisting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseRequest that = (CreateDatabaseRequest) o;
    return Objects.equals(database, that.database)
        && Objects.equals(databaseId, that.databaseId)
        && Objects.equals(parent, that.parent)
        && Objects.equals(replaceExisting, that.replaceExisting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, databaseId, parent, replaceExisting);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseRequest.class)
        .add("database", database)
        .add("databaseId", databaseId)
        .add("parent", parent)
        .add("replaceExisting", replaceExisting)
        .toString();
  }
}
