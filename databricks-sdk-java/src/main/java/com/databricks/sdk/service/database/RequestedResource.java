// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RequestedResource {
  /**
   * The full three-level Unity Catalog name of the database table or synced table, in the form
   * catalog.schema.table.
   */
  @JsonProperty("table_name")
  private String tableName;

  /** */
  @JsonProperty("unspecified_resource_name")
  private String unspecifiedResourceName;

  public RequestedResource setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public RequestedResource setUnspecifiedResourceName(String unspecifiedResourceName) {
    this.unspecifiedResourceName = unspecifiedResourceName;
    return this;
  }

  public String getUnspecifiedResourceName() {
    return unspecifiedResourceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedResource that = (RequestedResource) o;
    return Objects.equals(tableName, that.tableName)
        && Objects.equals(unspecifiedResourceName, that.unspecifiedResourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, unspecifiedResourceName);
  }

  @Override
  public String toString() {
    return new ToStringer(RequestedResource.class)
        .add("tableName", tableName)
        .add("unspecifiedResourceName", unspecifiedResourceName)
        .toString();
  }
}
