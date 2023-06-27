// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListSystemSchemasResponse {
  /** An array of system schema information objects. */
  @JsonProperty("schemas")
  private Collection<SystemSchemaInfo> schemas;

  public ListSystemSchemasResponse setSchemas(Collection<SystemSchemaInfo> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<SystemSchemaInfo> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSystemSchemasResponse that = (ListSystemSchemasResponse) o;
    return Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSystemSchemasResponse.class).add("schemas", schemas).toString();
  }
}
