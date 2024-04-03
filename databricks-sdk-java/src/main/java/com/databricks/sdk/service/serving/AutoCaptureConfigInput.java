// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AutoCaptureConfigInput {
  /**
   * The name of the catalog in Unity Catalog. NOTE: On update, you cannot change the catalog name
   * if it was already set.
   */
  @JsonProperty("catalog_name")
  private String catalogName;

  /**
   * If inference tables are enabled or not. NOTE: If you have already disabled payload logging
   * once, you cannot enable again.
   */
  @JsonProperty("enabled")
  private Boolean enabled;

  /**
   * The name of the schema in Unity Catalog. NOTE: On update, you cannot change the schema name if
   * it was already set.
   */
  @JsonProperty("schema_name")
  private String schemaName;

  /**
   * The prefix of the table in Unity Catalog. NOTE: On update, you cannot change the prefix name if
   * it was already set.
   */
  @JsonProperty("table_name_prefix")
  private String tableNamePrefix;

  public AutoCaptureConfigInput setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public AutoCaptureConfigInput setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public AutoCaptureConfigInput setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public AutoCaptureConfigInput setTableNamePrefix(String tableNamePrefix) {
    this.tableNamePrefix = tableNamePrefix;
    return this;
  }

  public String getTableNamePrefix() {
    return tableNamePrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoCaptureConfigInput that = (AutoCaptureConfigInput) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(tableNamePrefix, that.tableNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, enabled, schemaName, tableNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoCaptureConfigInput.class)
        .add("catalogName", catalogName)
        .add("enabled", enabled)
        .add("schemaName", schemaName)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }
}
