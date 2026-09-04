// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for logging request and response payloads to a Unity Catalog inference table. When
 * this configuration is present, payload logging is enabled by default.
 */
@Generated
public class InferenceTableConfig {
  /**
   * Whether the referenced inference table has been deleted. The configuration remains visible so
   * you can identify the broken dependency. Payload logging cannot continue until the table is
   * restored or the configuration is updated.
   */
  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  /**
   * Parent Unity Catalog schema where the inference table is created, in the form
   * `schemas/{catalog}.{schema}`. Required when configuring an inference table. After the inference
   * table is created, this field cannot be changed.
   */
  @JsonProperty("parent")
  private String parent;

  /** Resolved UC table for payload logs. Format: `tables/{catalog}.{schema}.{table}`. */
  @JsonProperty("table")
  private String table;

  /**
   * Prefix used to form the inference table's registered name. AI Gateway appends `_payload`; for
   * example, `table_name_prefix = "orders"` creates `orders_payload`. If unset, the prefix defaults
   * to the service name. Read `table` from the response for the resulting resource name. After the
   * inference table is created, this field cannot be changed.
   */
  @JsonProperty("table_name_prefix")
  private String tableNamePrefix;

  public InferenceTableConfig setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public InferenceTableConfig setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public InferenceTableConfig setTable(String table) {
    this.table = table;
    return this;
  }

  public String getTable() {
    return table;
  }

  public InferenceTableConfig setTableNamePrefix(String tableNamePrefix) {
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
    InferenceTableConfig that = (InferenceTableConfig) o;
    return Objects.equals(isDeleted, that.isDeleted)
        && Objects.equals(parent, that.parent)
        && Objects.equals(table, that.table)
        && Objects.equals(tableNamePrefix, that.tableNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDeleted, parent, table, tableNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(InferenceTableConfig.class)
        .add("isDeleted", isDeleted)
        .add("parent", parent)
        .add("table", table)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }
}
