// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.statementexecutionv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetStatementResultRequest {
  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  @JsonIgnore private String statementId;

  /** The ID of the SQL warehouse that ran the statement. */
  @JsonIgnore private String warehouseId;

  public GetStatementResultRequest setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public GetStatementResultRequest setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStatementResultRequest that = (GetStatementResultRequest) o;
    return Objects.equals(statementId, that.statementId)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatementResultRequest.class)
        .add("statementId", statementId)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
