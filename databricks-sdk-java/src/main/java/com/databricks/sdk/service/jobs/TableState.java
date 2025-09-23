// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TableState {
  /**
   * Whether or not the table has seen updates since either the creation of the trigger or the last
   * successful evaluation of the trigger
   */
  @JsonProperty("has_seen_updates")
  private Boolean hasSeenUpdates;

  /** Full table name of the table to monitor, e.g. `mycatalog.myschema.mytable` */
  @JsonProperty("table_name")
  private String tableName;

  public TableState setHasSeenUpdates(Boolean hasSeenUpdates) {
    this.hasSeenUpdates = hasSeenUpdates;
    return this;
  }

  public Boolean getHasSeenUpdates() {
    return hasSeenUpdates;
  }

  public TableState setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableState that = (TableState) o;
    return Objects.equals(hasSeenUpdates, that.hasSeenUpdates)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasSeenUpdates, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(TableState.class)
        .add("hasSeenUpdates", hasSeenUpdates)
        .add("tableName", tableName)
        .toString();
  }
}
