// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateQueryRequest {
  /** */
  @JsonProperty("query")
  private CreateQueryRequestQuery query;

  public CreateQueryRequest setQuery(CreateQueryRequestQuery query) {
    this.query = query;
    return this;
  }

  public CreateQueryRequestQuery getQuery() {
    return query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateQueryRequest that = (CreateQueryRequest) o;
    return Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQueryRequest.class).add("query", query).toString();
  }
}
