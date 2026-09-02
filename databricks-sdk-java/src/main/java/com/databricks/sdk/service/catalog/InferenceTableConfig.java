// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Inference table configuration for payload logging on a model service.
 *
 * <p>`parent` is always REQUIRED when the sub-message is set; the destination UC schema is needed
 * to construct or rebind the payload TABLE regardless of whether payload logging is currently
 * active. Payload logging is active by default; set `disabled = true` to pause runtime logging
 * without dropping the table or the binding.
 */
@Generated
public class InferenceTableConfig {
  /**
   * True when the bound inference TABLE has been deleted but the parent service still references
   * it. The dangling reference is surfaced (not silently dropped) so callers can see the broken
   * dependency. AI Gateway payload logging fails closed in this state.
   */
  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  /**
   * Parent UC schema where the inference table is created. Format: `schemas/{catalog}.{schema}`.
   * Set at create time and immutable thereafter; changing it on an existing service is rejected.
   */
  @JsonProperty("parent")
  private String parent;

  /** Resolved UC table for payload logs. Format: `tables/{catalog}.{schema}.{table}`. */
  @JsonProperty("table")
  private String table;

  /**
   * Prefix used to form the inference table's registered name. AI Gateway appends `_payload`; for
   * example, `table_name_prefix = "orders"` creates `orders_payload`. If unset, the prefix defaults
   * to the service name. Read `table` from the response for the resolved resource name. Set at
   * create time and immutable thereafter.
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
