// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a catalog
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetCatalogRequest {
  /** The name of the catalog. */
  private String name;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetCatalogRequest} object
   */
  public GetCatalogRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCatalogRequest that = (GetCatalogRequest) o;
    return Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetCatalogRequest.class).add("name", name).toString();
  }
}
