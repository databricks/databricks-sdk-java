// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get result chunk by index */
public class GetStatementResultChunkNRequest {
  /** */
  private Long chunkIndex;

  /** */
  private String statementId;

  public GetStatementResultChunkNRequest setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public GetStatementResultChunkNRequest setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStatementResultChunkNRequest that = (GetStatementResultChunkNRequest) o;
    return Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkIndex, statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatementResultChunkNRequest.class)
        .add("chunkIndex", chunkIndex)
        .add("statementId", statementId)
        .toString();
  }
}
