// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RequestedResource {
  /** The full Unity Catalog table name. */
  @JsonProperty("table_name")
  private String tableName;

  public RequestedResource setTableName(String tableName) {
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
    RequestedResource that = (RequestedResource) o;
    return Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(RequestedResource.class).add("tableName", tableName).toString();
  }
}
