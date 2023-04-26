// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PrimaryKeyConstraint class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PrimaryKeyConstraint {
  /** Column names for this constraint. */
  @JsonProperty("child_columns")
  private Collection<String> childColumns;

  /** The name of the constraint. */
  @JsonProperty("name")
  private String name;

  /**
   * <p>Setter for the field <code>childColumns</code>.</p>
   *
   * @param childColumns a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.PrimaryKeyConstraint} object
   */
  public PrimaryKeyConstraint setChildColumns(Collection<String> childColumns) {
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
   * @return a {@link com.databricks.sdk.service.catalog.PrimaryKeyConstraint} object
   */
  public PrimaryKeyConstraint setName(String name) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrimaryKeyConstraint that = (PrimaryKeyConstraint) o;
    return Objects.equals(childColumns, that.childColumns) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PrimaryKeyConstraint.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .toString();
  }
}
