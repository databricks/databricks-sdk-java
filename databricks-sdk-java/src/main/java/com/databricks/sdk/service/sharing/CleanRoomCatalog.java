// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomCatalog {
  /** Name of the catalog in the clean room station. Empty for notebooks. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The details of the shared notebook files. */
  @JsonProperty("notebook_files")
  private Collection<SharedDataObject> notebookFiles;

  /** The details of the shared tables. */
  @JsonProperty("tables")
  private Collection<SharedDataObject> tables;

  public CleanRoomCatalog setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CleanRoomCatalog setNotebookFiles(Collection<SharedDataObject> notebookFiles) {
    this.notebookFiles = notebookFiles;
    return this;
  }

  public Collection<SharedDataObject> getNotebookFiles() {
    return notebookFiles;
  }

  public CleanRoomCatalog setTables(Collection<SharedDataObject> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<SharedDataObject> getTables() {
    return tables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomCatalog that = (CleanRoomCatalog) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(notebookFiles, that.notebookFiles)
        && Objects.equals(tables, that.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, notebookFiles, tables);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomCatalog.class)
        .add("catalogName", catalogName)
        .add("notebookFiles", notebookFiles)
        .add("tables", tables)
        .toString();
  }
}
