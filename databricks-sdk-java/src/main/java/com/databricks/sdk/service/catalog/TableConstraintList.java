// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>TableConstraintList class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TableConstraintList {
  /** List of table constraints. */
  @JsonProperty("table_constraints")
  private Collection<TableConstraint> tableConstraints;

  /**
   * <p>Setter for the field <code>tableConstraints</code>.</p>
   *
   * @param tableConstraints a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.TableConstraintList} object
   */
  public TableConstraintList setTableConstraints(Collection<TableConstraint> tableConstraints) {
    this.tableConstraints = tableConstraints;
    return this;
  }

  /**
   * <p>Getter for the field <code>tableConstraints</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<TableConstraint> getTableConstraints() {
    return tableConstraints;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableConstraintList that = (TableConstraintList) o;
    return Objects.equals(tableConstraints, that.tableConstraints);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(tableConstraints);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TableConstraintList.class)
        .add("tableConstraints", tableConstraints)
        .toString();
  }
}
