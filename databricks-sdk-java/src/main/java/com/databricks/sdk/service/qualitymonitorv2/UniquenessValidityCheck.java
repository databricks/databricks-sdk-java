// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UniquenessValidityCheck {
  /** List of column names to check for uniqueness */
  @JsonProperty("column_names")
  private Collection<String> columnNames;

  public UniquenessValidityCheck setColumnNames(Collection<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public Collection<String> getColumnNames() {
    return columnNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UniquenessValidityCheck that = (UniquenessValidityCheck) o;
    return Objects.equals(columnNames, that.columnNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNames);
  }

  @Override
  public String toString() {
    return new ToStringer(UniquenessValidityCheck.class).add("columnNames", columnNames).toString();
  }
}
