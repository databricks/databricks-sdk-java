// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The observed state of the Catalog. */
@Generated
public class CatalogCatalogStatus {
  /**
   * The resource path of the branch associated with the catalog.
   *
   * <p>Format: projects/{project_id}/branches/{branch_id}.
   */
  @JsonProperty("branch")
  private String branch;

  /**
   * The short identifier of the catalog, suitable for showing to the users. For a catalog with name
   * `catalogs/my-catalog`, the catalog_id is `my-catalog`.
   *
   * <p>Use this field when building UI components that display catalogs to users (e.g., a drop-down
   * selector). Prefer showing `catalog_id` instead of the full resource name from `Catalog.name`,
   * which follows the `catalogs/{catalog_id}` format and is not user-friendly.
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  /** The name of the Postgres database associated with the catalog. */
  @JsonProperty("postgres_database")
  private String postgresDatabase;

  /**
   * The resource path of the project associated with the catalog.
   *
   * <p>Format: projects/{project_id}.
   */
  @JsonProperty("project")
  private String project;

  public CatalogCatalogStatus setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public CatalogCatalogStatus setCatalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  public String getCatalogId() {
    return catalogId;
  }

  public CatalogCatalogStatus setPostgresDatabase(String postgresDatabase) {
    this.postgresDatabase = postgresDatabase;
    return this;
  }

  public String getPostgresDatabase() {
    return postgresDatabase;
  }

  public CatalogCatalogStatus setProject(String project) {
    this.project = project;
    return this;
  }

  public String getProject() {
    return project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogCatalogStatus that = (CatalogCatalogStatus) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(catalogId, that.catalogId)
        && Objects.equals(postgresDatabase, that.postgresDatabase)
        && Objects.equals(project, that.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, catalogId, postgresDatabase, project);
  }

  @Override
  public String toString() {
    return new ToStringer(CatalogCatalogStatus.class)
        .add("branch", branch)
        .add("catalogId", catalogId)
        .add("postgresDatabase", postgresDatabase)
        .add("project", project)
        .toString();
  }
}
