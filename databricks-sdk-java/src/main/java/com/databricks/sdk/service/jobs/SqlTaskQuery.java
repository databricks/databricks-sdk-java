// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class SqlTaskQuery {
  /** The canonical identifier of the SQL query. */
  @JsonProperty("query_id")
  private String queryId;

  public SqlTaskQuery setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskQuery that = (SqlTaskQuery) o;
    return Objects.equals(queryId, that.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskQuery.class).add("queryId", queryId).toString();
  }
}
