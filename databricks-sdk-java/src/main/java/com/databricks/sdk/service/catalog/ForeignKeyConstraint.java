// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ForeignKeyConstraint class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>childColumns</code>.</p>
   *
   * @param childColumns a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ForeignKeyConstraint} object
   */
  public ForeignKeyConstraint setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  /**
   * <p>Getter for the field <code>childColumns</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getChildColumns() {
    return childColumns;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ForeignKeyConstraint} object
   */
  public ForeignKeyConstraint setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>parentColumns</code>.</p>
   *
   * @param parentColumns a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ForeignKeyConstraint} object
   */
  public ForeignKeyConstraint setParentColumns(Collection<String> parentColumns) {
    this.parentColumns = parentColumns;
    return this;
  }

  /**
   * <p>Getter for the field <code>parentColumns</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getParentColumns() {
    return parentColumns;
  }

  /**
   * <p>Setter for the field <code>parentTable</code>.</p>
   *
   * @param parentTable a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ForeignKeyConstraint} object
   */
  public ForeignKeyConstraint setParentTable(String parentTable) {
    this.parentTable = parentTable;
    return this;
  }

  /**
   * <p>Getter for the field <code>parentTable</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getParentTable() {
    return parentTable;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForeignKeyConstraint that = (ForeignKeyConstraint) o;
    return Objects.equals(childColumns, that.childColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(parentColumns, that.parentColumns)
        && Objects.equals(parentTable, that.parentTable);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name, parentColumns, parentTable);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ForeignKeyConstraint.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .add("parentColumns", parentColumns)
        .add("parentTable", parentTable)
        .toString();
  }
}
