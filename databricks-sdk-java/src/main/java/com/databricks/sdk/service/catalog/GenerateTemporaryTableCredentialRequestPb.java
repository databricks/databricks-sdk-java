// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenerateTemporaryTableCredentialRequestPb {
  @JsonProperty("operation")
  private TableOperation operation;

  @JsonProperty("table_id")
  private String tableId;

  public GenerateTemporaryTableCredentialRequestPb setOperation(TableOperation operation) {
    this.operation = operation;
    return this;
  }

  public TableOperation getOperation() {
    return operation;
  }

  public GenerateTemporaryTableCredentialRequestPb setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public String getTableId() {
    return tableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryTableCredentialRequestPb that = (GenerateTemporaryTableCredentialRequestPb) o;
    return Objects.equals(operation, that.operation) && Objects.equals(tableId, that.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, tableId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryTableCredentialRequestPb.class)
        .add("operation", operation)
        .add("tableId", tableId)
        .toString();
  }
}
