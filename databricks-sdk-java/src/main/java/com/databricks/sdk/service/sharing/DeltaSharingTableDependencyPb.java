// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Table in UC as a dependency. */
@Generated
class DeltaSharingTableDependencyPb {
  @JsonProperty("schema_name")
  private String schemaName;

  @JsonProperty("table_name")
  private String tableName;

  public DeltaSharingTableDependencyPb setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public DeltaSharingTableDependencyPb setTableName(String tableName) {
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
    DeltaSharingTableDependencyPb that = (DeltaSharingTableDependencyPb) o;
    return Objects.equals(schemaName, that.schemaName) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingTableDependencyPb.class)
        .add("schemaName", schemaName)
        .add("tableName", tableName)
        .toString();
  }
}
