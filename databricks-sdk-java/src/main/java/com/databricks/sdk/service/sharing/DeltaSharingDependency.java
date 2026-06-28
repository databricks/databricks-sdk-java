// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a UC dependency. */
@Generated
public class DeltaSharingDependency {
  /** */
  @JsonProperty("function")
  private DeltaSharingFunctionDependency function;

  /** */
  @JsonProperty("table")
  private DeltaSharingTableDependency table;

  public DeltaSharingDependency setFunction(DeltaSharingFunctionDependency function) {
    this.function = function;
    return this;
  }

  public DeltaSharingFunctionDependency getFunction() {
    return function;
  }

  public DeltaSharingDependency setTable(DeltaSharingTableDependency table) {
    this.table = table;
    return this;
  }

  public DeltaSharingTableDependency getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingDependency that = (DeltaSharingDependency) o;
    return Objects.equals(function, that.function) && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, table);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingDependency.class)
        .add("function", function)
        .add("table", table)
        .toString();
  }
}
