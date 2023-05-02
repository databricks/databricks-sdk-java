// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCatalogsResponse {
  /** An array of catalog information objects. */
  @JsonProperty("catalogs")
  private Collection<CatalogInfo> catalogs;

  public ListCatalogsResponse setCatalogs(Collection<CatalogInfo> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public Collection<CatalogInfo> getCatalogs() {
    return catalogs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCatalogsResponse that = (ListCatalogsResponse) o;
    return Objects.equals(catalogs, that.catalogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCatalogsResponse.class).add("catalogs", catalogs).toString();
  }
}
