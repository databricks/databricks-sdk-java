// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Batch input for a detection rule. */
@Generated
public class RuleInputBatch {
  /** Custom-notebook user function. The output is used as input data for the rule. */
  @JsonProperty("custom")
  private RuleInputCustomNotebook custom;

  /** SQL query evaluated as the rule input. */
  @JsonProperty("sql")
  private RuleInputBatchSql sql;

  /** SQL warehouse used to run this batch rule. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public RuleInputBatch setCustom(RuleInputCustomNotebook custom) {
    this.custom = custom;
    return this;
  }

  public RuleInputCustomNotebook getCustom() {
    return custom;
  }

  public RuleInputBatch setSql(RuleInputBatchSql sql) {
    this.sql = sql;
    return this;
  }

  public RuleInputBatchSql getSql() {
    return sql;
  }

  public RuleInputBatch setWarehouseId(String warehouseId) {
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
    RuleInputBatch that = (RuleInputBatch) o;
    return Objects.equals(custom, that.custom)
        && Objects.equals(sql, that.sql)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, sql, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleInputBatch.class)
        .add("custom", custom)
        .add("sql", sql)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
