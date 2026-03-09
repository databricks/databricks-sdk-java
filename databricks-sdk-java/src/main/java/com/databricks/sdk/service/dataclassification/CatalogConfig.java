// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Data Classification configuration for a Unity Catalog catalog. This message follows the "At Most
 * One Resource" pattern: at most one CatalogConfig exists per catalog. - Full CRUD operations are
 * supported: Create enables Data Classification, Delete disables it - It has no unique identifier
 * of its own and uses its parent catalog's identifier (catalog_name)
 */
@Generated
public class CatalogConfig {
  /**
   * List of auto-tagging configurations for this catalog. Empty list means no auto-tagging is
   * enabled.
   */
  @JsonProperty("auto_tag_configs")
  private Collection<AutoTaggingConfig> autoTagConfigs;

  /**
   * Schemas to include in the scan. Empty list is not supported as it results in a no-op scan. If
   * `included_schemas` is not set, all schemas are scanned.
   */
  @JsonProperty("included_schemas")
  private CatalogConfigSchemaNames includedSchemas;

  /** Resource name in the format: catalogs/{catalog_name}/config. */
  @JsonProperty("name")
  private String name;

  public CatalogConfig setAutoTagConfigs(Collection<AutoTaggingConfig> autoTagConfigs) {
    this.autoTagConfigs = autoTagConfigs;
    return this;
  }

  public Collection<AutoTaggingConfig> getAutoTagConfigs() {
    return autoTagConfigs;
  }

  public CatalogConfig setIncludedSchemas(CatalogConfigSchemaNames includedSchemas) {
    this.includedSchemas = includedSchemas;
    return this;
  }

  public CatalogConfigSchemaNames getIncludedSchemas() {
    return includedSchemas;
  }

  public CatalogConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogConfig that = (CatalogConfig) o;
    return Objects.equals(autoTagConfigs, that.autoTagConfigs)
        && Objects.equals(includedSchemas, that.includedSchemas)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTagConfigs, includedSchemas, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CatalogConfig.class)
        .add("autoTagConfigs", autoTagConfigs)
        .add("includedSchemas", includedSchemas)
        .add("name", name)
        .toString();
  }
}
