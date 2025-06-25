// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetStatementResultChunkNRequest {
  /** */
  @JsonIgnore private Long chunkIndex;

  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  @JsonIgnore private String statementId;

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
