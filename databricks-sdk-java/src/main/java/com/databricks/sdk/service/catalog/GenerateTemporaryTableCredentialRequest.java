// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenerateTemporaryTableCredentialRequest {
  /**
   * The operation performed against the table data, either READ or READ_WRITE. If READ_WRITE is
   * specified, the credentials returned will have write permissions, otherwise, it will be read
   * only.
   */
  @JsonProperty("operation")
  private TableOperation operation;

  /** UUID of the table to read or write. */
  @JsonProperty("table_id")
  private String tableId;

  public GenerateTemporaryTableCredentialRequest setOperation(TableOperation operation) {
    this.operation = operation;
    return this;
  }

  public TableOperation getOperation() {
    return operation;
  }

  public GenerateTemporaryTableCredentialRequest setTableId(String tableId) {
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
    GenerateTemporaryTableCredentialRequest that = (GenerateTemporaryTableCredentialRequest) o;
    return Objects.equals(operation, that.operation) && Objects.equals(tableId, that.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, tableId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryTableCredentialRequest.class)
        .add("operation", operation)
        .add("tableId", tableId)
        .toString();
  }
}
