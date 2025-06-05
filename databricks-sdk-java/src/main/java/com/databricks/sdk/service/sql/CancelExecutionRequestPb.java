// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Cancel statement execution */
@Generated
class CancelExecutionRequestPb {
  @JsonIgnore private String statementId;

  public CancelExecutionRequestPb setStatementId(String statementId) {
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
    CancelExecutionRequestPb that = (CancelExecutionRequestPb) o;
    return Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelExecutionRequestPb.class)
        .add("statementId", statementId)
        .toString();
  }
}
