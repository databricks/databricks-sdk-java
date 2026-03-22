// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A ColumnSelection function, equivalent to the LAST() record of an entity over a lifetime
 * ContinuousWindow
 */
@Generated
public class ColumnSelection {
  /** Column name from source to select as the feature value. */
  @JsonProperty("column")
  private String column;

  public ColumnSelection setColumn(String column) {
    this.column = column;
    return this;
  }

  public String getColumn() {
    return column;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ColumnSelection that = (ColumnSelection) o;
    return Objects.equals(column, that.column);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnSelection.class).add("column", column).toString();
  }
}
