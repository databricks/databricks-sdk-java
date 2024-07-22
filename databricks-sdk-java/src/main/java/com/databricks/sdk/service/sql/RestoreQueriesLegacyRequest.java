// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Restore a query */
@Generated
public class RestoreQueriesLegacyRequest {
  /** */
  private String queryId;

  public RestoreQueriesLegacyRequest setQueryId(String queryId) {
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
    RestoreQueriesLegacyRequest that = (RestoreQueriesLegacyRequest) o;
    return Objects.equals(queryId, that.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(RestoreQueriesLegacyRequest.class).add("queryId", queryId).toString();
  }
}
