// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

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

  public TableRowFilter setInputColumnNames(Collection<String> inputColumnNames) {
    this.inputColumnNames = inputColumnNames;
    return this;
  }

  public Collection<String> getInputColumnNames() {
    return inputColumnNames;
  }

  public TableRowFilter setName(String name) {
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
    TableRowFilter that = (TableRowFilter) o;
    return Objects.equals(inputColumnNames, that.inputColumnNames)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputColumnNames, name);
  }

  @Override
  public String toString() {
    return new ToStringer(TableRowFilter.class)
        .add("inputColumnNames", inputColumnNames)
        .add("name", name)
        .toString();
  }
}
