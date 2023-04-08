// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForeignKeyConstraint {
  /** Column names for this constraint. */
  @JsonProperty("child_columns")
  private java.util.List<String> childColumns;

  /** The name of the constraint. */
  @JsonProperty("name")
  private String name;

  /** Column names for this constraint. */
  @JsonProperty("parent_columns")
  private java.util.List<String> parentColumns;

  /** The full name of the parent constraint. */
  @JsonProperty("parent_table")
  private String parentTable;

  public ForeignKeyConstraint setChildColumns(java.util.List<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public java.util.List<String> getChildColumns() {
    return childColumns;
  }

  public ForeignKeyConstraint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ForeignKeyConstraint setParentColumns(java.util.List<String> parentColumns) {
    this.parentColumns = parentColumns;
    return this;
  }

  public java.util.List<String> getParentColumns() {
    return parentColumns;
  }

  public ForeignKeyConstraint setParentTable(String parentTable) {
    this.parentTable = parentTable;
    return this;
  }

  public String getParentTable() {
    return parentTable;
  }
}
