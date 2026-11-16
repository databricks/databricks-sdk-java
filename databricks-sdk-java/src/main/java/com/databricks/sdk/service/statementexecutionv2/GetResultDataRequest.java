// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.statementexecutionv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetResultDataRequest {
  /** The zero-based index of the result chunk to fetch. */
  @JsonIgnore private Long chunkIndex;

  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  @JsonIgnore private String statementId;

  /** The ID of the SQL warehouse that ran the statement. */
  @JsonIgnore private String warehouseId;

  public GetResultDataRequest setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public GetResultDataRequest setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public GetResultDataRequest setWarehouseId(String warehouseId) {
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
    GetResultDataRequest that = (GetResultDataRequest) o;
    return Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkIndex, statementId, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetResultDataRequest.class)
        .add("chunkIndex", chunkIndex)
        .add("statementId", statementId)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
