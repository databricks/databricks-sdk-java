// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListSchemasResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListSchemasResponse {
  /** An array of schema information objects. */
  @JsonProperty("schemas")
  private Collection<SchemaInfo> schemas;

  /**
   * <p>Setter for the field <code>schemas</code>.</p>
   *
   * @param schemas a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ListSchemasResponse} object
   */
  public ListSchemasResponse setSchemas(Collection<SchemaInfo> schemas) {
    this.schemas = schemas;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemas</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SchemaInfo> getSchemas() {
    return schemas;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchemasResponse that = (ListSchemasResponse) o;
    return Objects.equals(schemas, that.schemas);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(schemas);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListSchemasResponse.class).add("schemas", schemas).toString();
  }
}
