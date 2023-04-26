// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListFunctionsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListFunctionsResponse {
  /** An array of function information objects. */
  @JsonProperty("schemas")
  private Collection<FunctionInfo> schemas;

  /**
   * <p>Setter for the field <code>schemas</code>.</p>
   *
   * @param schemas a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ListFunctionsResponse} object
   */
  public ListFunctionsResponse setSchemas(Collection<FunctionInfo> schemas) {
    this.schemas = schemas;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemas</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<FunctionInfo> getSchemas() {
    return schemas;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFunctionsResponse that = (ListFunctionsResponse) o;
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
    return new ToStringer(ListFunctionsResponse.class).add("schemas", schemas).toString();
  }
}
