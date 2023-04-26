// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A table that is dependent on a SQL object.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TableDependency {
  /**
   * Full name of the dependent table, in the form of
   * __catalog_name__.__schema_name__.__table_name__.
   */
  @JsonProperty("table_full_name")
  private String tableFullName;

  /**
   * <p>Setter for the field <code>tableFullName</code>.</p>
   *
   * @param tableFullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.TableDependency} object
   */
  public TableDependency setTableFullName(String tableFullName) {
    this.tableFullName = tableFullName;
    return this;
  }

  /**
   * <p>Getter for the field <code>tableFullName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTableFullName() {
    return tableFullName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableDependency that = (TableDependency) o;
    return Objects.equals(tableFullName, that.tableFullName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(tableFullName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TableDependency.class).add("tableFullName", tableFullName).toString();
  }
}
