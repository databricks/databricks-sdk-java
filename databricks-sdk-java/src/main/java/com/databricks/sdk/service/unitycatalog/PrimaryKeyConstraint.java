// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class PrimaryKeyConstraint {
  /** Column names for this constraint. */
  @JsonProperty("child_columns")
  private Collection<String> childColumns;

  /** The name of the constraint. */
  @JsonProperty("name")
  private String name;

  public PrimaryKeyConstraint setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public Collection<String> getChildColumns() {
    return childColumns;
  }

  public PrimaryKeyConstraint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrimaryKeyConstraint that = (PrimaryKeyConstraint) o;
    return Objects.equals(childColumns, that.childColumns) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name);
  }

  @Override
  public String toString() {
    return new ToStringer(PrimaryKeyConstraint.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .toString();
  }
}
