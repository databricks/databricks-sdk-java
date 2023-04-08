// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Restore a query */
public class RestoreQueryRequest {
  /** */
  private String queryId;

  public RestoreQueryRequest setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }
}
