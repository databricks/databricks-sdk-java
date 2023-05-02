// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List schemas */
@Generated
public class ListSchemasRequest {
  /** Parent catalog for schemas of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  public ListSchemasRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchemasRequest that = (ListSchemasRequest) o;
    return Objects.equals(catalogName, that.catalogName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchemasRequest.class).add("catalogName", catalogName).toString();
  }
}
