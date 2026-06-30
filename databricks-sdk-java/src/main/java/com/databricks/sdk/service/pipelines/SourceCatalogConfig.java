// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** SourceCatalogConfig contains catalog-level custom configuration parameters for each source */
@Generated
public class SourceCatalogConfig {
  /** Postgres-specific catalog-level configuration parameters */
  @JsonProperty("postgres")
  private PostgresCatalogConfig postgres;

  /** Source catalog name */
  @JsonProperty("source_catalog")
  private String sourceCatalog;

  public SourceCatalogConfig setPostgres(PostgresCatalogConfig postgres) {
    this.postgres = postgres;
    return this;
  }

  public PostgresCatalogConfig getPostgres() {
    return postgres;
  }

  public SourceCatalogConfig setSourceCatalog(String sourceCatalog) {
    this.sourceCatalog = sourceCatalog;
    return this;
  }

  public String getSourceCatalog() {
    return sourceCatalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SourceCatalogConfig that = (SourceCatalogConfig) o;
    return Objects.equals(postgres, that.postgres)
        && Objects.equals(sourceCatalog, that.sourceCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postgres, sourceCatalog);
  }

  @Override
  public String toString() {
    return new ToStringer(SourceCatalogConfig.class)
        .add("postgres", postgres)
        .add("sourceCatalog", sourceCatalog)
        .toString();
  }
}
