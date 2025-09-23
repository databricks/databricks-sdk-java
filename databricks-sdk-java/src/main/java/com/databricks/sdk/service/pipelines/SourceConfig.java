// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SourceConfig {
  /** Catalog-level source configuration parameters */
  @JsonProperty("catalog")
  private SourceCatalogConfig catalog;

  public SourceConfig setCatalog(SourceCatalogConfig catalog) {
    this.catalog = catalog;
    return this;
  }

  public SourceCatalogConfig getCatalog() {
    return catalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SourceConfig that = (SourceConfig) o;
    return Objects.equals(catalog, that.catalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog);
  }

  @Override
  public String toString() {
    return new ToStringer(SourceConfig.class).add("catalog", catalog).toString();
  }
}
