// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The desired state of the Catalog. */
@Generated
public class CatalogCatalogSpec {
  /**
   * The resource path of the branch associated with the catalog.
   *
   * <p>Format: projects/{project_id}/branches/{branch_id}.
   */
  @JsonProperty("branch")
  private String branch;

  /**
   * If set to true, the specified postgres_database is created on behalf of the calling user if it
   * does not already exist. In this case, the calling user has a role created for them in Postgres
   * if they do not already have one.
   *
   * <p>Defaults to false, meaning that the request fails if the specified postgres_database does
   * not already exist.
   */
  @JsonProperty("create_database_if_missing")
  private Boolean createDatabaseIfMissing;

  /**
   * The name of the Postgres database inside the specified Lakebase project and branch to be
   * associated with the UC catalog. This database must already exist, unless
   * create_database_if_missing is set to true on creation.
   *
   * <p>A database can only be registered with one UC catalog at a time. To re-register a database
   * with a different catalog, the existing catalog must be deleted first.
   *
   * <p>A child branch inherits the fact of parent's registration. This means the same-named
   * database in a child branch cannot be registered with a second catalog while the parent's
   * registration exists. To allow registering the database of a child branch, drop and recreate the
   * database on the child branch. This removes the fact of parent's registration from this branch
   * only.
   *
   * <p>Doing Point In Time Restore (PITR) prior to the moment before the Postgres DB was registered
   * in the Catalog drops the fact of registration of the database. So the user should avoid doing
   * so.
   */
  @JsonProperty("postgres_database")
  private String postgresDatabase;

  public CatalogCatalogSpec setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public CatalogCatalogSpec setCreateDatabaseIfMissing(Boolean createDatabaseIfMissing) {
    this.createDatabaseIfMissing = createDatabaseIfMissing;
    return this;
  }

  public Boolean getCreateDatabaseIfMissing() {
    return createDatabaseIfMissing;
  }

  public CatalogCatalogSpec setPostgresDatabase(String postgresDatabase) {
    this.postgresDatabase = postgresDatabase;
    return this;
  }

  public String getPostgresDatabase() {
    return postgresDatabase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogCatalogSpec that = (CatalogCatalogSpec) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(createDatabaseIfMissing, that.createDatabaseIfMissing)
        && Objects.equals(postgresDatabase, that.postgresDatabase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, createDatabaseIfMissing, postgresDatabase);
  }

  @Override
  public String toString() {
    return new ToStringer(CatalogCatalogSpec.class)
        .add("branch", branch)
        .add("createDatabaseIfMissing", createDatabaseIfMissing)
        .add("postgresDatabase", postgresDatabase)
        .toString();
  }
}
