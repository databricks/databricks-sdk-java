// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Collection;
import java.util.Objects;

/** The rows of a query result set. */
@Generated
public class ResultData {
  /** Result rows; each row is a list of column values aligned with the manifest columns. */
  @JsonProperty("data_array")
  private Collection<Collection<JsonNode>> dataArray;

  /** Number of rows in the result set. */
  @JsonProperty("row_count")
  private Long rowCount;

  public ResultData setDataArray(Collection<Collection<JsonNode>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public Collection<Collection<JsonNode>> getDataArray() {
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
