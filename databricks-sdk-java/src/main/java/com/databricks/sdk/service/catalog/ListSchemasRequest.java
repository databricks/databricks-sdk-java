// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List schemas
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListSchemasRequest {
  /** Parent catalog for schemas of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListSchemasRequest} object
   */
  public ListSchemasRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalogName() {
    return catalogName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchemasRequest that = (ListSchemasRequest) o;
    return Objects.equals(catalogName, that.catalogName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(catalogName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListSchemasRequest.class).add("catalogName", catalogName).toString();
  }
}
