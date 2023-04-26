// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListCatalogsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListCatalogsResponse {
  /** An array of catalog information objects. */
  @JsonProperty("catalogs")
  private Collection<CatalogInfo> catalogs;

  /**
   * <p>Setter for the field <code>catalogs</code>.</p>
   *
   * @param catalogs a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ListCatalogsResponse} object
   */
  public ListCatalogsResponse setCatalogs(Collection<CatalogInfo> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogs</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<CatalogInfo> getCatalogs() {
    return catalogs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCatalogsResponse that = (ListCatalogsResponse) o;
    return Objects.equals(catalogs, that.catalogs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(catalogs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListCatalogsResponse.class).add("catalogs", catalogs).toString();
  }
}
