// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>TableRowFilter class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TableRowFilter {
  /**
   * The list of table columns to be passed as input to the row filter function. The column types
   * should match the types of the filter function arguments.
   */
  @JsonProperty("input_column_names")
  private Collection<String> inputColumnNames;

  /** The full name of the row filter SQL UDF. */
  @JsonProperty("name")
  private String name;

  /**
   * <p>Setter for the field <code>inputColumnNames</code>.</p>
   *
   * @param inputColumnNames a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.TableRowFilter} object
   */
  public TableRowFilter setInputColumnNames(Collection<String> inputColumnNames) {
    this.inputColumnNames = inputColumnNames;
    return this;
  }

  /**
   * <p>Getter for the field <code>inputColumnNames</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getInputColumnNames() {
    return inputColumnNames;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.TableRowFilter} object
   */
  public TableRowFilter setName(String name) {
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
    TableRowFilter that = (TableRowFilter) o;
    return Objects.equals(inputColumnNames, that.inputColumnNames)
        && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(inputColumnNames, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TableRowFilter.class)
        .add("inputColumnNames", inputColumnNames)
        .add("name", name)
        .toString();
  }
}
