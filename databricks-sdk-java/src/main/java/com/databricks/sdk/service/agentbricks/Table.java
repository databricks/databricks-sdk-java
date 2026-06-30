// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentbricks;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Table {
  /** Name of the request column */
  @JsonProperty("request_col")
  private String requestCol;

  /** Optional: Name of the response column if the data is labeled */
  @JsonProperty("response_col")
  private String responseCol;

  /** Full UC table path in catalog.schema.table_name format */
  @JsonProperty("table_path")
  private String tablePath;

  public Table setRequestCol(String requestCol) {
    this.requestCol = requestCol;
    return this;
  }

  public String getRequestCol() {
    return requestCol;
  }

  public Table setResponseCol(String responseCol) {
    this.responseCol = responseCol;
    return this;
  }

  public String getResponseCol() {
    return responseCol;
  }

  public Table setTablePath(String tablePath) {
    this.tablePath = tablePath;
    return this;
  }

  public String getTablePath() {
    return tablePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Table that = (Table) o;
    return Objects.equals(requestCol, that.requestCol)
        && Objects.equals(responseCol, that.responseCol)
        && Objects.equals(tablePath, that.tablePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestCol, responseCol, tablePath);
  }

  @Override
  public String toString() {
    return new ToStringer(Table.class)
        .add("requestCol", requestCol)
        .add("responseCol", responseCol)
        .add("tablePath", tablePath)
        .toString();
  }
}
