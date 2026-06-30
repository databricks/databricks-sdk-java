// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TableSummary {
  /** The full name of the table. */
  @JsonProperty("full_name")
  private String fullName;

  /** SecurableKindManifest of table, including capabilities the table has. */
  @JsonProperty("securable_kind_manifest")
  private SecurableKindManifest securableKindManifest;

  /** */
  @JsonProperty("table_type")
  private TableType tableType;

  public TableSummary setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public TableSummary setSecurableKindManifest(SecurableKindManifest securableKindManifest) {
    this.securableKindManifest = securableKindManifest;
    return this;
  }

  public SecurableKindManifest getSecurableKindManifest() {
    return securableKindManifest;
  }

  public TableSummary setTableType(TableType tableType) {
    this.tableType = tableType;
    return this;
  }

  public TableType getTableType() {
    return tableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableSummary that = (TableSummary) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(securableKindManifest, that.securableKindManifest)
        && Objects.equals(tableType, that.tableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, securableKindManifest, tableType);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSummary.class)
        .add("fullName", fullName)
        .add("securableKindManifest", securableKindManifest)
        .add("tableType", tableType)
        .toString();
  }
}
