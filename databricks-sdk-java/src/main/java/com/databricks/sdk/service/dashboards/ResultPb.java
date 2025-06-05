// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ResultPb {
  @JsonProperty("is_truncated")
  private Boolean isTruncated;

  @JsonProperty("row_count")
  private Long rowCount;

  @JsonProperty("statement_id")
  private String statementId;

  public ResultPb setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public ResultPb setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public ResultPb setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResultPb that = (ResultPb) o;
    return Objects.equals(isTruncated, that.isTruncated)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, rowCount, statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultPb.class)
        .add("isTruncated", isTruncated)
        .add("rowCount", rowCount)
        .add("statementId", statementId)
        .toString();
  }
}
