// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TriggerStateProto {
  /** */
  @JsonProperty("file_arrival")
  private FileArrivalTriggerState fileArrival;

  /** State for SQL condition evaluation, can coexist with other trigger states. */
  @JsonProperty("sql_condition")
  private SqlConditionState sqlCondition;

  /** */
  @JsonProperty("table")
  private TableTriggerState table;

  public TriggerStateProto setFileArrival(FileArrivalTriggerState fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  public FileArrivalTriggerState getFileArrival() {
    return fileArrival;
  }

  public TriggerStateProto setSqlCondition(SqlConditionState sqlCondition) {
    this.sqlCondition = sqlCondition;
    return this;
  }

  public SqlConditionState getSqlCondition() {
    return sqlCondition;
  }

  public TriggerStateProto setTable(TableTriggerState table) {
    this.table = table;
    return this;
  }

  public TableTriggerState getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerStateProto that = (TriggerStateProto) o;
    return Objects.equals(fileArrival, that.fileArrival)
        && Objects.equals(sqlCondition, that.sqlCondition)
        && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileArrival, sqlCondition, table);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerStateProto.class)
        .add("fileArrival", fileArrival)
        .add("sqlCondition", sqlCondition)
        .add("table", table)
        .toString();
  }
}
