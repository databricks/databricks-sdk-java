// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomTableInfo {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The array of __ColumnInfo__ definitions of the table's columns. */
  @JsonProperty("columns")
  private Collection<ColumnInfo> columns;

  /** Full name of table, in form of __catalog_name__.__schema_name__.__table_name__ */
  @JsonProperty("full_name")
  private String fullName;

  /** Name of table, relative to parent schema. */
  @JsonProperty("name")
  private String name;

  /** Name of parent schema relative to its parent catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  public CleanRoomTableInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CleanRoomTableInfo setColumns(Collection<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<ColumnInfo> getColumns() {
    return columns;
  }

  public CleanRoomTableInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public CleanRoomTableInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CleanRoomTableInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomTableInfo that = (CleanRoomTableInfo) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(columns, that.columns)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(name, that.name)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, columns, fullName, name, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomTableInfo.class)
        .add("catalogName", catalogName)
        .add("columns", columns)
        .add("fullName", fullName)
        .add("name", name)
        .add("schemaName", schemaName)
        .toString();
  }
}
