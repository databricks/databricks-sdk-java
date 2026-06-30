// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatabaseCatalogRequest {
  /** */
  @JsonProperty("catalog")
  private DatabaseCatalog catalog;

  public CreateDatabaseCatalogRequest setCatalog(DatabaseCatalog catalog) {
    this.catalog = catalog;
    return this;
  }

  public DatabaseCatalog getCatalog() {
    return catalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseCatalogRequest that = (CreateDatabaseCatalogRequest) o;
    return Objects.equals(catalog, that.catalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseCatalogRequest.class).add("catalog", catalog).toString();
  }
}
