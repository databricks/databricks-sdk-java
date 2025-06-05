// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a query */
@Generated
class DeleteQueriesLegacyRequestPb {
  @JsonIgnore private String queryId;

  public DeleteQueriesLegacyRequestPb setQueryId(String queryId) {
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
    DeleteQueriesLegacyRequestPb that = (DeleteQueriesLegacyRequestPb) o;
    return Objects.equals(queryId, that.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQueriesLegacyRequestPb.class).add("queryId", queryId).toString();
  }
}
