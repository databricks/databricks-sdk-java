// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class TableConstraintList {
  /** List of table constraints. */
  @JsonProperty("table_constraints")
  private Collection<TableConstraint> tableConstraints;

  public TableConstraintList setTableConstraints(Collection<TableConstraint> tableConstraints) {
    this.tableConstraints = tableConstraints;
    return this;
  }

  public Collection<TableConstraint> getTableConstraints() {
    return tableConstraints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableConstraintList that = (TableConstraintList) o;
    return Objects.equals(tableConstraints, that.tableConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableConstraints);
  }

  @Override
  public String toString() {
    return new ToStringer(TableConstraintList.class)
        .add("tableConstraints", tableConstraints)
        .toString();
  }
}
