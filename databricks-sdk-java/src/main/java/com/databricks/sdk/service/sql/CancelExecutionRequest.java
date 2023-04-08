// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
}
