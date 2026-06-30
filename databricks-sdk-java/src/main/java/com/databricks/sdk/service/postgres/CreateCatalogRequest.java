// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCatalogRequest {
  /** */
  @JsonProperty("catalog")
  private Catalog catalog;

  /**
   * The ID in the Unity Catalog. It becomes the full resource name, for example "my_catalog"
   * becomes "catalogs/my_catalog".
   */
  @JsonIgnore
  @QueryParam("catalog_id")
  private String catalogId;

  public CreateCatalogRequest setCatalog(Catalog catalog) {
    this.catalog = catalog;
    return this;
  }

  public Catalog getCatalog() {
    return catalog;
  }

  public CreateCatalogRequest setCatalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  public String getCatalogId() {
    return catalogId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCatalogRequest that = (CreateCatalogRequest) o;
    return Objects.equals(catalog, that.catalog) && Objects.equals(catalogId, that.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, catalogId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCatalogRequest.class)
        .add("catalog", catalog)
        .add("catalogId", catalogId)
        .toString();
  }
}
