// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetQualityMonitorRequest {
  /**
   * UC table name in format `catalog.schema.table_name`. This field corresponds to the
   * {full_table_name_arg} arg in the endpoint path.
   */
  @JsonIgnore private String tableName;

  public GetQualityMonitorRequest setTableName(String tableName) {
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
    GetQualityMonitorRequest that = (GetQualityMonitorRequest) o;
    return Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQualityMonitorRequest.class).add("tableName", tableName).toString();
  }
}
