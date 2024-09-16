// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get refresh */
@Generated
public class GetRefreshRequest {
  /** ID of the refresh. */
  @JsonIgnore private String refreshId;

  /** Full name of the table. */
  @JsonIgnore private String tableName;

  public GetRefreshRequest setRefreshId(String refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public String getRefreshId() {
    return refreshId;
  }

  public GetRefreshRequest setTableName(String tableName) {
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
    GetRefreshRequest that = (GetRefreshRequest) o;
    return Objects.equals(refreshId, that.refreshId) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshId, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRefreshRequest.class)
        .add("refreshId", refreshId)
        .add("tableName", tableName)
        .toString();
  }
}
