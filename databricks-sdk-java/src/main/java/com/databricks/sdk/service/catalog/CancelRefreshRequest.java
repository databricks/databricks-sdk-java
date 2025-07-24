// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class CancelRefreshRequest {
  /** */
  @JsonIgnore private Long refreshId;

  /**
   * UC table name in format `catalog.schema.table_name`. table_name is case insensitive and spaces
   * are disallowed.
   */
  @JsonIgnore private String tableName;

  public CancelRefreshRequest setRefreshId(Long refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public Long getRefreshId() {
    return refreshId;
  }

  public CancelRefreshRequest setTableName(String tableName) {
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
    CancelRefreshRequest that = (CancelRefreshRequest) o;
    return Objects.equals(refreshId, that.refreshId) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshId, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelRefreshRequest.class)
        .add("refreshId", refreshId)
        .add("tableName", tableName)
        .toString();
  }
}
