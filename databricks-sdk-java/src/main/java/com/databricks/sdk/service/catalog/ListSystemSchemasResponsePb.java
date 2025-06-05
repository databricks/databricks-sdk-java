// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListSystemSchemasResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("schemas")
  private Collection<SystemSchemaInfo> schemas;

  public ListSystemSchemasResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSystemSchemasResponsePb setSchemas(Collection<SystemSchemaInfo> schemas) {
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
    ListSystemSchemasResponsePb that = (ListSystemSchemasResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSystemSchemasResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("schemas", schemas)
        .toString();
  }
}
