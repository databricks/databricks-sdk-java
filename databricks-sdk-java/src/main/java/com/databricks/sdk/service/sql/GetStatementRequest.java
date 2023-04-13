// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get status, manifest, and result first chunk */
public class GetStatementRequest {
  /** */
  private String statementId;

  public GetStatementRequest setStatementId(String statementId) {
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
    GetStatementRequest that = (GetStatementRequest) o;
    return Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatementRequest.class).add("statementId", statementId).toString();
  }
}
