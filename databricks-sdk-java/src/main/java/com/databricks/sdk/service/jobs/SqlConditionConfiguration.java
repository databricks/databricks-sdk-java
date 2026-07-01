// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SqlConditionConfiguration {
  /** The ID of the SQL query to evaluate as the trigger condition. */
  @JsonProperty("sql_query_id")
  private String sqlQueryId;

  /**
   * Determines how the SQL query result is interpreted to decide whether the condition fires. Must
   * be set to a recognized value when provided. When unset on an existing serialized configuration,
   * the server preserves the original semantics by interpreting it as `QUERY_RETURNS_ROWS`. New
   * configurations should set this explicitly — explicit `SQL_CONDITION_TRIGGER_MODE_UNSPECIFIED`
   * is rejected at validation.
   */
  @JsonProperty("trigger_mode")
  private SqlConditionTriggerMode triggerMode;

  /** The canonical identifier of the SQL warehouse to run the condition query against. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public SqlConditionConfiguration setSqlQueryId(String sqlQueryId) {
    this.sqlQueryId = sqlQueryId;
    return this;
  }

  public String getSqlQueryId() {
    return sqlQueryId;
  }

  public SqlConditionConfiguration setTriggerMode(SqlConditionTriggerMode triggerMode) {
    this.triggerMode = triggerMode;
    return this;
  }

  public SqlConditionTriggerMode getTriggerMode() {
    return triggerMode;
  }

  public SqlConditionConfiguration setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlConditionConfiguration that = (SqlConditionConfiguration) o;
    return Objects.equals(sqlQueryId, that.sqlQueryId)
        && Objects.equals(triggerMode, that.triggerMode)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sqlQueryId, triggerMode, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlConditionConfiguration.class)
        .add("sqlQueryId", sqlQueryId)
        .add("triggerMode", triggerMode)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
