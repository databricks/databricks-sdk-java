// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Data returned in the query result. */
@Generated
class ResultDataPb {
  @JsonProperty("data_array")
  private Collection<Collection<String>> dataArray;

  @JsonProperty("row_count")
  private Long rowCount;

  public ResultDataPb setDataArray(Collection<Collection<String>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public Collection<Collection<String>> getDataArray() {
    return dataArray;
  }

  public ResultDataPb setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResultDataPb that = (ResultDataPb) o;
    return Objects.equals(dataArray, that.dataArray) && Objects.equals(rowCount, that.rowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataArray, rowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultDataPb.class)
        .add("dataArray", dataArray)
        .add("rowCount", rowCount)
        .toString();
  }
}
