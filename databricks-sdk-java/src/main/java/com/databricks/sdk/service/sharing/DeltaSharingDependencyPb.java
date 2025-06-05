// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a UC dependency. */
@Generated
class DeltaSharingDependencyPb {
  @JsonProperty("function")
  private DeltaSharingFunctionDependency function;

  @JsonProperty("table")
  private DeltaSharingTableDependency table;

  public DeltaSharingDependencyPb setFunction(DeltaSharingFunctionDependency function) {
    this.function = function;
    return this;
  }

  public DeltaSharingFunctionDependency getFunction() {
    return function;
  }

  public DeltaSharingDependencyPb setTable(DeltaSharingTableDependency table) {
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
    DeltaSharingDependencyPb that = (DeltaSharingDependencyPb) o;
    return Objects.equals(function, that.function) && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, table);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingDependencyPb.class)
        .add("function", function)
        .add("table", table)
        .toString();
  }
}
