// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A dependency of a SQL object. Either the __table__ field or the __function__ field must be
 * defined.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Dependency {
  /** A function that is dependent on a SQL object. */
  @JsonProperty("function")
  private FunctionDependency function;

  /** A table that is dependent on a SQL object. */
  @JsonProperty("table")
  private TableDependency table;

  /**
   * <p>Setter for the field <code>function</code>.</p>
   *
   * @param function a {@link com.databricks.sdk.service.catalog.FunctionDependency} object
   * @return a {@link com.databricks.sdk.service.catalog.Dependency} object
   */
  public Dependency setFunction(FunctionDependency function) {
    this.function = function;
    return this;
  }

  /**
   * <p>Getter for the field <code>function</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.FunctionDependency} object
   */
  public FunctionDependency getFunction() {
    return function;
  }

  /**
   * <p>Setter for the field <code>table</code>.</p>
   *
   * @param table a {@link com.databricks.sdk.service.catalog.TableDependency} object
   * @return a {@link com.databricks.sdk.service.catalog.Dependency} object
   */
  public Dependency setTable(TableDependency table) {
    this.table = table;
    return this;
  }

  /**
   * <p>Getter for the field <code>table</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.TableDependency} object
   */
  public TableDependency getTable() {
    return table;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dependency that = (Dependency) o;
    return Objects.equals(function, that.function) && Objects.equals(table, that.table);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(function, table);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Dependency.class)
        .add("function", function)
        .add("table", table)
        .toString();
  }
}
