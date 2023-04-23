// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListFunctionsResponse {
  /** An array of function information objects. */
  @JsonProperty("schemas")
  private Collection<FunctionInfo> schemas;

  public ListFunctionsResponse setSchemas(Collection<FunctionInfo> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<FunctionInfo> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFunctionsResponse that = (ListFunctionsResponse) o;
    return Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFunctionsResponse.class).add("schemas", schemas).toString();
  }
}
