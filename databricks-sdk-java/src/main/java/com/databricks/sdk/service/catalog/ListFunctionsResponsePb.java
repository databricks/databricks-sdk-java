// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListFunctionsResponsePb {
  @JsonProperty("functions")
  private Collection<FunctionInfo> functions;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListFunctionsResponsePb setFunctions(Collection<FunctionInfo> functions) {
    this.functions = functions;
    return this;
  }

  public Collection<FunctionInfo> getFunctions() {
    return functions;
  }

  public ListFunctionsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFunctionsResponsePb that = (ListFunctionsResponsePb) o;
    return Objects.equals(functions, that.functions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFunctionsResponsePb.class)
        .add("functions", functions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
