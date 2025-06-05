// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AutoCaptureConfigOutputPb {
  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("schema_name")
  private String schemaName;

  @JsonProperty("state")
  private AutoCaptureState state;

  @JsonProperty("table_name_prefix")
  private String tableNamePrefix;

  public AutoCaptureConfigOutputPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public AutoCaptureConfigOutputPb setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public AutoCaptureConfigOutputPb setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public AutoCaptureConfigOutputPb setState(AutoCaptureState state) {
    this.state = state;
    return this;
  }

  public AutoCaptureState getState() {
    return state;
  }

  public AutoCaptureConfigOutputPb setTableNamePrefix(String tableNamePrefix) {
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
    AutoCaptureConfigOutputPb that = (AutoCaptureConfigOutputPb) o;
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
    return new ToStringer(AutoCaptureConfigOutputPb.class)
        .add("catalogName", catalogName)
        .add("enabled", enabled)
        .add("schemaName", schemaName)
        .add("state", state)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }
}
