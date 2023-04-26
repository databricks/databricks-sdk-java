// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List functions
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListFunctionsRequest {
  /** Name of parent catalog for functions of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /** Parent schema of functions. */
  @QueryParam("schema_name")
  private String schemaName;

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListFunctionsRequest} object
   */
  public ListFunctionsRequest setCatalogName(String catalogName) {
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

  /**
   * <p>Setter for the field <code>schemaName</code>.</p>
   *
   * @param schemaName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListFunctionsRequest} object
   */
  public ListFunctionsRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemaName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchemaName() {
    return schemaName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFunctionsRequest that = (ListFunctionsRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(schemaName, that.schemaName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListFunctionsRequest.class)
        .add("catalogName", catalogName)
        .add("schemaName", schemaName)
        .toString();
  }
}
