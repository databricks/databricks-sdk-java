// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DataframeSplitInputPb {
  @JsonProperty("columns")
  private Collection<Object> columns;

  @JsonProperty("data")
  private Collection<Object> data;

  @JsonProperty("index")
  private Collection<Long> index;

  public DataframeSplitInputPb setColumns(Collection<Object> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<Object> getColumns() {
    return columns;
  }

  public DataframeSplitInputPb setData(Collection<Object> data) {
    this.data = data;
    return this;
  }

  public Collection<Object> getData() {
    return data;
  }

  public DataframeSplitInputPb setIndex(Collection<Long> index) {
    this.index = index;
    return this;
  }

  public Collection<Long> getIndex() {
    return index;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataframeSplitInputPb that = (DataframeSplitInputPb) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(data, that.data)
        && Objects.equals(index, that.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, data, index);
  }

  @Override
  public String toString() {
    return new ToStringer(DataframeSplitInputPb.class)
        .add("columns", columns)
        .add("data", data)
        .add("index", index)
        .toString();
  }
}
