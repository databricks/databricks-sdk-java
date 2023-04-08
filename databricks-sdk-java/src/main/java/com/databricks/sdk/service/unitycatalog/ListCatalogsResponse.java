// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListCatalogsResponse {
  /** An array of catalog information objects. */
  @JsonProperty("catalogs")
  private java.util.List<CatalogInfo> catalogs;

  public ListCatalogsResponse setCatalogs(java.util.List<CatalogInfo> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public java.util.List<CatalogInfo> getCatalogs() {
    return catalogs;
  }
}
