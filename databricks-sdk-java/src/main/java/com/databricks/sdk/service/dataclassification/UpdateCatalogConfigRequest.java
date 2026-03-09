// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateCatalogConfigRequest {
  /**
   * The configuration to apply to the catalog. The name field in catalog_config identifies which
   * resource to update.
   */
  @JsonProperty("catalog_config")
  private CatalogConfig catalogConfig;

  /** Resource name in the format: catalogs/{catalog_name}/config. */
  @JsonIgnore private String name;

  /** Field mask specifying which fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateCatalogConfigRequest setCatalogConfig(CatalogConfig catalogConfig) {
    this.catalogConfig = catalogConfig;
    return this;
  }

  public CatalogConfig getCatalogConfig() {
    return catalogConfig;
  }

  public UpdateCatalogConfigRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateCatalogConfigRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCatalogConfigRequest that = (UpdateCatalogConfigRequest) o;
    return Objects.equals(catalogConfig, that.catalogConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogConfig, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCatalogConfigRequest.class)
        .add("catalogConfig", catalogConfig)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
