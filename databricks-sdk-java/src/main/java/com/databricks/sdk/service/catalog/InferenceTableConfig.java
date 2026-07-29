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
   * Indicates whether payload logging is disabled (opt-out). Unset means that payload logging is
   * active (the on-by-default state coincides with the proto zero-value, so the server never fills
   * this field for a client that leaves it unset). Set `disabled = true` to pause runtime logging
   * while keeping the sub-message attached (preserving `parent` and `table_name_prefix` for a later
   * flip back to active). `parent` remains required either way.
   */
  @JsonProperty("disabled")
  private Boolean disabled;

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
   * Prefix for the inference-table's UC-registered name. The actual leaf name UC stores is
   * `<table_name_prefix>_payload`; the `_payload` suffix is appended automatically. To find the
   * actual UC table after Create, read the `table` field on the response. Defaults to
   * `<model_service_name>_payload` when unset. Set at create time and immutable thereafter;
   * changing it on an existing service is rejected.
   */
  @JsonProperty("table_name_prefix")
  private String tableNamePrefix;

  public InferenceTableConfig setDisabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  public Boolean getDisabled() {
    return disabled;
  }

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
    return Objects.equals(disabled, that.disabled)
        && Objects.equals(isDeleted, that.isDeleted)
        && Objects.equals(parent, that.parent)
        && Objects.equals(table, that.table)
        && Objects.equals(tableNamePrefix, that.tableNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, isDeleted, parent, table, tableNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(InferenceTableConfig.class)
        .add("disabled", disabled)
        .add("isDeleted", isDeleted)
        .add("parent", parent)
        .add("table", table)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }
}
