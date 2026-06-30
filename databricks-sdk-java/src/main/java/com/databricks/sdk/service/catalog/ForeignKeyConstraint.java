// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ForeignKeyConstraint {
  /** Column names for this constraint. */
  @JsonProperty("child_columns")
  private Collection<String> childColumns;

  /** The name of the constraint. */
  @JsonProperty("name")
  private String name;

  /** Column names for this constraint. */
  @JsonProperty("parent_columns")
  private Collection<String> parentColumns;

  /** The full name of the parent constraint. */
  @JsonProperty("parent_table")
  private String parentTable;

  /** True if the constraint is RELY, false or unset if NORELY. */
  @JsonProperty("rely")
  private Boolean rely;

  public ForeignKeyConstraint setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public Collection<String> getChildColumns() {
    return childColumns;
  }

  public ForeignKeyConstraint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ForeignKeyConstraint setParentColumns(Collection<String> parentColumns) {
    this.parentColumns = parentColumns;
    return this;
  }

  public Collection<String> getParentColumns() {
    return parentColumns;
  }

  public ForeignKeyConstraint setParentTable(String parentTable) {
    this.parentTable = parentTable;
    return this;
  }

  public String getParentTable() {
    return parentTable;
  }

  public ForeignKeyConstraint setRely(Boolean rely) {
    this.rely = rely;
    return this;
  }

  public Boolean getRely() {
    return rely;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForeignKeyConstraint that = (ForeignKeyConstraint) o;
    return Objects.equals(childColumns, that.childColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(parentColumns, that.parentColumns)
        && Objects.equals(parentTable, that.parentTable)
        && Objects.equals(rely, that.rely);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name, parentColumns, parentTable, rely);
  }

  @Override
  public String toString() {
    return new ToStringer(ForeignKeyConstraint.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .add("parentColumns", parentColumns)
        .add("parentTable", parentTable)
        .add("rely", rely)
        .toString();
  }
}
