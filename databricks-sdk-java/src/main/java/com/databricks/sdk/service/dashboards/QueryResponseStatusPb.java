// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class QueryResponseStatusPb {
  @JsonProperty("canceled")
  private Empty canceled;

  @JsonProperty("closed")
  private Empty closed;

  @JsonProperty("pending")
  private PendingStatus pending;

  @JsonProperty("statement_id")
  private String statementId;

  @JsonProperty("success")
  private SuccessStatus success;

  public QueryResponseStatusPb setCanceled(Empty canceled) {
    this.canceled = canceled;
    return this;
  }

  public Empty getCanceled() {
    return canceled;
  }

  public QueryResponseStatusPb setClosed(Empty closed) {
    this.closed = closed;
    return this;
  }

  public Empty getClosed() {
    return closed;
  }

  public QueryResponseStatusPb setPending(PendingStatus pending) {
    this.pending = pending;
    return this;
  }

  public PendingStatus getPending() {
    return pending;
  }

  public QueryResponseStatusPb setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public QueryResponseStatusPb setSuccess(SuccessStatus success) {
    this.success = success;
    return this;
  }

  public SuccessStatus getSuccess() {
    return success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryResponseStatusPb that = (QueryResponseStatusPb) o;
    return Objects.equals(canceled, that.canceled)
        && Objects.equals(closed, that.closed)
        && Objects.equals(pending, that.pending)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(success, that.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceled, closed, pending, statementId, success);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryResponseStatusPb.class)
        .add("canceled", canceled)
        .add("closed", closed)
        .add("pending", pending)
        .add("statementId", statementId)
        .add("success", success)
        .toString();
  }
}
