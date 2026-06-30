// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListSystemSchemasResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of system schema information objects. */
  @JsonProperty("schemas")
  private Collection<SystemSchemaInfo> schemas;

  public ListSystemSchemasResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

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
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSystemSchemasResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("schemas", schemas)
        .toString();
  }
}
