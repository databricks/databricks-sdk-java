// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Result {
  /** If result is truncated */
  @JsonProperty("is_truncated")
  private Boolean isTruncated;

  /** Row count of the result */
  @JsonProperty("row_count")
  private Long rowCount;

  /**
   * Statement Execution API statement id. Use [Get status, manifest, and result first
   * chunk](:method:statementexecution/getstatement) to get the full result data.
   */
  @JsonProperty("statement_id")
  private String statementId;

  /** JWT corresponding to the statement contained in this result */
  @JsonProperty("statement_id_signature")
  private String statementIdSignature;

  public Result setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public Result setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public Result setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public Result setStatementIdSignature(String statementIdSignature) {
    this.statementIdSignature = statementIdSignature;
    return this;
  }

  public String getStatementIdSignature() {
    return statementIdSignature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Result that = (Result) o;
    return Objects.equals(isTruncated, that.isTruncated)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(statementIdSignature, that.statementIdSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, rowCount, statementId, statementIdSignature);
  }

  @Override
  public String toString() {
    return new ToStringer(Result.class)
        .add("isTruncated", isTruncated)
        .add("rowCount", rowCount)
        .add("statementId", statementId)
        .add("statementIdSignature", statementIdSignature)
        .toString();
  }
}
