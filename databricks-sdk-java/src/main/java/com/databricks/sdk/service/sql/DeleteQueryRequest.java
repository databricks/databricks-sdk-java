// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Delete a query */
public class DeleteQueryRequest {
  /** */
  private String queryId;

  public DeleteQueryRequest setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }
}
