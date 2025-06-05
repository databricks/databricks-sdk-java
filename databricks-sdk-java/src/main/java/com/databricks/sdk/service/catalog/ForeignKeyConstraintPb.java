// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ForeignKeyConstraintPb {
  @JsonProperty("child_columns")
  private Collection<String> childColumns;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parent_columns")
  private Collection<String> parentColumns;

  @JsonProperty("parent_table")
  private String parentTable;

  public ForeignKeyConstraintPb setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public Collection<String> getChildColumns() {
    return childColumns;
  }

  public ForeignKeyConstraintPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ForeignKeyConstraintPb setParentColumns(Collection<String> parentColumns) {
    this.parentColumns = parentColumns;
    return this;
  }

  public Collection<String> getParentColumns() {
    return parentColumns;
  }

  public ForeignKeyConstraintPb setParentTable(String parentTable) {
    this.parentTable = parentTable;
    return this;
  }

  public String getParentTable() {
    return parentTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForeignKeyConstraintPb that = (ForeignKeyConstraintPb) o;
    return Objects.equals(childColumns, that.childColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(parentColumns, that.parentColumns)
        && Objects.equals(parentTable, that.parentTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name, parentColumns, parentTable);
  }

  @Override
  public String toString() {
    return new ToStringer(ForeignKeyConstraintPb.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .add("parentColumns", parentColumns)
        .add("parentTable", parentTable)
        .toString();
  }
}
