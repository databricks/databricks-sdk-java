// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Data returned in the query result. */
@Generated
public class ResultData {
  /** Data rows returned in the query. */
  @JsonProperty("data_array")
  private Collection<Collection<String>> dataArray;

  /** Number of rows in the result set. */
  @JsonProperty("row_count")
  private Long rowCount;

  public ResultData setDataArray(Collection<Collection<String>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public Collection<Collection<String>> getDataArray() {
    return dataArray;
  }

  public ResultData setRowCount(Long rowCount) {
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
    ResultData that = (ResultData) o;
    return Objects.equals(dataArray, that.dataArray) && Objects.equals(rowCount, that.rowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataArray, rowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultData.class)
        .add("dataArray", dataArray)
        .add("rowCount", rowCount)
        .toString();
  }
}
