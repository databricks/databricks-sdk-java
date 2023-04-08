// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Cancel statement execution */
public class CancelExecutionRequest {
  /** */
  private String statementId;

  public CancelExecutionRequest setStatementId(String statementId) {
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
    CancelExecutionRequest that = (CancelExecutionRequest) o;
    return Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelExecutionRequest.class).add("statementId", statementId).toString();
  }
}
