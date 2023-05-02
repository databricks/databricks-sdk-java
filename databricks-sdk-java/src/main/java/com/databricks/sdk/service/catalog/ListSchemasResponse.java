// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListSchemasResponse {
  /** An array of schema information objects. */
  @JsonProperty("schemas")
  private Collection<SchemaInfo> schemas;

  public ListSchemasResponse setSchemas(Collection<SchemaInfo> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<SchemaInfo> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchemasResponse that = (ListSchemasResponse) o;
    return Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchemasResponse.class).add("schemas", schemas).toString();
  }
}
