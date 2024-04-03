// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AutoCaptureConfigOutput {
  /** The name of the catalog in Unity Catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** If inference tables are enabled or not. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The name of the schema in Unity Catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  /** */
  @JsonProperty("state")
  private AutoCaptureState state;

  /** The prefix of the table in Unity Catalog. */
  @JsonProperty("table_name_prefix")
  private String tableNamePrefix;

  public AutoCaptureConfigOutput setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public AutoCaptureConfigOutput setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public AutoCaptureConfigOutput setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public AutoCaptureConfigOutput setState(AutoCaptureState state) {
    this.state = state;
    return this;
  }

  public AutoCaptureState getState() {
    return state;
  }

  public AutoCaptureConfigOutput setTableNamePrefix(String tableNamePrefix) {
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
    AutoCaptureConfigOutput that = (AutoCaptureConfigOutput) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(state, that.state)
        && Objects.equals(tableNamePrefix, that.tableNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, enabled, schemaName, state, tableNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoCaptureConfigOutput.class)
        .add("catalogName", catalogName)
        .add("enabled", enabled)
        .add("schemaName", schemaName)
        .add("state", state)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }
}
