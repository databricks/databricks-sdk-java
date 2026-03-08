// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCatalogConfigRequest {
  /** The configuration to create. */
  @JsonProperty("catalog_config")
  private CatalogConfig catalogConfig;

  /** Parent resource in the format: catalogs/{catalog_name} */
  @JsonIgnore private String parent;

  public CreateCatalogConfigRequest setCatalogConfig(CatalogConfig catalogConfig) {
    this.catalogConfig = catalogConfig;
    return this;
  }

  public CatalogConfig getCatalogConfig() {
    return catalogConfig;
  }

  public CreateCatalogConfigRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCatalogConfigRequest that = (CreateCatalogConfigRequest) o;
    return Objects.equals(catalogConfig, that.catalogConfig) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogConfig, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCatalogConfigRequest.class)
        .add("catalogConfig", catalogConfig)
        .add("parent", parent)
        .toString();
  }
}
