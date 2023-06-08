// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListFunctionsResponse {
  /** An array of function information objects. */
  @JsonProperty("functions")
  private Collection<FunctionInfo> functions;

  public ListFunctionsResponse setFunctions(Collection<FunctionInfo> functions) {
    this.functions = functions;
    return this;
  }

  public Collection<FunctionInfo> getFunctions() {
    return functions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFunctionsResponse that = (ListFunctionsResponse) o;
    return Objects.equals(functions, that.functions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFunctionsResponse.class).add("functions", functions).toString();
  }
}
